import java.util.Scanner;

public class bj14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();

        if (x > 0) {        //x의 좌표가 0보다 클 경우
            if (y > 0) {
                System.out.println("1");        //y의 좌표가 0보다 클 경우 1사분면
            }
            else if (y < 0) {
                System.out.println("4");        //y의 좌표가 0보다 작을 경우 4사분면
            }
        }
        else if (x < 0) {        //x의 좌표가 0보다 작을 경우
            if (y > 0) {
                System.out.println("2");        //y의 좌표가 0보다 클 경우 2사분면
            }
            else if (y < 0) {
                System.out.println("3");        //y의 좌표가 0보다 작을 경우 3사분면
            }
        }

        sc.close();
    }
}