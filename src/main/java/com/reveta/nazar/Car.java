package com.reveta.nazar;

public abstract class Car {

  protected String name;

  public Car(String name) {
    this.name = name;
  }

  static void drive(){
    System.out.println("123123");
    };

  abstract void  a(String asd);

  abstract int b();

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Car{");
    sb.append("name='").append(name).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
