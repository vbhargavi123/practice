package com.cts.training.Assignment1;
import java.util.*;

public class Assignment1_2 {

	public static void main(String[] args) {
		String name = null;
		 String year = null;
		 Scanner sc= new Scanner(System.in);
		 
			while(true)
			{
				int nflag=0;
				int yflag=0;
				 
				System.out.println(" please enter your name");
				
				       name =sc.next();
				       
				System.out.println("  please enter your gradution year ");
				
				year=sc.next();
				
					
				if(year.matches("[0-9]*{4}"))
				 {
					yflag = 0;
				 }
				else {
					System.out.println("invalid year please enter numbers only ");
					yflag = 1;
				}
				
				
				 
				 for (int i = 0; i < name.length(); i++) {
						if (name.matches("[a-zA-Z,@#%&]{4,8}"))
							
						
						{
							
							
							
						}
							
							
						else {
							nflag=1;
							System.out.println("invalid name please enter alphabets or specialcharecters or combination of both only");
							break;
						}
				 }
				 
				 if(nflag==0 && yflag==0) {
					 break;
				 }
				 
			}
			// System.out.println("invalid input");	
			
			System.out.println("my name is " +name +"  and ill graduted in year "+ year);
		 
	     
	}
}


