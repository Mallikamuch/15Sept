package javaPrograms;

public class InbuiltDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String title="SimpleLearn Online Course";
if(title.contains("simplelearn")) {
	System.out.println("Title is valid.Test case passed");
}
else
{
	System.out.println("Title is not valid.Test case failed");
}
if(title.equals("SimpleLearn Online courses")) {
	System.out.println("Title is valid.Test case passed");
}
else
	System.out.println("Title is invalid.Testcase failed");






String title2="practise labs java";
String result=title2.substring(14);
if(result.equals("java"))
{
	System.out.println("test is valid.case passed");
}
else
{
	System.out.println("test id invalid.caae failed");
}
	}

}
