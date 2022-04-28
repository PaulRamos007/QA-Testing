package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class adactin {

	ChromeDriver driver;

	String url = "http://adactinhotelapp.com/index.php";

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Addons\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void login() {
		
		driver.findElement(By.id("username")).sendKeys("paulramos777");
		driver.findElement(By.id("password")).sendKeys("helloworld123");
		driver.findElement(By.id("login")).click();
	}
	
	public void search() {
		
		WebElement location = driver.findElement(By.id("location"));
		Select selectingLocation = new Select(location);
		selectingLocation.selectByIndex(6);
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select selectingHotel = new Select(hotel);
		selectingHotel.selectByIndex(2);
		
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select selectingRoomType = new Select(roomType);
		selectingRoomType.selectByIndex(4);
		
		WebElement numberOfRooms = driver.findElement(By.id("room_nos"));
		Select selectingNumber = new Select(numberOfRooms);
		selectingNumber.selectByIndex(2);
		
		driver.findElement(By.id("Submit")).click();
	}
	
	public void proceed() {
		
		driver.findElement(By.xpath("//input[@value = '0']")).click();
		driver.findElement(By.id("continue")).click();
	}
	
	public void book() {
		
		driver.findElement(By.id("first_name")).sendKeys("Paul");
		driver.findElement(By.id("last_name")).sendKeys("Ramos");
		driver.findElement(By.id("address")).sendKeys("141 Chuman Street, Moncton, NB");
		driver.findElement(By.id("cc_num")).sendKeys("1234567891023456");

		WebElement ccType = driver.findElement(By.id("cc_type"));
		Select selectingCreditCard = new Select(ccType);
		selectingCreditCard.selectByIndex(1);
		
		WebElement ccMonth = driver.findElement(By.id("cc_exp_month"));
		Select selectingMonth = new Select(ccMonth);
		selectingMonth.selectByIndex(11);
		
		WebElement ccYear = driver.findElement(By.id("cc_exp_year"));
		Select selectingYear = new Select(ccYear);
		selectingYear.selectByIndex(5);
		
		driver.findElement(By.id("cc_cvv")).sendKeys("234");
		driver.findElement(By.id("book_now")).click();
	}
}
