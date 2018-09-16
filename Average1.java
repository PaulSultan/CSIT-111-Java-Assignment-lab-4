import java.util.Scanner;
public class Average1 {

	public static void main(String[] args) {
		double val = 0;
		int numcount=0;
		double average = 0;
		 int numbers = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many numbers you want to average");
		
	  numcount = scan.nextInt();
		 
		for(int i=0;i< numcount;i++)
		{
			System.out.println("Enter the numbers you want to find the average to");
			numbers = numbers + scan.nextInt();
			 
			 
		}
		System.out.println(numcount);
		average = numbers/numcount;
		System.out.println("Your Average is " + average);
		


		// TODO Auto-generated method stub

	}
}
