import java.util.Scanner;

public class IF03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("入力してください");
		int num = sc.nextInt();
		if(num >= 10) {
			System.out.println("10以上です");
		} else if (num >= 5) {
			System.out.println("5以上です");
		} else {
			System.out.println("5未満です");
		}
		System.out.println("end");
	}

}
