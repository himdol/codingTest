package EampleTest.src.baekjoon;

import java.util.Scanner;

public class Step_2884 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int hour = scanner.nextInt();
		int min = scanner.nextInt();

        if (min <= 45) {
            min += 60 - 45;
            if (hour > 0) {
                hour -= 1;
            } else {
				hour = 24 - 1;
			}
        }
        System.out.println(hour);
        System.out.println(min);
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
