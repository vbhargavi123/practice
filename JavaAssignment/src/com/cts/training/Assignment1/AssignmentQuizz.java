package com.cts.training.Assignment1;
import java.util.Scanner;

public class AssignmentQuizz {
	
	public static void main( String[] args) {
	
        int question1;
        int question2;
        int question3;
        int count=0;
        
        boolean choice;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("do you want to play the quiz!? type true or false");
        choice= scan.nextBoolean();
        
        if(choice) {
            System.out.println(" here it comes \n ");
            
       
            System.out.println("Q1) What is the capital of India?");

        
            System.out.println("1) Delhi\r\n" + 
            		"2) Mumbai\r\n" + 
            		"3) Chennai\r\n" + 
            		"");
                            question1 = scan.nextInt();


            if(question1 == 1) {
                
                System.out.println("Congrats your answer is correct");
                question1++;
                count++;
            }
            else{
            	System.out.println("Your answer is incorrect. Delhi is the right answer .");
            }
            
           
            System.out.println("Q2) Can you store the value \"dog\" in a variable of type int?");

     
            System.out.println("1) yes\r\n" + "2) no\r\n" + "");
            question2 = scan.nextInt();

            if (question2 == 2) {
            	System.out.println("Congrate you answer is correct ");
                question2++;
                count++;
            }
            else{
            	System.out.println("Your answer is incorrect. No is the right answer.");
            }  
            
         
            System.out.println("Q3) What is the result of 9+9/3?");
            System.out.println("1) 5\r\n" + 
            		"2) 12\r\n" + 
            		"3) 15/3\r\n" + 
            		"");
            question3= scan.nextInt();


            if (question3 == 2) {
            	System.out.println("Congrats your answer is correct\n");
                question3++;
                count++;
            }
            else{
            	System.out.println("Your answer is incorrect. 12 is the right answer.\n");
            }
            System.out.println(" your score is " + count +" out of 3\n");
            System.out.println(" Thanks for playing (^_^)");
        }
        else {
        	System.out.println("Bye bye");
        }
      
		
	}

}



