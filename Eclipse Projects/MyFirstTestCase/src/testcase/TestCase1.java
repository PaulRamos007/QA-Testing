package testcase;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
	public static void main(String [] args) {
		String service = "C:\\Addons\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", service);
        
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("http://www.google.com/");
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(title.length());
        
        driver.close();
	}
}
