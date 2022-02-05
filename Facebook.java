package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
	                      
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();  
	
	
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("kiru");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Hari");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("leaf@gmail.com");
	driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("password");
	
	WebElement day = driver.findElement(By.id("day"));
	Select dayDropdown = new Select(day);
	dayDropdown.selectByVisibleText("21");
	
	WebElement month = driver.findElement(By.id("month"));
	Select monthDropdown = new Select(month);
	monthDropdown.selectByValue("5");
	
	WebElement year = driver.findElement(By.id("year"));
	Select year1 = new Select(year);
	year1.selectByVisibleText("2000");
	
		WebElement gender = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
	gender.click();
	}

}
