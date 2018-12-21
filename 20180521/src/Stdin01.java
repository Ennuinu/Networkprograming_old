import java.util.Scanner;
public class Stdin01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("一つ目の数値を入力してください");
		int i1 = sc.nextInt();
		System.out.println("二つ目の数値を入力してください");
		int i2 = sc.nextInt();
		System.out.println("２つの値の合計は" + (i1 + i2) + "です");

	}

}
