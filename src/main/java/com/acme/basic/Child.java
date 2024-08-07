package com.acme.basic;

public class Child {

  private class Season {

  }

  private class Color {

  }

  public class Fruit {
    protected Season ripe;
    protected Color flesh;

    // ...
  }

  public class Raspberry extends Fruit {
    private boolean ripe; // Noncompliant
    private static Color FLESH; // Noncompliant
  }

}
