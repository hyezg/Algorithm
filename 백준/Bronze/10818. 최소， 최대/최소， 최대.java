import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		int []a = new int[N];
		
		int max=-1000000;
		int min = 1000000;
		
		for(int i=0; i<N; i++) {
			a[i]= sc.nextInt();
			
			if(max<a[i])	{
				max=a[i];
			}
			if(min>a[i])	{
				min=a[i];
			}
		}
		System.out.println(min+" "+max);
	}

}