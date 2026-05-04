
class Emp{
	String name;
	int id;
	double salary;
	String address;
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address + "]";
	}
	public Emp(String name, int id, double salary, String address) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.address = address;
	}
	
	
}
public class Q9 {
public static void main(String[] args) {
	Emp e=new Emp("Reetu",123,43434,"Mumbai");
	System.out.println(e);
}
}
