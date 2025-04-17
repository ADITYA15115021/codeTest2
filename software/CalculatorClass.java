package software;

import java.util.Scanner;

public class CalculatorClass{
   
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        while(flag){
            System.out.println("1.ADDITION");
            System.out.println("2.SUBTRACTION");
            System.out.println("3.DIVISION");
            System.out.println("4.MULTIPLICATION");
            System.out.println("5.EXIT");
            System.out.print("SELECT AN OPTION: ");
            int x = sc.nextInt();
            switch (x) {
                case 1: calculate("+"); break;
                case 2: calculate("-"); break;
                case 3: divide(); break;
                case 4: calculate("*"); break;
                case 5: flag = false; break;
                default: System.out.print("ENTER A VALID OPTION! "); break;
            }

    }
             
    }

    public static void calculate(String op) {
        System.out.print("ENTER FIRST NUMBER: ");
        int num1 = sc.nextInt();  
        System.out.print("ENTER SECOND NUMBER: ");
        int num2 = sc.nextInt();
    
        switch (op) {
            case "+": System.out.println(num1 + num2); break;
            case "-": System.out.println(num1 - num2); break;
            case "*": System.out.println(num1 * num2); break;
            default:System.out.println("INCORRECT OPERATION!");
        }
    }

    public static void divide(){
        System.out.println("ENTER THE DIVIDEND: ");
        int dividend = sc.nextInt();
        System.out.println("ENTER THE DIVISOR: ");
        int divisor = sc.nextInt();

        if( divisor == 0 ){
            System.out.println("CAN'T DIVIDE BY 0!");
            return;
        }

        System.out.println(dividend/divisor);
    }
    

}

