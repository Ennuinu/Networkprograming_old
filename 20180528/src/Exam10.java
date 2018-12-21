import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("体重を入力してください");
		double Wt = sc.nextDouble();
		System.out.println("身長を入力してください");
		double Ht = sc.nextDouble();
		double BMI = (Wt / (Ht * Ht)*10000);
		System.out.println(BMI);
		if (BMI > 26.5) {
			System.out.println("太りすぎ");
		} else if (BMI > 26.5 || BMI >= 24) {
			System.out.println("太りぎみ");
		} else if (BMI > 24 || BMI >= 20) {
			System.out.println("普通");
		} else {
			System.out.println("やせぎみ");
		}

	}

}
