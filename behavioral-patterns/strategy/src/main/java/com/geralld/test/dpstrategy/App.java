package com.geralld.test.dpstrategy;

public class App {
  public static void main(String[] args) {
    // Test strategy composition
    Composition simpleComposition = new Composition(new SimpleCompositor());
    Composition teXComposition = new Composition(new TeXCompositor());
    Composition arrayComposition = new Composition(new ArrayCompositor());
    simpleComposition.repair();
    teXComposition.repair();
    arrayComposition.repair();
  }
}
