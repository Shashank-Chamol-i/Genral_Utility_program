import java.util.Scanner;
public class Prime_Number_logic_1 {

	public static void main(String[] args) {
		int count = 0;
		int input;
		
		System.out.println("Enter the Number : ");
		Scanner in = new Scanner(System.in);
		input = in.nextInt();
		
		for(int i = 1;i<=input;i++)
		{
			if(input%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(input + " is a prime number \n");
		}
		else 
		{
			System.out.println(input + " is not a prime number \n");
		}

	}

}
