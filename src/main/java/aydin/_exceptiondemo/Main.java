/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aydin._exceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author soblab
 */
public class Main {
   public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int num1 = 0, num2 = 0 , result = 0; 
     System.out.print("ENTER TWO NUMBERS: ");

     
     try {
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        result = num1 / num2;        
     }        
     catch (InputMismatchException ime) {
        System.out.println(num1 + "  and " + num2 + " must be numbers!");        
     }
     catch (ArithmeticException ae) {
        System.out.println(num2 + " cannot be zero!");        
     }
     catch (Exception e) {
        System.out.println("some other exception happened");        
     }
     System.out.println("Result is: " + result);
     
  }
}
