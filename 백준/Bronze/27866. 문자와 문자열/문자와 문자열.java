import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String abc = sc.next();
        int num = sc.nextInt() - 1;
        
        System.out.println(abc.charAt(num));

    }
}
