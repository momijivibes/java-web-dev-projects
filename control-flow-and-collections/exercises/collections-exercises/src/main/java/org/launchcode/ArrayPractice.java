package org.launchcode;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        // Print all elements in the array
        System.out.println("All elements in the array:");
        for (int i : integerArray) {
            System.out.println(i);
        }

        // Print odd numbers in the array
        System.out.println("\nOdd numbers in the array:");
        for (int j = 0; j < integerArray.length; j++) {
            if (integerArray[j] % 2 != 0) {
                System.out.println(integerArray[j]);
            }


        }

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(arrayName));
    }
}