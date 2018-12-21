import java.util.Scanner;
public class Continue01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("外側の回数を入力：");
		int num1 = sc.nextInt();
		System.out.println("内側の回数を入力：");
		int num2 = sc.nextInt();

		for(int i=0; i < num1; i++) {
			System.out.println("-- start --");
			for(int j=0; j <num2; j++) {
				System.out.println("i = " + i + ",j = " + j);
				if(i * j >= 4) {
					System.out.println("break：i=" + i + ",j=" + j);
					continue;
				}
			}
			System.out.println("-- end --");
		}

	}

}
