public class Q20 {
	public static int divide(int n1,int n2) throws ArithmeticException {
		return n1/n2;
	}
	public static void cal(int num1,int num2,String op)throws ArithmeticException {
		if(op.equals("/")) {
			int result=divide(num1,num2);
			System.out.println(result);
		}

	}
public static void main(String[] args) {
	try {
		cal(10,0,"/");
	}catch(ArithmeticException e){
		System.out.println(e);
	}
}}
