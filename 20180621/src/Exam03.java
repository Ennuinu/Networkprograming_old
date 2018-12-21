
public class Exam03 {

	public static void main(String[] args) {
		int lang[] = {68, 82, 92};
		int math[] = {76, 33, 83};
		int eng[] = {92, 45, 38};

		System.out.print("国語");
		int sumL = 0;
		for(int i=0; i<lang.length; i++) {
			if(i !=0) {System.out.print("、");}
			System.out.print(lang[i] + "点");
			sumL += lang[i];
		}
		System.out.println("\n国語の平均点は" + sumL/lang.length + "です");

		System.out.print("数学");
		int sumM = 0;
		for(int i=0; i<math.length; i++) {
			if(i !=0) {System.out.print("、");}
			System.out.print(math[i] + "点");
			sumM += math[i];
		}
		System.out.println("\n数学の平均点は" + sumM/math.length + "です");

		System.out.print("英語");
		int sumE = 0;
		for(int i=0; i<eng.length; i++) {
			if(i !=0) {System.out.print("、");}
			System.out.print(eng[i] + "点");
			sumE += eng[i];
		}
		System.out.println("\n英語の平均点は" + sumE/eng.length + "です");
	}
}