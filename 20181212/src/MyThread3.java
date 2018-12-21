class MyThread3 extends Thread {
	public boolean running = true;
	public void run() {
		while(running) {
			System.out.print("*");
		}
		System.out.println("runメソッドを終了します");
	}
}