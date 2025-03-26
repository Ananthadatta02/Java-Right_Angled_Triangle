package number_patterns;

import java.util.Scanner;

/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
*/
public class Right_Angled_Triangle 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = s.nextInt();
		int num = 1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
	}
}
