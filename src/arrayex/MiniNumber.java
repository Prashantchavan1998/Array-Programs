package arrayex;
import java.util.Scanner;
public class MiniNumber 
{

	public static void main(String[] args) 
	{
		int n, min;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Row:");
		n=sc.nextInt();
		System.out.println("Enter the no of columns:");
		n=sc.nextInt();
		int a[][]=new int[n][n];
		System.out.println("Enter the element:");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();			
			}
		}
		 
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		min=a[0][0];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(min>a[i][j])
				{
					min=a[i][j];
				}
			}
		}
		System.out.println("Min value is:"+min);
		
	}

}
