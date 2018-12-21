
public class While04 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 1;
		while(i <= 10) {
			sum *= i;
			System.out.println("変数sumに" + i + "を掛けました。sumは" + sum);
			i++;
		}

	}

}
