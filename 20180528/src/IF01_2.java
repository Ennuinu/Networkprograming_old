import java.util.Scanner;

public class IF01_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("入力してください");
		int num = sc.nextInt();
		if(num >= 10) {
			System.out.println("10以上です");
		}
		System.out.println("end");
	}

}
