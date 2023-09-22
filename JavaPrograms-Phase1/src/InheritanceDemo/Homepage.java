package InheritanceDemo;

import JavaProject.base;

public class Homepage extends base {
		// TODO Auto-generated method stub
public void Homepagetest()
{
	System.out.println("Test for Homepage");
}
public static void main(String[] args) {
	Homepage obj = new Homepage();
	obj.openbrowser("chrome");
	obj.login("admin","admin");
	obj.Homepagetest();
    obj.logout();
    
	}
protected void logout() {
	// TODO Auto-generated method stub
	
}

}
