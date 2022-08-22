package EampleTest.src.baekjoon;

import java.util.Scanner;

public class Step_2884 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int x = scanner.nextInt();
//		int y = scanner.nextInt();
		
		int x = 0;
		int y = 30;

		// 45분 일찍 기상
		y-=45;

		if (y >= 60) {
			x+=1;
			if (x > 23) {
				x = 0;
			}
		}

		System.out.println(x);
		System.out.println(y);
		
	}
	/*첫번째 버
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int x = scanner.nextInt();
//		int y = scanner.nextInt();
		
		int x = 10;
		int y = 10;
		
		if (x == 0) {
			x = 24;
		}
		
		y-=45;
		
		if(y == 60) {
			x+=1;
		} else if (y < 0) {
			x-=1;
			y+=60;
		}
		System.out.println(x);
		System.out.println(y);
	}
	*/
}
