
public class ThreadStopExample {
	public static void main(String[] args) {
		MyThread3 t = new MyThread3();
		t.start();

		try {
			Thread.sleep(5);
		} catch(Exception e) {
			System.out.println(e);
		}

		t.running = false;
	}

}