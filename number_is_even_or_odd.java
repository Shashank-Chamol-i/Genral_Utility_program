import java.util.Scanner;
public class number_is_even_or_odd {

	public static void main(String[] args) {
		int input;
		
		System.out.println("Enter the Number : ");
		
		Scanner sc = new Scanner(System.in);
		
		input = sc.nextInt();
		if(input%2==0) {
			System.out.println(input + " - Is a even number : ");
		}
		else {
			System.out.println(input + " - Is a odd number : ");
		}
		

	}

}
