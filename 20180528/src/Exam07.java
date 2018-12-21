import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1～4の整数を入力してください");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("1. 終了");
			break;
		case 2:
			System.out.println("2. 表示");
			break;
		case 3:
			System.out.println("3. 追加");
			break;
		case 4:
			System.out.println("4. 削除");
			break;
		default:
			System.out.println("エラー");
		}

	}

}
