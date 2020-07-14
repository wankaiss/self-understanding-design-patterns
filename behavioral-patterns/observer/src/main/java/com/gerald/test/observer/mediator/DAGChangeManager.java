package com.gerald.test.observer.mediator;

import com.gerald.test.observer.observer.Observer;
import com.gerald.test.observer.subject.Subject;

public class DAGChangeManager extends ChangeManager {
  @Override
  public void register(Subject subject, Observer observer) {
    System.out.println(
        "-------> registering observer: "
            + observer.getClass().getTypeName()
            + " with subject: "
            + subject.getClass().getTypeName() + " <----------");
    subject.observers.add(observer);
    ignoreIfExisted(subject);
  }

  @Override
  public void deregister(Subject subject, Observer observer) {
    subject.observers.remove(observer);
  }

  @Override
  public void mediatorNotify() {
    for (Subject subject : subjects) {
      System.out.println(
          subject.getClass().getTypeName() + " is updating in " + this.getClass().getTypeName());
      subject.observers.forEach(observer -> observer.update(subject));
      System.out.println(
          subject.getClass().getTypeName()
              + " update completed in "
              + this.getClass().getTypeName());
      System.out.println("==================================");
    }
  }
}
