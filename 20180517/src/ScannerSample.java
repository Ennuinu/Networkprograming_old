import java.util.Scanner;

public class ScannerSample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;

		System.out.println("文字列データを入力してください＞");
		str = sc.next();
		System.out.println("入力された文字列は" + str + "です。");

	}

}
