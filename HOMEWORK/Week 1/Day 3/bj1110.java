import java.util.Scanner;

public class bj1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int copy = N;
        int cnt = 0;

        while (true) {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
                // 십의 자리         일의 자리
            cnt++;

            if(copy == N) {
                break;
            }
        }
        System.out.println(cnt);        
    }
}
