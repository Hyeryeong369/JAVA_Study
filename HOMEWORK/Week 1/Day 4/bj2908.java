import java.util.Scanner;

public class bj2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();
        
        A = flip(A);
        B = flip(B);

        if (A > B) {
            System.out.print(A);
        }
        else {
            System.out.print(B);
        }

    }

    public static int flip(int num) {
        int result = 0;
        while(num!=0) {
            result = result*10 + num%10;
            num /= 10;
        }
        return result;
    }
}