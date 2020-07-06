package com.geralld.test.dpstrategy;

public class SimpleCompositor extends Compositor {
  public SimpleCompositor() {}

  @Override
  public String compose() {
    System.out.println("SimpleCompositor compose completed");
    return "SimpleCompositor compose completed";
  }
}
