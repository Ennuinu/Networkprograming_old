import java.util.Scanner;
public class LogicalSumExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("年齢を入力してください]");
		int age = sc.nextInt();
		if (age < 13 || age >= 65) {
			System.out.println("入場料は無料です。");
		} else {
			System.out.println("料金が必要です。");
		}

	}

}
