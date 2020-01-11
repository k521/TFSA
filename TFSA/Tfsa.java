/*
*   This file contains the class for the Tax-free savings account calculator. Will calculate how much you can contribute to your TFSA account as of 2020.
*   Author: Kent Huang
*   Last update: January 2020
*
*/
package TFSA;
import java.util.Scanner;

public class Tfsa{
    

    public static void run(){
        System.out.println("Welcome to the TFSA calculator");


        int[] arr;
        arr = new int[12];
        arr[0] = 5000;
        arr[1] = 5000;
        arr[2] = 5000;
        arr[3] = 5000;
        arr[4] = 5500;
        arr[5] = 5500;
        arr[6] = 10000;
        arr[7] = 5500;
        arr[8] = 5500;
        arr[9] = 5500;
        arr[10] = 6000;
        arr[11] = 6000;

        
        Scanner in = new Scanner(System.in);
        int choice = 0;
        boolean works = false;
        System.out.println("In what year did you turn 18?");
        try {
            choice = in.nextInt();    
        } catch (Exception e) {
            System.out.println("Please enter a number!");
            System.exit(0);
        }

       
        works = true;
     
        if(works){
            if(choice > 2020){
                System.out.println("You are not ready to put money into your TFSA!");
                System.exit(0);
            }
            if(choice < 2010){
                int total = 63500;
                System.out.println("How much have you contributed to your TFSA so far?");
                Scanner soFar = new Scanner(System.in);
                int contributed = 0;

                try {
                    contributed = soFar.nextInt();    
                } catch (Exception e) {
                    System.out.println("Please enter a number! Assuming you have contributed none, you may contribute $" + total + " this year.");
                    System.exit(0);
                }

                total = total - contributed;
                System.out.println("You can contribute $" + total + " this year");
                
            }

            else{
                int years = 2020 - choice;
                int total = 0;
                for(int i = 11; i > 11 - years - 1; i--){
                    total += arr[i];
                }
                System.out.println("How much have you contributed to your TFSA so far?");
                Scanner soFar = new Scanner(System.in);
                int contributed = 0;

                try {
                    contributed = soFar.nextInt();    
                } catch (Exception e) {
                    System.out.println("Please enter a number! Assuming you have contributed none, you may contribute $" + total + " this year.");
                    System.exit(0);
                }

                total = total - contributed;
                System.out.println("You can contribute $" + total + " this year");
                
            }
        }
            
    }





    
}


