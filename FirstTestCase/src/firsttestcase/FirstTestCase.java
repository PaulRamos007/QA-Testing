/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firsttestcase;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author paula
 */
public class FirstTestCase {

    public static void main(String[] args) {
        
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
