package Ahmed;

import java.util.*;

public class MinMaxArraysMethods {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size or the FIRST Array : ");
        int sizeArr = input.nextInt();
        int[] array1 = new int[sizeArr];
        System.out.println("Please enter the size or the SECOND Array : ");
        sizeArr = input.nextInt();
        int[] array2 = new int[sizeArr];
        System.out.println("Please fill out the FIRST array");
        for (int i = 0; i <= array1.length - 1; i++) {
            System.out.println("Enter an Integer");
            array1[i] = input.nextInt();
        }
        System.out.println("Please fill out the SECOND array");
        for (int i = 0; i <= array2.length - 1; i++) {
            System.out.println("Enter an Integer");
            array1[i] = input.nextInt();
        }


        finMaxIn2Arrays(array1, array2);
        finMinIn2Arrays(array1, array2);

    }

    public static void finMaxIn2Arrays(int[] arr1, int[] arr2) {
        int max = arr1[0];
        for (int each : arr1) {
            for (int element : arr2) {
                if (max < element) {
                    max = element;
                }
            }
            if (max < each) {
                max = each;
            }
        }
        System.out.println("Max number in two arrays is: " + max);
       /* Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (arr1[arr1.length-1] > arr2[arr2.length-1]){
            System.out.println(arr1[arr1.length-1]);
        }else
            System.out.println("The max number in the two arrays is : "+arr2[arr2.length-1]); */
    }

    public static void finMinIn2Arrays(int[] arr1, int[] arr2) {
        int min = arr1[0];
        for (int each : arr1) {
            for (int element : arr2) {
                if (min > element) {
                    min = element;
                }
            }
            if (min > each) {
                min = each;
            }
        }
        System.out.println("Min number in two arrays is: " + min);
      /*  if (arr1[0] < arr2[0]){
            System.out.println("The min number is the two arrays is : "+arr1[0]);
        }else
            System.out.println("The min number in the two arrays is : "+arr2[0]); */
    }
}

