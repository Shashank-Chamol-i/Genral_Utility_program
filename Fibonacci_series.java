import java.util.Scanner;
public class Fibonacci_series {

	public static void main(String[] args) {
		int first_number = 0,second_number =1,result,input,count=0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number for Fibonacci to represent : \n");
		input = in.nextInt();
		
		while(true)
		{
			result = first_number + second_number;
			count++;
			if(result>=input)
			{
				break;
			}
			first_number = second_number;
			second_number = result;
			System.out.println("\nFibonacci No: "+count+" -> "+result);
		}
		
	}

}
