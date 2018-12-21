import java.util.Scanner;
public class IfExamplex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("あなたの年齢を入力してください");
		int age = sc.nextInt();
		if(age < 20) {
			System.out.println("未成年ですね");
		} else {
			System.out.println("二十歳以上ですね");
		}

	}

}
