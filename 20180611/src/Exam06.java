import java.util.Scanner;
public class Exam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("数を入力>");
		int num = sc.nextInt();
		for(int i = 1; i <= num; i++) {
			System.out.print("*");
			for(int j = i; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
