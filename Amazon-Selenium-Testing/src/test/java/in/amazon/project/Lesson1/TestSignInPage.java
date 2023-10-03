package in.amazon.project.Lesson1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSignInPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();

driver.get("https://www.amazon.in/");
Thread.sleep(2000);
WebElement e1=driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
Actions a=new Actions(driver);
a.moveToElement(e1).perform();

Thread.sleep(5000);
driver.findElement(By.linkText("Sign in")).click();
Thread.sleep(3000);
driver.findElement(By.id("ap_email")).sendKeys("mallikamucherla@gmail.com");
driver.findElement(By.id("continue")).click();
Thread.sleep(3000);
driver.findElement(By.id("ap_password")).sendKeys("Mallika@123");
driver.findElement(By.id("signInSubmit")).click();
driver.close();
	}

}
