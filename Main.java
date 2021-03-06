import java.util.*;
import java.lang.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the array");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("enter the elements of the array you want to reverse");

		for(int i=0; i<n; i++)
		{
			int ele = sc.nextInt();
			arr[i] = ele;
		}

		System.out.println("the array you entered is: ");
		for(int j=0; j<n; j++)
		{
			System.out.print(arr[j]+" ");
		}
		System.out.println(" ");

		new Main().reverseArray(arr, n);
	}

	public static void reverseArray(int arr[], int n)
	{
		int temp;
		int low = 0;
		int high = n-1;

		while(low < high)
		{
			temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}

		System.out.println("reversed array is:");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
