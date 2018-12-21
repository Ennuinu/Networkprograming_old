import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("整数を入力してください");
		int num = sc.nextInt();
		if ((num <= 100) && (num >= 80)) {
			System.out.println("ランクA");
		} else if ((num < 80) && (num >= 50)) {
			System.out.println("ランクB");
		} else if ((num < 50) && (num >= 20)) {
			System.out.println("ランクC");
		} else if((num < 20) && (num >= 0)) {
			System.out.println("ランクD");
		} else {
			System.out.println("エラー");
		}


	}

}
