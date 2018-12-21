
public class StudentVariableExample {
	public static void main(String[] args) {
		System.out.println("StudnetCard.counter=" + StudentCard.counter);
		StudentCard a = new StudentCard(12345, "鈴木太郎");
		System.out.println("StudnetCard.counter=" + StudentCard.counter);
		StudentCard b = new StudentCard(12346, "佐藤花子");
		System.out.println("StudnetCard.counter=" + StudentCard.counter);
	}
}
