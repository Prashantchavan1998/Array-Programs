package arrayex;

public class AvgOfMarks {

	public static void main(String[] args) 
	{
		float marks[]= {55,56,84,92,50,60};
		float sum=0;
		for(float a:marks)
		{
			sum=sum+a;
			
		}
		System.out.println("The average of marks is:"+sum/marks.length);

	}

}
