package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/pages/Link.html");
	System.out.println(driver.findElement(By.partialLinkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
	
}
}