import java.util.Scanner;

public class bj2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt() * sc.nextInt() * sc.nextInt();
        String str = Integer.toString(total);
        sc.close();

        for (int i=0; i<10; i++) {
            int cnt = 0;
            for (int j=0; j<str.length(); j++) {
                if ((str.charAt(j) - '0') == i) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
