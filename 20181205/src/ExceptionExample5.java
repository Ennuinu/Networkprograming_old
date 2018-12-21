
public class ExceptionExample5 {

	public static void main(String[] args) {
		SimpleClass obj = new SimpleClass();
		try {
			obj.doSomething();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("例外をキャッチしました");
			e.printStackTrace();
		}

	}

}
