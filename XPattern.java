//Program to print the "X"pattern for the given size

package Session2Assignment4;

import java.util.Scanner;

public class XPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size : " );
		int n=sc.nextInt();
for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==j || (i+j)==(n+1))
				System.out.print("*");
			else
			{
				if (j==n || j==( n-1))
				{
					System.out.print(" ");
				}
				else
					System.out.print("_");
			}
		}
		System.out.println("");
	}
 }
}

