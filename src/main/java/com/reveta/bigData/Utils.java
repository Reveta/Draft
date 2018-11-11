package com.reveta.bigData;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Utils {
    public static final String RESET = "\u001b[0m";
    public static final String BLACK = "\u001b[30m";
    public static final String RED = "\u001b[31m";
    public static final String GREEN = "\u001b[32m";
    public static final String YELLOW = "\u001b[33m";
    public static final String BLUE = "\u001b[34m";
    public static final String PURPLE = "\u001b[35m";
    public static final String CYAN = "\u001b[36m";
    public static final String WHITE = "\u001b[37m";

    public Utils() {
    }

    public static void main(String[] args) {
        System.out.println("com.Utils lib Reveta");
    }

    public static int scanInt() {
        try {
            int nextInt = (new Scanner(System.in)).nextInt();
            return nextInt;
        } catch (InputMismatchException var1) {
            System.out.println("System working only with int number");
            return scanInt();
        }
    }

    public static String scanStr() {
        try {
            return (new Scanner(System.in)).next();
        } catch (InputMismatchException var1) {
            System.out.println("System working only with String");
            return scanStr();
        }
    }

    public static void sout() {
        System.out.print(" ");
    }

    public static void sout(int num) {
        System.out.print(num);
    }

    public static void sout(String word) {
        System.out.print(word);
    }

    public static void sout(int[] array) {
        int[] var1 = array;
        int var2 = array.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int num = var1[var3];
            System.out.print(num + ", ");
        }

    }

    public static void sout(List<Object> list) {
        Iterator var1 = list.iterator();

        while(var1.hasNext()) {
            Object num = var1.next();
            System.out.print(num + ", ");
        }

    }

    public static void soutNL() {
        System.out.println(" ");
    }

    public static void soutNL(int num) {
        System.out.println(num);
    }

    public static void soutNL(String word) {
        System.out.println(word);
    }

    public static void soutNL(int[] array) {
        int[] var1 = array;
        int var2 = array.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int num = var1[var3];
            System.out.println(num);
        }

    }

    public static void soutNL(List<Object> list) {
        Iterator var1 = list.iterator();

        while(var1.hasNext()) {
            Object num = var1.next();
            System.out.println(num + " ");
        }

    }
}
