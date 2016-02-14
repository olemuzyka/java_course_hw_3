package com.company;

public class Main {

    public static void main(String[] args) {
        // fill main array
        int[] mainArray = new int[30];
        for (int i = 0; i < 30; i++) {

            mainArray[i] = i + 1;
        }
        // calculate quantity of even number
        int count = 0;
        for (int x = 0; x < mainArray.length; x++) {
            if (mainArray[x] % 2 == 0) {
                count++;
                // System.out.println(mainArray[x]);
            }

        }
        int[] secondaryArray = new int[count];
        //fill secondary array even numbers
        int y = 0;
        for (int i = 0; i < mainArray.length; i++) {
            if (mainArray[i] % 2 == 0) {
                secondaryArray[y] = mainArray[i];
                y++;
            }
        }
        for (int i : secondaryArray) {
            System.out.println(i);
        }

        //calculate multiply of 3 numbers
        int secondCount = 0;
        for (int i = 0; i < mainArray.length; i++) {
            if (mainArray[i] % 3 == 0) {
                // System.out.println(mainArray[i]);
                secondCount++;
            }

        }
        // fill third array multiply of 3
        int[]thirdArray = new int[secondCount];
        int z = 0;
        for (int i = 0; i < mainArray.length ; i++) {
            if(mainArray[i] % 3 == 0){
                thirdArray[z] = mainArray[i];
                z++;
            }

        }
        for (int i: thirdArray) {
            System.out.println(i);

        }
    }
}
