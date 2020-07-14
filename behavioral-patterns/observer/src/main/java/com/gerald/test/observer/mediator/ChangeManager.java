package com.gerald.test.observer.mediator;

import com.gerald.test.observer.observer.Observer;
import com.gerald.test.observer.subject.Subject;

import java.util.ArrayList;
import java.util.List;

// Mediator Pattern integrated with Observer Pattern
public abstract class ChangeManager {

  List<Subject> subjects = new ArrayList<>();

  public abstract void register(Subject subject, Observer observer);

  public abstract void deregister(Subject subject, Observer observer);

  public abstract void mediatorNotify();

  public void ignoreIfExisted(Subject subject) {
    if (!subjects.contains(subject)) {
      subjects.add(subject);
    }
  }
}
