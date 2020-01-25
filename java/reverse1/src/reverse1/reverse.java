package reverse1;

public class reverse 
{
 public static void main(String[] args) 
 {
 int number=2496,reverse=0,rem=0;
 
 while(number!=0) 
 {
	int dig=number%10;
	reverse=reverse*10+rem;
	number=number/10;
 }
 System.out.println("the reverse number is="+reverse);
}
 } 
 
