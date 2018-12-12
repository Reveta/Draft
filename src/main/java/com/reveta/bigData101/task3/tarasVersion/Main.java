package com.reveta.bigData101.task3.tarasVersion;

public class Main {

    public static void main(String[] args) {
        String word = args[0];
        System.out.println(word.substring(
                word.indexOf(".")+1, word.lastIndexOf(".")
        ));
    }
}
