import java.util.Scanner;
public class While01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("回数：");
		int num = sc.nextInt();
		int i = 0;
		while(i < num) {
			System.out.println("i = " + i);
			i++;
		}

	}

}
