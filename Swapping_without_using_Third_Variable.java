import java.util.Scanner;
public class Swapping_without_using_Third_Variable {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of A = ");
		int a1,a2;
		a1 = in.nextInt();
		System.out.println("Enter the value of B = ");
		a2 = in.nextInt();
		
		Swap(a1,a2);
	}
	static void Swap(int a1,int a2) 
	{
		a2 = (a1 + a2) - (a1 = a2);
		System.out.println("After Swapping A = " + a1);
		System.out.println("After Swapping B = " + a2);
	}

}
