package Ahmed;

import java.util.Scanner;

public class sumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter 3 numbers : ");
        sumOf3Numbers(input.nextInt(), input.nextInt(), input.nextInt());

    }
    public static void sumOf3Numbers(int n1, int n2, int n3){
        System.out.println("Sum is: "+(n1+n2+n3));
    }
}
