import java.util.Scanner;
public class Leap_year {

	public static void main(String[] args) {
		int input;
		System.out.println("Enter the year : ");
		Scanner in = new Scanner(System.in);
		input = in.nextInt();
		
		if(input%400==0)
		{
			System.out.println("Leap Year : ");
		}
		else if(input%100==0) 
		{
			System.out.println("Not a leap Year : ");
		}
		else if(input%4==0)
		{
			System.out.println("Leap Year : ");
		}
		else 
		{
			System.out.println("Not a leap Year");
		}
		

	}

}
