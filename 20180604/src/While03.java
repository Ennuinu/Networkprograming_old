
public class While03 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(i <= 10) {
			sum += i;
			System.out.println("変数sumに" + i + "を加えました。sumは" + sum);
			i++;
		}

	}

}
