package InheritanceDemo;

public class Methoddemo2{
		// TODO Auto-generated method stub
	int x=100;
	String str3= "java";
public int sum()
{
	int a=10;
	int b=20;
	int result=a+b+x;
	return result;
	
}
public String concatmethod()
{
	String str1= "selenium";
	String str2= "training";
	String result = str1+str2+str3;
	return result;
	}

public void printmethod()
{
	System.out.println("The global integer variable:" +x);
	System.out.println("The global string variable:" +str3);
}
public static void main(String[]args) {
	Methoddemo2 obj = new Methoddemo2();
	System.out.println(obj.concatmethod());
	int value = obj.sum();
	System.out.println(value);
	obj.printmethod();
}
}
