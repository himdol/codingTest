package EampleTest.src.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Step_4344 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        for (int i = 0; i < C; i++) {

            int N = sc.nextInt();
            int arr[] = new int[N];

            for (int m = 0; m < N; m++){
                int d = sc.nextInt();
                arr[m] = d;
            }

            int total = Arrays.stream(arr).sum();
            int b = total / N;
            double c = 100.0 / N;
            double d = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j] > b) {
                    d += c;
                }
            }
            System.out.println(String.format("%.3f", d)+"%");
        }
    }
}
