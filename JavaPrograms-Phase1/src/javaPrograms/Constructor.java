package javaPrograms;

public class Constructor {
	public Constructor()
	{
		System.out.println("This is default constructor");
	}
public   Constructor(int a)
{
	System.out.println("This is parametrised constructor");
	System.out.println("The value of a is:"+a);
}
public void constructor(int a ,int b)
{
	System.out.println("This is a parametrised constructor");
	System.out.println("The value of a is:"+a);
	System.out.println("The value of a is:"+b);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructor obj= new Constructor();

	}

}
