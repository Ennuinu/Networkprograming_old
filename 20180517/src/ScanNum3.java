import java.util.Scanner;
public class ScanNum3 {

	public static void main(String[] args) {
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			int num1 = 0;
			int num2 = 0;

			System.out.println("1つ目の整数値を入力してください＞");
			num1 = sc1.nextInt();		//整数値(int型)データをキーボードから取得する

			System.out.println("2つ目の整数値を入力してください＞");
			num2 = sc2.nextInt();		//整数値(int型)データをキーボードから取得する

			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));

	}

}
