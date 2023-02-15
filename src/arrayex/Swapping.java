package arrayex;

import java.util.Scanner;

public class Swapping
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]<a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		System.out.println("Sorting Array is: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		int count=1;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]==a[i+1])
			{
			count++;	
			}
			else
			{
				System.out.println(a[i]+":- "+count);
				count=1;
			}
			
		}
		System.out.println(a[(a.length-1)]+":- "+count);
	}

}
