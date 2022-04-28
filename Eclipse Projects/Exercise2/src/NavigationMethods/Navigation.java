package NavigationMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	ChromeDriver driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Addons\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "https://www.flipkart.com/";
		driver.get(url);
	}

	public void verifyPageTitle() {

		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

		String actualTitle = driver.getTitle();

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
	}

	public void navigation() {

		driver.navigate().to("https://adactinhotelapp.com/");
		
		driver.navigate().to("https://www.amazon.ca/");

		driver.navigate().back(); // takes you back one step
		
		driver.navigate().back(); // takes you back one step

		driver.navigate().forward(); // takes you forward one step
		
		driver.getCurrentUrl();

		driver.navigate().refresh();
		
		driver.quit();
	}
}
