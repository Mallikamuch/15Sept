package ExceptionPractices;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=9;
int j=0;
try
{
	System.out.println("Result"+i/j);
}
catch(ArithmeticException e) {
e.printStackTrace();
	
}
	System.out.println("Result"+i+j);
	System.out.println("Result"+ i*j);
	System.out.println("Result"+(i-j));
	}

}
