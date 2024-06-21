import java.util.Scanner;
public class Prime_number_logic_2 {
	public static void main(String[] args)
	{
		int flag = 0,input,small_prime = 2;/*Flag 0 means prime or 1 means non prime*/
		System.out.println("Enter the Number : ");
		
		Scanner in = new Scanner(System.in);
		input = in.nextInt();
		
		if(input<=1)/*Number 1 or less than one are not prime number */
		{
			flag = 1;
		}
		while(small_prime <= input / small_prime)/* 2<30/2--> 2<15 : True*/
		{
			if(input%small_prime==0) /*If input get divisible by number other than 1 it means  not prime*/
			{
				flag = 1;
				break;
			}
			else 
			{
				small_prime++;/*Example-> 49 it is not divided by 2,3,4,5,6 completely but get divided by 7 so in this
				 				to increase the value of divisior we use ++*/
			}
		}
		if(flag==0)
		{
			System.out.println(input + " is a prime number : ");
		}
		else 
		{
			System.out.println(input + " is not a prime number : ");
		}
	}
}
