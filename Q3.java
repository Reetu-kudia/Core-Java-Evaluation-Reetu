class Bank{
    public double getRateOfInterest(){
        return 0.2;
    }
}
class SBI extends Bank{
    public double getRateOfInterest(){
        return 0.5;
    }
}
class Axis extends Bank{
    public double getRateOfInterest(){
        return 0.6;
    }
}
class HDFC extends Bank{
    public double getRateOfInterest(){
        return 0.8;
    }
}
public class Q3 {
public static void main(String[] args) {
	Bank b;
    b=new Bank();
    b.getRateOfInterest();
    b=new SBI();
    b.getRateOfInterest();
    b=new Axis();
    b.getRateOfInterest();
    b=new HDFC();
    b.getRateOfInterest();
}
}
