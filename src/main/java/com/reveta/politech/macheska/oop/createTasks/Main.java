package com.reveta.politech.macheska.oop.createTasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    static Integer[] inputArr = new Integer[8];

    public static void main(String[] args) {

        inputArr[0] = 3;

        for (int i = 0; i < 7; i++) {
            inputArr[i + 1] = next(inputArr[i]);
        }

        System.out.println(Arrays.toString(inputArr));
        System.out.println(inputArr[7] + " - 7 element");
        System.out.println(Stream.of(inputArr).reduce((a, b) -> a + b) + " - sum");
    }

    static int next(int f){
        return f * 5;
    }

}
