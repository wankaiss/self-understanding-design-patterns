package com.gerald.test.observer.subject;

import com.gerald.test.observer.mediator.ChangeManager;
import com.gerald.test.observer.observer.Observer;

public class AnalogClockTimer extends Subject {

  public AnalogClockTimer() {
    new AnalogClockTimer(null);
  }

  // Also add some of AnalogClockTimer context
  public AnalogClockTimer(ChangeManager changeManager) {
    this.changeManager = changeManager;
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
    if (changeManager != null) {
      changeManager.register(this, observer);
    } else {
      observers.remove(observer);
    }
  }
}
