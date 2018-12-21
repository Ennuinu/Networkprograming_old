public class SimpleThreadTest3 {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		Thread thread = new Thread(t);
		thread.start();

		try {
			t.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		for(int i = 0; i < 100; i++) {
			System.out.println("SimpleThreadTest2のmainメソッド(" + i + ")");
		}
	}

}
