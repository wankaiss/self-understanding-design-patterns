package com.gerald.test.observer.subject;

import com.gerald.test.observer.observer.Observer;
import com.gerald.test.observer.mediator.ChangeManager;

public class ClockTimer extends Subject {

  public ClockTimer() {
    new ClockTimer(null);
  }

  public ClockTimer(ChangeManager changeManager) {
    this.changeManager = changeManager;
  }

  int getHour() {
    return 0;
  }

  int getMinutes() {
    return 0;
  }

  int getSeconds() {
    return 0;
  }

  void tick() {
    notifying();
  }

  @Override
  public void attach(Observer observer) {
    if (changeManager != null) {
      changeManager.register(this, observer);
    } else {
      observers.add(observer);
    }
    notifying();
  }

  @Override
  public void detach(Observer observer) {
    observers.remove(observer);
  }
}
