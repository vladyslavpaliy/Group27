package Ahmed;

import java.util.Scanner;

public class returnMethods2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.next();
        System.out.println("Enter a second string");
        String str2 = input.next();
        //reverseString1(str);
        //String reversed = reverseString2(str);
        //System.out.println("reversed = " + reversed);
        System.out.println(isPalindrome(str, str2));
    }

    /* public static void reverseString1 (String str){
        String result = "";
        for (int i= str.length()-1; i >= 0 ; i--){
            result +=""+ str.charAt(i);
        }
        System.out.println(result);
    } */
     /*public static String reverseString2 (String str){
        String result = "";
        for (int i= str.length()-1; i >= 0 ; i--){
            result +=""+ str.charAt(i);
        }
        return result;
    } */
    public static boolean isPalindrome (String str, String str2){
        String result = "";
        boolean finalResult = true;
        for (int i= str.length()-1; i >= 0 ; i--){
            result +=""+ str.charAt(i);
        }
        if (!result.equalsIgnoreCase(str2)){
            finalResult = false;
        }
        return finalResult;
    }
}
