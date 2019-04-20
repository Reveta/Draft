package com.reveta.dima;

import java.util.stream.Stream;

public class Main {

    static void method(int a) {
        System.out.println("method1");
    }

    static void method(double a, int b) {
        System.out.println("method2");
        ++a;
    }

    public static void main(String[] args) {
        double a = 17;
        System.out.println("a = {0} \n" + a);
        method(a, 5);
        System.out.println("a = "  + a);
    }
}
