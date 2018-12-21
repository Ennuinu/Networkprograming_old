
public class InstanceExample {

	public static void main(String[] args) {
		//	インスタンス作成
		StudentCard a = new StudentCard();
		StudentCard b = new StudentCard();
		StudentCard c = b;
		a.id = 1234;
		a.name = "鈴木太郎";

		b.id = 1235;
		b.name = "佐藤花子";


		System.out.println("aのid値は" + a.id);
		System.out.println("aのname値は" + a.name);

		System.out.println("bのid値は" + b.id);
		System.out.println("bのname値は" + b.name);

		System.out.println("cのid値は" + c.id);
		System.out.println("cのname値は" + c.name);

		c.id = 1236;
		c.name = "山田次郎";

		System.out.println("aのid値は" + a.id);
		System.out.println("aのname値は" + a.name);

		System.out.println("bのid値は" + b.id);
		System.out.println("bのname値は" + b.name);

		System.out.println("cのid値は" + c.id);
		System.out.println("cのname値は" + c.name);

	}

}
