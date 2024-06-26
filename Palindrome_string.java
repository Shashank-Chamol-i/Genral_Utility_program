import java.util.Scanner;
public class Palindrome_string {

	public static void main(String[] args) {
		String a,b;
		StringBuffer sb;
		
		
		System.out.println("Enter the String : ");
		Scanner in = new Scanner(System.in);
		a = in.next();
		
		sb = new StringBuffer(a);
		b = sb.reverse().toString();
		
		if(a.equals(b)) 
		{
			System.out.print("Entered String is palindrome : ");
		}
		else 
		{
			System.out.print("Entered String is not palindrome");
		}
		

	}

}
