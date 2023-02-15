package arrayex;

import java.util.Scanner;
public class SearchElement 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]= {10,45,84,45,20};
		System.out.println("Enter the element to search in given Array: ");
		int n=sc.nextInt();
		boolean IsArray=false;
		
		for(int i:a)
		{
			
			if(n==i)
			{
				IsArray=true;
				break;
			}
			
		}
		if(IsArray)
		{
			System.out.println("Element is found");
		}
		else
		{
			System.out.println("Element is not found");
		}
		for(int element:a)
		{
			System.out.println(element);
		}		

	}

}
