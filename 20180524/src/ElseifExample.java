import java.util.Scanner;
public class ElseifExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("aの値を入力してください");
		int a = sc.nextInt();
		if (a < 5) {
			System.out.println("A");
		} else if(a < 9) {
			System.out.println("B");
		} else if(a < 15) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}

	}

}
