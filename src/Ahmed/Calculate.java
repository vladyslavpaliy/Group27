package Ahmed;

import java.util.*;
public class Calculate {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter the operator: ");
        char operator = input.next().charAt(0);
        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();
        calculate(num1, operator, num2);



    }

    public static void calculate(double n1, char operator, double n2 ){
        boolean isValid = operator == '*' || operator == '-' || operator == '+' || operator == '/' || operator == '%' ;
        if (!isValid){
            System.err.println("Invalid operator");
        }else{
            switch (operator){
                case '*':
                    System.out.println("Multiplication of "+n1+" and "+n2+" = "+(n1*n2));
                    break;
                case '+':
                    System.out.println("Addition of "+n1+" and "+n2+" = "+(n1+n2));
                    break;
                case '/' :
                    System.out.println("Division of "+n1+" by "+n2+" = "+(n1/n2));
                    break;
                case '-':
                    System.out.println("Subtraction of "+n2+" from "+n1+" = "+(n1-n2));
                    break;
                default:
                    System.out.println("Remainder of the division of "+n1+" by "+n2+" = "+(n1 % n2));
                    break;

            }
        }
    }
}
