import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGSelenium {
	WebDriver driver = null;
	@BeforeClass
	public void initialSteps(){
		  String URL = "https://www.facebook.com";
		  System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sravan\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			//create chrome instance
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to(URL);
	}
	
   @Test
   public void openFBPage(){
	   driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	   driver.findElement(By.name("pass")).sendKeys("abc@gmail.com");
	   assertTrue(true);
   }
   public void openFBPage1(){
	   driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	   driver.findElement(By.name("pass")).sendKeys("abc@gmail.com");
	   assertTrue(true);
}
}
