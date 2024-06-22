import java.util.Scanner;
public class Swapping_two_numbers {

	public static void main(String[] args) {
		int a1,a2;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value to Swap A = ");
		a1 = in.nextInt();
		System.out.println("Enter the value to Swap B = ");
		a2 = in.nextInt();
		
		Swap(a1,a2);

	}
	static void Swap(int a1,int a2) 
	{
		int temp = a1;
		a1 = a2;
		a2 = temp;
		
		System.out.println("After Swapping A = "+ a1);
		System.out.println("After Swapping B = "+ a2);
	}
}
