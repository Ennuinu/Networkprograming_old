import java.util.Random;
import java.util.Scanner;
public class Exam08 {

	public static void main(String[] args) {
		System.out.println("◆数字当てゲーム◆");
		Random rand = new Random();
		int ans = rand.nextInt(50) + 1;
		int cnt = rand.nextInt(10) + 1;
		Scanner sc = new Scanner(System.in);
		//System.out.println("答えは[" + ans + "]です");
		System.out.println("試行できる回数は[" + cnt + "]回です");
		for(int i = 0; i < cnt; i++) {
			System.out.print("数を入力>");
			int userans = sc.nextInt();
			System.out.printf("\t%d ..... ", userans);
			if(ans == userans) {
				System.out.println("正解です！");
				break;
			} else if (ans < userans) {
				System.out.println("もっと小さな数です");
			} else {
				System.out.println("もっと大きな数です");
			}
			if(i == cnt - 1) {
				System.out.println("これ以上試行できません");
				break;
			}
		}
		System.out.println("終了");
	}
}
