import java.util.*;

public class bj2588 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a, b;
        int num3, num4, num5;
        
		a = sc.nextInt();
		b = sc.nextInt();
        
        num3 = a * (b % 10);
        num4 = a * (int)(b % 100 / 10);
        num5 = a * (int)(b / 100);
        
		System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(100*num5 + 10*num4 + num3);

        sc.close();
	}
}