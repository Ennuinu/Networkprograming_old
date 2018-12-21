
public class String01 {

	public static void main(String[] args) {
		String str1 = "Javaの学習";
		System.out.println(str1.length());
		System.out.println(str1.indexOf("学習"));
		System.out.println(str1.indexOf("Ruby"));
		System.out.println(str1.contains("Java"));
		System.out.println(str1.contains("Ruby"));
		System.out.println(str1.replace("Java", "Java言語"));

		String str2 = "2017/11/22";
		String[] items = str2.split("/");
		for(int i = 0; i < items.length; i++) {
			System.out.println(items[i]);
		}

	}

}
