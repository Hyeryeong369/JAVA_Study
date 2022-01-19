import java.util.Scanner;

public class bj4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();
        int[] arr;

        for (int i=0; i<C; i++) {
            int N = sc.nextInt(); // 학생 수
            arr = new int[N];

            double sum = 0;

            for (int j=0; j<N; j++) {
                int score = sc.nextInt();
                arr[j] = score;
                sum += score;
            }

            double avg = (sum / N);
            double cnt = 0;

            for (int j=0; j<N; j++) {
                if (arr[j] > avg) {
                    cnt ++;
                }
            }

            System.out.printf("%.3f%%\n", (cnt/N)*100);
        }

        sc.close();
    }
}
