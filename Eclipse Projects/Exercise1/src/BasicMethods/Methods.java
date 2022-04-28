package BasicMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	
	ChromeDriver driver;
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Addons\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://www.amazon.ca/";
		driver.get(url);
	}
	
	public void getDimensions() {
		
		Dimension windowsize= driver.manage().window().getSize();
		
		System.out.println("Height: " + windowsize.height);
		System.out.println("Width: " + windowsize.width);
		
		Dimension newDimension = new Dimension(700, 700);

		driver.manage().window().setSize(newDimension);
	}
	
	public void getUrl() {

		String urlFromPage = driver.getCurrentUrl();
		
		System.out.println(urlFromPage);
		
		String title = driver.getTitle();
		
		System.out.println(title);
	}
	public void closeBrowser() {
		
		driver.quit();
	}
}
