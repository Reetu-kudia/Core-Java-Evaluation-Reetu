class Manager{
	String t1="dhf";
	String t2="vdhfvhgd";
	public Manager() {
		super();
		System.out.println("Manager Constructor");	
		}
	public void displayTask() {
		System.out.println("Manager Method");
	}
}
class Emp extends Manager{
	public Emp() {
		super();
		System.out.println("Child emp Constructor");
		System.out.println(super.t1);
		System.out.println(super.t2);
		}
	public void display() {
		System.out.println("Child Method");
		super.displayTask();
		}
}
public class Q12 {
public static void main(String[] args) {
	Emp e=new Emp();
	e.display();
}
}
