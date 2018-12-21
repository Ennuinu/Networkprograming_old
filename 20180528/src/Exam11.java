import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("国の名前を入力してください");
		String str = sc.next();
		if ("アメリカ合衆国".equals(str)) {
			System.out.println("ワシントンD.C.");
		} else if ("フランス".equals(str)) {
			System.out.println("パリ");
		} else if ("中華人民共和国".equals(str)) {
			System.out.println("北京");
		} else if ("大韓民国".equals(str)) {
			System.out.println("ソウル");
		} else if ("フィリピン".equals(str)) {
			System.out.println("マニラ");
		} else if ("日本".equals(str)) {
			System.out.println("東京");
		} else {
			System.out.println("該当する国は登録されていません");
		}
	}

}
