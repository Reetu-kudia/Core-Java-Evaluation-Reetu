class Case{
    {
        System.out.println("Anonymous inner class in case class");
    }
    class inner{
        public void innermeth(){
            System.out.println("Inner Class");
        }
    }
}

public class Q13 {
    public static void main(String[] args) {
    Case c=new Case();
    Case.inner i=new inner();
    Case.inner.i.innermeth();
    }
}
