import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num[] = new int[N];

        for(int i=0; i<N; i++){
            num[i] = sc.nextInt();
        }

        long sum =0;
        long max =0;

        for(int i=0; i<N; i++){
            if(max < num[i]) {
                max = num[i];
            }
            sum += num[i];
        }
        System.out.println(sum*100.0 / max / N);
    }
}