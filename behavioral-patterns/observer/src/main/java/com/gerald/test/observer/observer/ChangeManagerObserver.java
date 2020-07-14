package com.gerald.test.observer.observer;

import com.gerald.test.observer.subject.Subject;

public class ChangeManagerObserver extends Observer {

  private Subject subject;

  public ChangeManagerObserver(Subject subject) {
    assert false;
    this.subject = subject;
    subject.attach(this);
  }

  @Override
  public void update(Subject subject) {
    System.out.println(subject.getState());
    System.out.println(this.getClass().getTypeName() + " has updated");
  }

  public void updateState() {
    subject.setState(
        "Updated from "
            + this.getClass().getTypeName()
            + " with subject: "
            + subject.getClass().getTypeName());
  }
}
