package Identifier;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	ChromeDriver driver;

	String url = "https://adactinhotelapp.com/";

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Addons\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(url);
	}

	public void login() {

		WebElement userIdElement = driver.findElement(By.name("username"));

		userIdElement.sendKeys("paulramos777");
		
		WebElement userPasswordElement = driver.findElement(By.name("password"));

		userPasswordElement.sendKeys("helloworld123");
		
		driver.findElement(By.name("login")).click();
		
		driver.navigate().to("https://adactinhotelapp.com/SearchHotel.php");
	}
}
