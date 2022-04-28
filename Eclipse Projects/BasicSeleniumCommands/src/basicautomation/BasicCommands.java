package basicautomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCommands {

	ChromeDriver driver;
	
	String url = "https://www.facebook.com/";
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Addons\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void verifyPageTitle() {
		
		String expectedTitle = "Facebook";
		
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
	}
	
	//Navigation commands
	
	public void navigateCommands() {
		
		driver.navigate().to("https://adactinhotelapp.com/");
		
		String urlFromPage = driver.getCurrentUrl();
		
		System.out.println(urlFromPage);
		
		driver.navigate().back(); // takes you back one step
		
		driver.navigate().forward(); // takes you forward one step
		
		driver.navigate().refresh(); 
	}
	
	public void closeBrowser() {
		
		driver.quit();
	}
}
