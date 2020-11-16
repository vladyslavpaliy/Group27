package gourpLibrary;

import java.util.Arrays;

public class ArraysUtility {
    // find max in an array and returns an int maximum
    public static int max(int[] arr) {
        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    // find the min in an array and returns an int minimum
    public static int min(int[] arr) {
        int min = arr[0];

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }

    // Takes two arrays and return one by combining the two given arrays
    public static int[] combineTwoArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;

        for (int each : arr1) {
            arr3[i++] = each;
        }

        for (int each : arr2) {
            arr3[i++] = each;
        }

        return arr3;
    }

    // sort an array in decending Order
    public static int[] sortDecend(int[] arr) {  // {3,4,1,2}
        Arrays.sort(arr);  // sorting the array {1, 2, 3, 4}
        int[] reversedArray = new int[arr.length]; // creating a new array with the same size of the intial array
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }

    // Print Array with { instead of [
    public static String printArray(int[] arr) {
        String str = Arrays.toString(arr);
        str = str.replace("[", "{").replace("]", "}");
        return str;
    }
}
