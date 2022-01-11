import java.util.Scanner;

public class bj1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();   // a 입력
        b = sc.nextInt();   // b 입력
        if (a > b) {
            System.out.println(">");        // a가 b보다 클 경우 ">" 출력
        }
        else if (a < b) {
            System.out.println("<");        // a가 b보다 작을 경우 "<" 출력
        }
        else {
            System.out.println("==");       // a와 b가 같을 경우 "==" 출력
        }
        
        sc.close();
    }
}
