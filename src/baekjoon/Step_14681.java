package baekjoon;

import java.util.Scanner;

public class Step_14681 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
		int Y = scanner.nextInt();
		
        if(X > 0){
            if(Y > 0){
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else {
            if(Y > 0){
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
	}
}
