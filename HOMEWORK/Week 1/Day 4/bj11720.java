import java.util.Scanner;

public class bj11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String a = sc.next();
        char[] number = a.toCharArray();
        sc.close();

        int sum = 0;

        for(int i=0; i<N; i++) {
            sum += number[i]-'0';
        }

        System.out.print(sum);
    }
}
