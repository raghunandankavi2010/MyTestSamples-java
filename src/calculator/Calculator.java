/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Raghunandan
 */
import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // scan for input

        Maths Maths = new Maths(); // Maths class for doing mathematical operations

        double answer=0; // variable to hold the final output
        double inputA, inputB; // input for 2 numbers
        char operator, exit_continue; 
        boolean done = false;

        while (done == false) {

            System.out.println("Weclome!. This is a simple calculator");
            
            System.out.println("Please enter letter e  if you want to quit or letter c to continue: ");
            exit_continue = input.next().charAt(0);
            if (exit_continue == 'e') {
                done = true;
                break;
            } else if (exit_continue == 'c') {

                System.out.print("Please enter your First Input Number: ");
                inputA = input.nextDouble();
                
                System.out.println("+ for addition");
                System.out.println("- for substraction");
                System.out.println("* for multiplication");
                System.out.println("/ for dividion");
                System.out.println("^ for power of");
                System.out.println("% for power of");
                System.out.println("Please enter the operator symbol :");

                operator = input.next().charAt(0);
                System.out.print("Please enter your Second Input Number: ");
                inputB = input.nextDouble();

                switch (operator) {
                    case '+':
                        answer = Maths.add(inputA, inputB);
                        break;
                    case '-':
                        answer = Maths.subtract(inputA, inputB);
                        break;
                    case '*':
                        answer = Maths.multiply(inputA, inputB);
                        break;
                    case '/':
                        answer = Maths.divide(inputA, inputB);
                        break;
                    case '^':
                        answer = Maths.power(inputA, inputB);
                        break;
                    case '%':
                        answer = Maths.remainder(inputA, inputB);
                        break;

                }

                System.out.println("The out put of the operator " + operator + " is " + answer);
            }
        }

        input.close();
        System.exit(0);

    }

}
