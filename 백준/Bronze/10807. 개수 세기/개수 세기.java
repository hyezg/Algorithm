import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i=0;  i<n; i++)	{
			arr[i] = sc.nextInt();
		}
		
		int b = sc.nextInt();
		int count=0;
		
		for(int i=0; i<n ; i++)	{
			if(arr[i] == b) {
				count+=1;
			}
		}
		System.out.println(count);
	}

}