
public class IStudentCard extends StudentCard {
	String nationality;		//国籍

	void printInfo() {
		super.printInfo();
		System.out.println("国籍：" + this.nationality);
	}

}
