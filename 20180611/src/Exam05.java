import java.util.Scanner;
public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("数を入力>");
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < (i+1); j++)
				System.out.print("*");
				System.out.println();
		}
	}

}
