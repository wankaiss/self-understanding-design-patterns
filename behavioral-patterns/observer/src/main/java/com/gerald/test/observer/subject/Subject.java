package com.gerald.test.observer.subject;

import com.gerald.test.observer.mediator.ChangeManager;
import com.gerald.test.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
  private static String state = "This is common state";

  public void setState(String updatedState) {
    state = updatedState;
    notifying();
  }

  public String getState() {
    return state;
  }

  public List<Observer> observers = new ArrayList<>();
  protected ChangeManager changeManager;

  public Subject() {}

  public abstract void attach(Observer observer);

  public abstract void detach(Observer observer);

  public void notifying() {
    if (changeManager != null) {
      changeManager.mediatorNotify();
    } else {
      for (Observer observer : observers) {
        observer.update(this);
      }
    }
  }
}
