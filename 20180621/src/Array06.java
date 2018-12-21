
public class Array06 {

	public static void main(String[] args) {
		int[][] iaa = new int[3][];
		iaa[0] = new int[2];
		iaa[1] = new int[3];
		iaa[2] = new int[2];
		iaa[0][0] = 22;
		iaa[0][1] = 13;
		iaa[1][0] = 32;
		iaa[1][1] = 31;
		iaa[1][2] = 30;	
		iaa[2][0] = 24;
		iaa[2][1] = 23;

		for(int i=0; i<iaa.length; i++) {
			for(int j=0; j<iaa[i].length; j++) {
				System.out.println(iaa[i][j] + " ");
			}
			System.out.println();
		}

	}

}
