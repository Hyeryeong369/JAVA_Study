import java.util.Scanner;

public class bj1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        /*
        생산비용 = a + 개수*b
        판매비용 = 개수*c
        int n = ((a/(c-b))) + 1
        */
        
        if (c <= b) {
            System.out.print("-1");
        }

        else {
            System.out.print(a/(c-b)+1);
        }


        sc.close();
    }
}