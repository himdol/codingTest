package EampleTest.src.baekjoon;

import java.util.Scanner;

public class Step_8958 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String arr[] = new String[in.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next();
        }

        for (int k = 0; k < arr.length; k++) {
            int j = 0;
            int c = 1;
            for (int i = 0; i < arr[k].length(); i++) {
                if ("X".equals(arr[k].substring(i, i + 1))) {
                    c = 1;
                } else {
                    j += c;
                    c++;
                }
            }
            System.out.println(j);
        }
    }
}


