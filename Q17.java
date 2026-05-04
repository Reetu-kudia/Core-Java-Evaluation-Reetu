public class Q17 {
    class demo{
    private string s1="Reetu";
    public string s2="Hello";
    protected string s3="World";
    default string s4="Hey";

    public void display(){
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
    }
  public static void main(String[] args){
    demo d=new demo();
    d.display();
  }  
}
