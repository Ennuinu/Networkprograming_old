import java.util.Scanner;
public class SwitchExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("scoreを入力してください[1～5]");
		int score = sc.nextInt();
		switch(score) {
		case 1:
			System.out.println("もっと頑張りましょう");
			break;
		case 2:
			System.out.println("もう少し頑張りましょう");
			break;
		case 3:
			System.out.println("普通です");
			break;
		case 4:
			System.out.println("よくできました");
			break;
		case 5:
			System.out.println("大変よくできました");
			break;
		default:
			System.out.println("想定されていない数値です");
		}
		System.out.println("Switchブロックを抜けました");
	}

}
