import java.util.Scanner;
public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("縦の数を入力>");
		int y = sc.nextInt();
		System.out.print("横の数を入力>");
		int x = sc.nextInt();
		for(int i = 0; i < y; i++) {
			System.out.print("*");
			for(int j = 0; j < x -1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
