package com.zetian.learned.video;

class Twonumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 10, 14};
        int i, j;
        int target = 6;
        for (i = 0; i < numbers.length; i++) {
            for (j = 0; j < numbers.length; j++) {
                if ((numbers[i] + numbers[j]) == target) {
                    System.out.println(numbers[i]+" "+numbers[j]);
                }
            }
        }
    }
}
