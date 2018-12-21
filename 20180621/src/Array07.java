
public class Array07 {

	public static void main(String[] args) {
		int[][] iaa = new int[3][];
		iaa[0] = new int[] {22,13};
		iaa[1] = new int[] {32,31,30};
		iaa[2] = new int[] {24,23};

		for(int[] a : iaa) {
			for(int i : a) {
				System.out.println(i + " ");
			}
			System.out.println();
		}

	}

}
