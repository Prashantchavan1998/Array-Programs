package arrayex;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int n=sc.nextInt();
		int a[]=new int[n+1];
		System.out.println("Elemnt of Array are: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elemement are: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Sorted array is:");
		Arrays.sort(a);
//		for(int i:a)
//		{
//			System.out.println(i+" ");
//		}
		for(int i=0;i<n+1;i++)
		{
			System.out.println(a[i]);
		}
//		int ch=n;
//		System.out.println("Enter Your Choice: \n 1.Insert the Element in array :");
//		do
//		{
//		switch(ch)
//		{
//		case 1:
			int index,element;
			System.out.println("Insert the element in array");
			System.out.println("Enter the Index ");
			index=sc.nextInt();
			System.out.println("Enter the element:");
			element=sc.nextInt();
							
			for(int i=(n-1);i>(index-1);i--)
			{
				a[i+1]=a[i];	
			}
			a[index-1]=element;
			System.out.println("after inserting Element array is:");
	
			for(int i=0;i<n+1;i++)
			{
				System.out.println(a[i]);
			}
			System.out.println(a[n]);
		}
//		}
//		while(n!=n);
	
  }

