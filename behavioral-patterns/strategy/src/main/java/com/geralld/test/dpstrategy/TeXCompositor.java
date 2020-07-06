package com.geralld.test.dpstrategy;

public class TeXCompositor extends Compositor {

  public TeXCompositor() {}

  @Override
  public String compose() {
    System.out.println("TeXCompositor compose completed");
    return "TeXCompositor compose completed";
  }
}
