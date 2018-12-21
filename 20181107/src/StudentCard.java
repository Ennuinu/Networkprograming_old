
public class StudentCard {
	//フィールド
	static int counter = 0;	//クラス
	int id;		//インスタンス変数
	String name;

	StudentCard(int id, String name) {
		System.out.println("StudentCardクラスのコンストラクタが呼び出されました");

		this.id = id;
		this.name = name;
		StudentCard.counter++;
	}

}
