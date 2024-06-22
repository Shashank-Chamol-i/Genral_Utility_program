import java.util.Scanner;
public class Largest_among_n {

	public static void main(String[] args) {
		int size,max;
		int arr [];
		
		System.out.println("Enter the size of an array :");
		Scanner in = new Scanner(System.in);
		size = in.nextInt();
		
		arr = new int[size];
		
		System.out.println("Enter the Elements of array :");
		for(int i = 0;i<size;i++)
		{
			arr[i] = in.nextInt();
		}
		max = max_number(arr,size);
		System.out.println("The largest number among " + size +" is : "+max);
	}
	static int max_number(int arr[],int size)
	{
		int large = Integer.MIN_VALUE;
		for(int i = 0;i<size;i++) 
		{
			if(arr[i]>large)
			large = arr[i];
		}
		return large;
	}

}
