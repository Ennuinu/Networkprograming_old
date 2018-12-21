
public class TriArea {
	int base;
	int height;

	//コンストラクタ
	TriArea(int base, int height) {
		this.base = base;
		this.height = height;
	}

	//インスタンスメソッド
	int getArea() {
		return this.base * this.height / 2;
	}

}
