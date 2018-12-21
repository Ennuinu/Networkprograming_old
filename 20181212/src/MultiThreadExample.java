public class MultiThreadExample {

	public static void main(String[] args) {
		Customer[] customer = new Customer[100];
		for(int i = 0; i < 100; i++) {
			customer[i] = new Customer();
			customer[i].start();
		}

		for(int i = 0; i < 100; i++) {
			try {
				customer[i].join();
			} catch(InterruptedException e) {
				System.out.println(e);
			}
		}

		System.out.println(Bank.money);

	}

}
