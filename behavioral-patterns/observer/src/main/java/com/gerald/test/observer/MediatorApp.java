package com.gerald.test.observer;

import com.gerald.test.observer.mediator.ChangeManager;
import com.gerald.test.observer.mediator.DAGChangeManager;
import com.gerald.test.observer.observer.AnalogClock;
import com.gerald.test.observer.observer.ChangeManagerAnotherObserver;
import com.gerald.test.observer.observer.ChangeManagerObserver;
import com.gerald.test.observer.observer.DigitalClock;
import com.gerald.test.observer.subject.AnalogClockTimer;
import com.gerald.test.observer.subject.ChangeManagerSubject;
import com.gerald.test.observer.subject.ClockTimer;
import com.gerald.test.observer.subject.Subject;

public class MediatorApp {
  public static void main(String[] args) {
    // Making sure Subject state is self-consistent before notification. You can avoid this pitfall
    // by sending notifications from template methods (Template Method (325)) in abstract Subject
    // classes.
    ChangeManager dagChangeManager = new DAGChangeManager();
    Subject changeManagerSubject = new ChangeManagerSubject(dagChangeManager);
    AnalogClockTimer analogClockTimer = new AnalogClockTimer(dagChangeManager);
    ClockTimer clockTimer = new ClockTimer(dagChangeManager);

    ChangeManagerObserver changeManagerObserver = new ChangeManagerObserver(changeManagerSubject);
    ChangeManagerAnotherObserver changeManagerAnotherObserver =
        new ChangeManagerAnotherObserver(changeManagerSubject);

    DigitalClock digitalClock = new DigitalClock(clockTimer);
    digitalClock.updateState();
//    AnalogClock analogClock = new AnalogClock(analogClockTimer);
  }
}
