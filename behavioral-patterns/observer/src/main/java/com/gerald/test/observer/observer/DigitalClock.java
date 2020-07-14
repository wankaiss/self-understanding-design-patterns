package com.gerald.test.observer.observer;

import com.gerald.test.observer.subject.Subject;

public class DigitalClock extends Observer {

  private Subject subject;

  // Use Mediator pattern
  public DigitalClock(Subject subject) {
    subject.attach(this);
    this.subject = subject;
  }

  @Override
  public void update(Subject subject) {
    System.out.println(subject.getState());
    System.out.println(this.getClass().getTypeName() + " has updated");
  }

  public void updateState() {
    subject.setState(
            "subject.state: Updated from "
                    + this.getClass().getTypeName()
                    + " with subject: "
                    + subject.getClass().getTypeName());
  }
}
