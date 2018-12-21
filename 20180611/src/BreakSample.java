import java.util.Scanner;
public class BreakSample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//無限ループ
		while(true) {
			System.out.println("勇者よ、今こそ立ち上がり魔物と戦うのじゃ");
			System.out.println("１．はい");
			System.out.println("２．いいえ");
			System.out.println(">");
			int input = sc.nextInt();
			if(input == 1) {
					break;
			} else {
					System.out.println("わしも耳が遠くなったかのぉ・・・");
			}
		}
		System.out.println("勇者よ、冒険の旅に出かけるがよい");
	}

}
