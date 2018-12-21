import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("スライムが現れた！");
		System.out.println("「1. たたかう」「2. にげる」");
		System.out.println("1～2の数値を入力してください");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("「1. こうげき」「2. ぼうぎょ」「3. どうぐ」");
			System.out.println("1～3の数値を入力してください");
			int num2 = sc.nextInt();
				switch (num2) {
				case 1:
					System.out.println("ゆうしゃのこうげき、スライムに10のダメージ！！スライムを倒した");
					break;
				case 2:
					System.out.println("ゆうしゃはぼうぎょした");
					break;
				case 3:
					System.out.println("なにももってなかった！");
					break;
				}
			break;
		case 2:
			System.out.println("ゆうしゃはにげだした");
			break;
		default:
			System.out.println("エラー");
			break;
		}



	}

}
