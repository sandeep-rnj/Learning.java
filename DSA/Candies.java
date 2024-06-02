package DSA;

import java.util.Scanner;

class Candies
{
	public static void main (String[] args)
	{
		Scanner Sc= new Scanner(System.in);
		int candies=Sc.nextInt();
		int cousin =Sc.nextInt();
		
		if (candies % cousin == 0)
		{
			
			System.out.println("YES");
		}
		else
		{
				System.out.println("NO");
		}
	}
}
