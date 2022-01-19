import java.util.Scanner;
import java.util.Arrays;

public class bj1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double [] score = new double[N];

        for (int i=0; i<N; i++) {
            score[i] = sc.nextDouble();
        }

        Arrays.sort(score);

        double sum = 0;
        double avg = 0.0;

        for (int i=0; i<N; i++) {
            score[i] = score[i] / score[N-1] * 100;
            sum += score[i];
        }

        /*
        for (int i=0; i<N; i++) {
            sum += score[i];
        }
        */
        
        avg = sum / (double) N;

        System.out.println(avg);

        sc.close();
    }
}