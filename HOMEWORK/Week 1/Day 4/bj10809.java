import java.util.Scanner;

public class bj10809 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String word = sc.next();
        sc.close();

        for (char N = 'a'; N <= 'z'; N++) {
            System.out.print(word.indexOf(N) + " ");      // indexOf("찾을 특정 문자", "시작할 위치")
        }
    }
}

