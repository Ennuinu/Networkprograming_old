
public class Sample01 {

	public static void main(String[] args) {
		String s1 = new String ("こんにちは");
		String s2 = new String ("こんにちは");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		String s3 = "こんにちは";
		String s4 = "こんにちは";
		System.out.println(s3 == s4);

	}

}
