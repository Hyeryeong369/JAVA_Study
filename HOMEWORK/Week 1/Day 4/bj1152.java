import java.util.StringTokenizer;
import java.util.Scanner;

public class bj1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        sc.close();

        StringTokenizer st = new StringTokenizer(S, " ");

        System.out.println(st.countTokens());
    }
    
}
