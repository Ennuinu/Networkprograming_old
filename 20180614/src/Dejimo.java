import java.util.InputMismatchException;
import java.util.Scanner;
public class Dejimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;					//名前
		int maxhp = 10, hp = 10;		//最大体力、体力
		int STR = 1, INT = 1;
		int day = 1;					//経過日数
		int cmd = 0;					//選択されたメニュー番号

		System.out.println("キャラクター名を入力してください");
		name = sc.next();

		while(hp > 0) {
			//メニューを表示する
			System.out.println("---" + day + "日目 " + name + "の行動メニュー");
			System.out.println("体力：" + hp + "/" + maxhp);
			System.out.println("筋力：" + STR + " " + "知性：" + INT);
			System.out.println("[1] 運動  [2] 勉強  [3] 睡眠  [9]終了");
			System.out.println("番号を入力してください");

			try {
				cmd = sc.nextInt();			//番号(整数値)の入力処理
			} catch(InputMismatchException e) {
				System.out.println("入力値が不正です。\n再入力してください");
			}

			switch (cmd) {
			case 1:			//運動
				System.out.println("*** 運動しました ***");
				hp = hp -2;
				STR = STR +1;
				break;
				case 2:			//勉強
				System.out.println("*** 勉強しました ***");
				hp = hp -2;
				INT = INT +1;
				break;
			case 3:
				System.out.println("*** 睡眠しました ***");
				if(hp < maxhp) {
					hp = maxhp;
				}
				break;
			case 9:
				System.out.println("ゲームを終了します");
				System.exit(0);

			default:		//その他
				System.out.println("その番号はメニューにありません");
				day--;
				break;
			}
			day++;							//コマンド1回につき１日増える
			System.out.println();			//空白行を作り、翌日との区切りに使う
		}
		if(hp <= 0)
			System.out.println(name + "は" + day + "日目に力尽きた");
			sc.close();
	}

}
