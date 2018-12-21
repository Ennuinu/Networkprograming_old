import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("整数を入力してください");
		int num = sc.nextInt();
		String str = num == 0 ? "指定された整数は0です" : "指定された整数は0ではありません";
		System.out.println(str);

	}

}
