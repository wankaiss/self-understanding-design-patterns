package com.gerald.test.observer;

import com.gerald.test.observer.observer.AnalogClock;
import com.gerald.test.observer.observer.DigitalClock;
import com.gerald.test.observer.subject.AnalogClockTimer;
import com.gerald.test.observer.subject.ClockTimer;

public class App {
  public static void main(String[] args) {
    ClockTimer clockTimer = new ClockTimer();
    AnalogClockTimer analogClockTimer = new AnalogClockTimer();
    DigitalClock digitalClock = new DigitalClock(analogClockTimer);
    AnalogClock analogClock = new AnalogClock(analogClockTimer);
    analogClock.updateState();
  }
}
