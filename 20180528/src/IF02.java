import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("入力してください");
		int num = sc.nextInt();
		if(num >=10) {
			System.out.println("10以上です");
		} else {
			System.out.println("10未満です");
		}
		System.out.println("end");
	}

}
