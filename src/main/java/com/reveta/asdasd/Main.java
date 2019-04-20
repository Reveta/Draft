package com.reveta.asdasd;

public class Main {

    private String test;

  public static void main(String[] args) {
    //

      User user = new User("sdads");

    System.out.println(user.toString());

    /*  Qwe qwe = new Qwe();
      Qwe qwe1 = new Qwe();
      Qwe qwe2 = new Qwe();
      Qwe qwe3 = new Qwe();

    System.out.println(qwe.name);
    System.out.println(qwe1.name);

    qwe.name = "dima";

    System.out.println(qwe.name);
    System.out.println(qwe1.name);

    System.out.println(Qwe.age);
    Qwe.age = 26;
    System.out.println(Qwe.age);

    Main.Qwe.age*/
  }

  class Ewq{
      public Ewq() {
          test = "5555dasdasd";
      }
  }

  static class Qwe{
    String name  = " Roman";
    static  int age = 6;

      public Qwe() {

      }

      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

      public static int getAge() {
          return age;
      }

      public static void setAge(int age) {
          Qwe.age = age;
      }
  }
}

