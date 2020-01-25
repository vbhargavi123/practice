package pattern;
import java.util.Scanner;
public class Pattern
{
public static void main(String args[])
{
int i,j,k,l;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter rows to print pattern");
	int rows=scan.nextInt();
	
	for(i=1;i<=rows;i++)
	{
		for( j=rows;j>rows-1;j--)
		{
			System.out.print("     ");
		}
		for( k=1; k<i;k++)
		{
			System.out.print(k);
		}
		for(l=i;l>=1;l--)
		{
	System.out.print(l);
		}
		System.out.println();
		}
		}
	
		
}

