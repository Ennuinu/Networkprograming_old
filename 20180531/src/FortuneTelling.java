import java.util.Random;
import java.util.Scanner;
public class FortuneTelling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("本日の運勢を占おうと思います");
		System.out.println("本当に占いますか？【yse→1 / no→2】");
		int num = sc.nextInt();
		if (num == 1) {
			System.out.println("ではまず、あなたの名前を入力してください");
			String name = sc.next();
			System.out.println("こんにちは！" + name + "さん。");
			System.out.println("占います。今日の運勢は・・・");
			Random rnd = new Random();
			int ran = rnd.nextInt(7);
			String unsei="";

			switch(ran) {
			case 0:
				unsei = "大吉";
				break;
			case 1:
				unsei = "中吉";
				break;
			case 2:
				unsei = "小吉";
				break;
			case 3:
				unsei = "吉";
				break;
			case 4:
				unsei = "末吉";
				break;
			case 5:
				unsei = "凶";
				break;
			case 6:
				unsei = "大凶";
				break;

			}
			System.out.println(unsei + "です。");
			System.out.println("明日もまた占ってね。");

		} else if (num == 2) {
			System.out.println("ありゃりゃ、やらないですか。残念ですね。");
		} else {
			System.out.println("yes(1) か no(2)を入力してください");
		}
	}

}
