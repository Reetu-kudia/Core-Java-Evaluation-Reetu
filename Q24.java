class Emp{
	void calSal(double sal){
		System.out.println("Emp Salary"+sal);
	}
	void calSal(double sal,double bonus){
		System.out.println("Emp Salary with Bonus"+sal+bonus);
	}
}

public class Q24 {
public static void main(String[] args) {
	Emp e=new Emp();
	e.calSal(45454);
	e.calSal(32435,45450);
}
}
