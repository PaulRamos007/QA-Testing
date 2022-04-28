package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class register {

	ChromeDriver driver;
	
	String url = "https://adactinhotelapp.com/Register.php";
	
	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Addons\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void registerUser() {
		
		driver.findElement(By.id("username")).sendKeys("paulramos777");
		
		driver.findElement(By.id("password")).sendKeys("helloworld123");
		
		driver.findElement(By.id("re_password")).sendKeys("helloworld123");
		
		driver.findElement(By.id("full_name")).sendKeys("Paul Ramos");
		
		driver.findElement(By.id("email_add")).sendKeys("pau.ramos0707@gmail.com");
		
		driver.findElement(By.id("captcha-form")).sendKeys("zmudz");
		
		driver.findElement(By.id("Reset")).click();
	}
}
