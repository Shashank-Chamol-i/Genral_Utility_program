import java.util.Scanner;
public class factorial_of_number {

	public static void main(String[] args) {
		System.out.println("Enter a number ");
		int input,fact = 1;
		
		
		Scanner in = new Scanner(System.in);
		input = in.nextInt();
		
		if(input==0) 
		{
			System.out.println("Factorial of 0 is 1");
			System.exit(0);/*To terminate the code*/
		}
		
		for(int i = 1;i<=input;i++) 
		{
			fact = fact * i;
		}
		System.out.println("The Factorial of "+input+" is "+fact);
		
	}

}
