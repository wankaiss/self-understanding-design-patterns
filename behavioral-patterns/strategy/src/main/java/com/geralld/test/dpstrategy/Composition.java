package com.geralld.test.dpstrategy;

public class Composition {

  private Compositor compositor;

  public Composition(Compositor compositor) {
    this.compositor = compositor;
  }

  public void repair() {
    compositor.compose();
  }
}
