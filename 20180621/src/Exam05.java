
public class Exam05 {

	public static void main(String[] args) {
		int[][] kuku = new int[9][9];			//int型の二次元配列を宣言

		for(int x=1; x<=9; x++) {
			for(int y=1; y<=9; y++) {
				kuku[x-1][y-1] = x*y;
			}
		}
		System.out.println("九九の表");
		for(int x=1; x<=9; x++) {
			for(int y=1; y<=9; y++) {
				//二次元配列の値を表示
				System.out.print(kuku[x-1][y-1] + " ");
			}
			System.out.println("");
		}

	}

}
