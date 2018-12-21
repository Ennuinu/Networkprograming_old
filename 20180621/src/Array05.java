
public class Array05 {

	public static void main(String[] args) {
		int[] ia1 = {3, 6, 21, 12, 4};
		int[] ia2 = ia1;
		ia2[3] = 9;
		for(int i: ia1) {
			System.out.println(i);
		}

	}

}
