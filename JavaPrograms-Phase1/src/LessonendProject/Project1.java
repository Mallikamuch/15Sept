package LessonendProject;

import java.util.Scanner;
public class Project1 {
	public void area(int l,int w)
	{
		System.out.println("the are of rectangle is:"+l*w);
	}
	public void area(int l)
	{
		System.out.println("the area of square is:"+l*l);
	}
	public void Rectangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length");
		int l= scan.nextInt();
		System.out.println("Enter the width");
		int w= scan.nextInt();
		Project1 obj=new Project1();
		obj.area(l,w);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

