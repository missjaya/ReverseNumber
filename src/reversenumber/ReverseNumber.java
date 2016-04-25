/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversenumber;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ReverseNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.print("Enter the number to be reversed : ");
       int input = s.nextInt();
       int result = reverse(input);
       System.out.println("The reversed number is " + result);
   }

   public static int reverse(int n) {
       int result = 0;
       int rem;
       while (n > 0) {
           rem = n % 10;
           n = n / 10;
           result = result * 10 + rem;
       }
       return result;
    }
    
}
