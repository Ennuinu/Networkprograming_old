import java.util.Random;
public class Ran01 {

	public static void main(String[] args) {
		// Randomクラスのインスタンス化
		Random rnd = new Random();
		int ran = rnd.nextInt(10);
		System.out.println(ran);
	}

}
