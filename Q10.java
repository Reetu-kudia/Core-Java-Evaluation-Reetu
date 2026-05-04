import static java.lang.System.*;

import java.util.Objects;

import static java.lang.Math.*;
class Emp implements Cloneable{
	String name;
	int id;
	
	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object Deleted");
	}
	
}
public class Q10 {
public static void main(String[] args) throws CloneNotSupportedException {
	System.out.println(sqrt(4));
	System.out.println(pow(2,3));
	int a=10;
	Integer i=new Integer(a);
	int z=i;
	System.out.println(z);
	Emp emp=new Emp("Reetu",123);
	System.out.println(emp);
	Emp emp2=(Emp)emp.clone();
	System.out.println(emp2);
	System.out.println(emp.equals(emp2));
	emp2=null;
	gc();
	System.out.println(emp.getClass().getName());
}
}
