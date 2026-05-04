class Emp{
	private int id;
	private String name;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class Q14 {
public static void main(String[] args) {
	Emp e=new Emp();
	e.setId(123);
	e.setName("Reetu");
	e.setSalary(24343);
	System.out.println(e.getId());
	System.out.println(e.getName());
	System.out.println(e.getSalary());
}
}
