import java.util.Scanner;
public class For01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("回数：");
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			System.out.println("i = " + i);
		}


	}

}
