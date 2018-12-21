import java.util.Scanner;
public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("数を入力>");
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			System.out.print("*");
		}

	}

}
