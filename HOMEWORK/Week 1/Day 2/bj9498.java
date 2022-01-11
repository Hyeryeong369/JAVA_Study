import java.util.Scanner;

public class bj9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        
        if (score>=90 && score<=100) {
            System.out.println("A");        // score가 90~100일 경우 A 출력
        }
        else if (score>=80 && score<=89) {
            System.out.println("B");        // score가 80~89일 경우 B 출력
        }
        else if (score>=70 && score<=79) {
            System.out.println("C");        // score가 70~79일 경우 C 출력
        }
        else if (score>=60 && score<=69) {
            System.out.println("D");        // score가 60~69일 경우 D 출력
        }
        else {
            System.out.println("F");        // score가 0~59일 경우 F 출력
        }
        
        sc.close();
    }
}
