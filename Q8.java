class Emp{
	void calSal(double sal){
		System.out.println("Emp Salary"+sal);
	}
	void calSal(double sal,double bonus){
		System.out.println("Emp Salary with Bonus"+sal+bonus);
	}
}
class Manager extends Emp{
	@Override
	void calSal(double sal) {
		System.out.println("Manager Salary"+sal);
	}
}
public class Q8 {
public static void main(String[] args) {
	Manager m=new Manager();
	m.calSal(3432434);
	Emp e=new Emp();
	e.calSal(45454);
	e.calSal(32435,45450);
}
}
