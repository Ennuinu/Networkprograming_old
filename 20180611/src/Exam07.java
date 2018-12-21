import java.util.Random;
public class Exam07 {

	public static void main(String[] args) {
		System.out.println("ランダムな文字列を出力します");
		for(int i = 0; i < 10; i++) {
		Random rand = new Random();
		int rnum = rand.nextInt(10);
			System.out.println(rnum);
			if(rnum == 7) {
				System.out.println("ラッキーナンバーです");
				break;
			}
			else if( rnum % 2 == 0) {
				System.out.println("偶数です。");
				continue;
			} else {
				System.out.println("奇数です。");
				continue;
			}

		}

	}

}
