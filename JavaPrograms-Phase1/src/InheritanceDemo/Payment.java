package InheritanceDemo;

public class Payment extends Homepage{
	
	public void payment()
	{
		System.out.println("test payment page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Payment obj = new Payment();
obj.openbrowser("chrome");
obj.login("admin","admin@123");
obj.Homepagetest();
obj.payment();
obj.logout();
	}

}
