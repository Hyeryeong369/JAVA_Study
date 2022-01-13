import java.util.Scanner;

public class bj1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];

        String A = sc.next().toUpperCase();

        int max = -1;
        char st = '?';

        sc.close();

        for(int i=0; i<A.length(); i++) {
            arr[A.charAt(i)-65]++;
            if (max<arr[A.charAt(i)-65]) {
                max = arr[A.charAt(i)-65];
                st = A.charAt(i);
            }
            else if (max==arr[A.charAt(i)-65]) {
                st = '?';
            }
        }
        System.out.println(st);
    }
}