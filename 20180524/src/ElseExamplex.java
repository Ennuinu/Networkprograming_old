import java.util.Scanner;
public class ElseExamplex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("あなたの年齢を入力してください");
		int age = sc.nextInt();
		if (age < 4) {
			System.out.println("入場料は無料です");
		} else if(age < 13) {
			System.out.println("子供料金で入場できます");
		} else {
			System.out.println("大人料金が必要です");
		}

	}

}
