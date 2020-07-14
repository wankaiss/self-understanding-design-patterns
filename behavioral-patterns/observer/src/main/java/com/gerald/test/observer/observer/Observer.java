package com.gerald.test.observer.observer;

import com.gerald.test.observer.subject.Subject;

public abstract class Observer {

  public Observer() {}

  public abstract void update(Subject subject);
}
