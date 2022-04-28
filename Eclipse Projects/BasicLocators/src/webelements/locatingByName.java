package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locatingByName {

	ChromeDriver driver;
	
	String url = "https://demo.guru99.com/V4/";
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Addons\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void login() {
		//locating userid texbox using name locator
		WebElement userIdElement = driver.findElement(By.name("uid"));
		
		//passing data using sendkeys method
		userIdElement.sendKeys("mngr395962");
		
		//chaining method for password
		driver.findElement(By.name("password")).sendKeys("ApYhEsE");
		
		//button click for login
		driver.findElement(By.name("btnLogin")).click();
	}
	
	public void newCustomerForm() {
		
		driver.findElement(By.linkText("New Customer")).click();
		
		//not advisable always use full link text
//		driver.findElement(By.partialLinkText("customer")).click();
		
		driver.findElement(By.name("name")).sendKeys("Paul");
		
		//absolute x path example
//		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")).click();
		
		//relative path example
		driver.findElement(By.xpath("//input[@value = 'f']")).click();
	}
	
	public void newUser() {
		
		String url = "http://the-internet.herokuapp.com/dropdown";
		
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement locationDropDown = driver.findElement(By.id("dropdown"));
		
		Select selectingOption = new Select(locationDropDown);
		
//		selectingOption.selectByIndex(2);
//		selectingOption.selectByValue("1");
//		selectingOption.selectByVisibleText("Option 2");
	}
	
	
}
