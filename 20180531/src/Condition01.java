import java.util.Scanner;

public class Condition01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("整数を入力してください");
		int num = sc.nextInt();
		System.out.println("3の倍数" + (num % 3 == 0 ? "です。" : "ではありません。"));

	}

}
