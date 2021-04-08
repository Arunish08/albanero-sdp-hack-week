import java.util.LinkedList;
import java.util.Scanner;

public class Day3Question2 {
	public static void main(String[] args) {
		LinkedList<Integer> l1= new LinkedList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements in the linkedlist : ");
		int a = input.nextInt();

		System.out.println("Enter the elements : ");
		for(int i=0;i<a;i++)
		{
		l1.add(input.nextInt());
		}
		int[] arr = l1.stream().mapToInt(i->i).toArray();
		int temp;
		for(int i=1;i<a;i=i+2)
		{
			temp=arr[i-1];
			arr[i-1]=arr[i];
			arr[i]=temp;
		}
		LinkedList<Integer> sol= new LinkedList<Integer>();
		for(int n:arr) {
			sol.add(n);
		}
		System.out.println(sol);
	}

}
