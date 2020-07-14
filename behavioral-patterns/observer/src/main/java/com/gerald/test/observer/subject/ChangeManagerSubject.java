package com.gerald.test.observer.subject;

import com.gerald.test.observer.observer.Observer;
import com.gerald.test.observer.mediator.ChangeManager;

public class ChangeManagerSubject extends Subject {

  public ChangeManagerSubject(ChangeManager changeManager) {
    this.changeManager = changeManager;
  }

  @Override
  public void attach(Observer observer) {
    changeManager.register(this, observer);
    notifying();
  }

  @Override
  public void detach(Observer observer) {
    changeManager.deregister(this, observer);
  }
}
