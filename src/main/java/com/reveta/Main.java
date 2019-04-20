package com.reveta;

public class Main {
  public static void main(String[] args) {
    //      Field[] declaredFields = Main.class.getFields();

    int[] sort = sort(new int[]{5, 1, 7, 2, 1, 6});

    for (int i = 0; i < sort.length; i++) {
      int i1 = sort[i];
      System.out.println(i1);
    }
  }

  public static int[] sort(int[] input) {

    int inputLength = input.length;
    int temp;
    boolean is_sorted;

    for (int i = 0; i < inputLength; i++) {

      is_sorted = true;

      for (int j = 1; j < (inputLength - i); j++) {

        if (input[j - 1] > input[j]) {
          temp = input[j - 1];
          input[j - 1] = input[j];
          input[j] = temp;
          is_sorted = false;
        }
      }

      if (is_sorted) break;
    }
    return input;
  }
}
