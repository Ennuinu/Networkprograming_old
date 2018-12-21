
public class Array08 {

	public static void main(String[] args) {
		int[][] iaa = new int[3][2];
		iaa[0][0] = 22;
		iaa[0][1] = 13;
		iaa[1][0] = 32;
		iaa[1][1] = 31;
		iaa[2][0] = 24;
		iaa[2][1] = 23;

		for(int[] ia : iaa) {
			for(int i : ia) {
				System.out.println(i + " ");
			}
			System.out.println();
		}


	}

}
