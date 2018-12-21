import java.util.Scanner;

public class ScanNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;

		System.out.println("整数値を入力してください＞");
		num = sc.nextInt();		//整数値(int型)データをキーボードから取得する
		System.out.println("入力された文字列は" + num + "です。");

	}

}
