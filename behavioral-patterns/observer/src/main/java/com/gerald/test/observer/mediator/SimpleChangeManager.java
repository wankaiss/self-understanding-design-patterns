package com.gerald.test.observer.mediator;

import com.gerald.test.observer.observer.Observer;
import com.gerald.test.observer.subject.Subject;

public class SimpleChangeManager extends ChangeManager {

  @Override
  public void register(Subject subject, Observer observer) {
    subject.observers.add(observer);
    //    subject.attach(observer);
    ignoreIfExisted(subject);
  }

  @Override
  public void deregister(Subject subject, Observer observer) {
    subject.observers.remove(observer);
    //    subject.detach(observer);
  }

  @Override
  public void mediatorNotify() {
    for (Subject subject : subjects) {
      System.out.println("==================================");
      System.out.println(subject.getClass().getTypeName() + " is updating");
      subject.observers.forEach(observer -> observer.update(subject));
      System.out.println(subject.getClass().getTypeName() + " update completed");
    }
  }
}
