package Day1;

import java.util.Scanner;

public class EvennumLargerDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int a,b, sum=0,diff=0;
		
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter first number:");
		a= s.nextInt();
		
		System.out.println("enter second number:");
		b=s.nextInt();
		
		if(a%2==0 && b%2==0)
		{
			if(a>b)
			{
				
				diff = a-b;
				System.out.println(diff);
			}
			else
			{
				System.out.println("first number is smaller than second number");
			}
			
		
		}
		else
		{
		sum = a+b;
		
		System.out.println(sum);
		}

	}

}
