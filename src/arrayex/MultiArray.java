package arrayex;

import java.util.Scanner;

public class MultiArray
{

	public static void main(String[] args) 
	{
		int a[][]=new int[4][4];
		System.out.println("Enter array elements");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)//row
		{
			for(int j=0;j<4;j++)  //columns
			{
				a[i][j]=sc.nextInt(); 
			}
		}
		System.out.println("Matrix\n");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
		

	}

}
