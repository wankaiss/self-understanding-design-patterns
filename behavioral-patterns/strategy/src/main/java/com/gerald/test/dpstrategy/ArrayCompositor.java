package com.gerald.test.dpstrategy;

public class ArrayCompositor extends Compositor {

  public ArrayCompositor() {}

  @Override
  public String compose() {
    System.out.println("ArrayCompositor compose completed");
    return "ArrayCompositor compose completed";
  }
}
