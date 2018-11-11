package com.reveta.nazar;

public class AudiR8 extends Car {

  private Door door;

  public AudiR8(String name) {
    super(name);
    door = new Door(5);
    System.out.println("Start");
  }

  static void drive() {
    System.out.println("qweeqw");
  }

  @Override
  public void a(String asd) {
  }

  @Override
  public int b() {
    return 0;
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }
}
