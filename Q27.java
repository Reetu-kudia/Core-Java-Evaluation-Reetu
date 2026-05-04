class Emp{
	String name;
	int id;
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}
	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("object deleted");
	}
	
}
public class Q27 {
public static void main(String[] args) {
	Emp e=new Emp("Reetu",133);
	System.out.println(e);
	e=null;
	System.gc();
}
}
