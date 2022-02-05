package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelClassRoom1 {
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver_win32/chromedriver.exe");
		//to setup the driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize the browser
		driver.manage().window().maximize();
		WebElement elementUsername=driver.findElement((By.id("username")));
		elementUsername.sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		//source dropdown
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceSelect=new Select(source);
		sourceSelect.selectByVisibleText("Cold Call");
		Thread.sleep(2000);
		
		//industry dropdown 
		WebElement industry=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industrySelect=new Select(industry);
		industrySelect.selectByVisibleText("Finance");
		Thread.sleep(2000);
		
		//ownership dropdown		
		WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipSelect=new Select(ownership);
		ownershipSelect.selectByIndex(2);
		Thread.sleep(2000);
		
				
		driver.close();
	}

}
