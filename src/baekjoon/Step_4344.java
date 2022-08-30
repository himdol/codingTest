package EampleTest.src.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Step_4344 {
    public static void main(String[] args) {

        int a[][] = {
                {50, 50, 70, 80, 100}
                , {100, 95, 90, 80, 70, 60, 50}
                , {70, 90, 80}
                , {70, 90, 81}
                , {100, 99, 98, 97, 96, 95, 94, 93, 91}
        };

        for (int i = 0; i < a.length; i++) {
            int total = Arrays.stream(a[i]).sum();
            int b = total / a[i].length;
            double c = 100.0 / a[i].length;
            double d = 0;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > b) {
                    d += c;
                }
            }
            System.out.println(String.format("%.3f", d));
        }
    }
}
