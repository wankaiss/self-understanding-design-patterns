package com.gerald.test.observer.observer;

import com.gerald.test.observer.subject.Subject;

public class AnalogClock extends Observer {

  private Subject subject;

  public AnalogClock(Subject subject) {
    subject.attach(this);
    this.subject = subject;
  }

  @Override
  public void update(Subject subject) {
    System.out.println(subject.getState());
    draw();
  }

  public void updateState() {
    subject.setState(
            "subject.state: Updated from "
                    + this.getClass().getTypeName()
                    + " with subject: "
                    + subject.getClass().getTypeName());
  }

  void draw() {
    System.out.println(this.getClass().getTypeName() + " has updated");
  }
}
