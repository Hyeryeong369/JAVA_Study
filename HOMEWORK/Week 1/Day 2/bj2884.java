import java.util.Scanner;

public class bj2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H, M;
        H = sc.nextInt();
        M = sc.nextInt();

        if (M < 45) {       // M이 45보다 작을 경우
            H--;
            M = 60 - (45 - M);
            if (H < 0) {        // H이 0보다 작아질 경우 23으로 정의
                H = 23;
            }
            System.out.println(H + " " + M);
        }
        else {
            System.out.println(H + " " + (M - 45));
        }
        sc.close();
    }
}