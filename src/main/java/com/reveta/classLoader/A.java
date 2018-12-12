package com.reveta.classLoader;

import java.util.Arrays;

public class A {
    public void test() throws ClassNotFoundException {
        Class<?> b = B.class.getClassLoader().loadClass("com.reveta.classLoader.B");
        Arrays.asList(b.getMethods()).forEach(System.out::println);
    }
}
