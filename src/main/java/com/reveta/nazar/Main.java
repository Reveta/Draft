package com.reveta.nazar;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    int i = 0;
    int i1 = ++i + ++i + ++i;
    System.out.println(i1);
  }

  private static void claa(){
    BMW bmw = new BMW();
  }

  private void old(){
    int a = 1;
    String b = "das";
    String c = new String("das");


    List<Integer> list = new ArrayList<Integer>();


    AudiR8 car = new AudiR8("asdd");
    car.a("das");
//    AudiR8.drive();


    Object[] arr = new AudiR8[5];

    arr[1] = new AudiR8("13");
    arr[2] = new BMW();
  }
}
