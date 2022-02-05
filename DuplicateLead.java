package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("leaf@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		WebElement real = driver.findElement(By.id("viewLead_firstName_sp"));
		String real1 = real.getText();
		System.out.println("Real Lead name:" + real1);
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']//a")).click();
		String duplicatetitle = driver.getTitle();
		System.out.println(duplicatetitle);
		if (driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).isDisplayed()) {
			System.out.println("Title verified");
		} else {
			System.out.println("Title is incorrect");
		}

		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();

		WebElement duplicate = driver.findElement(By.id("viewLead_firstName_sp"));
		String duplicate1 = duplicate.getText();
		System.out.println("Duplicate Lead name:" + duplicate1);

		if (real1.equalsIgnoreCase(duplicate1)) {
			System.out.println("Captured lead and duplicate names are same");
		} else {
			System.out.println("Captured lead and duplicate names are not same");

		}
		driver.close();

		/*
		 * http://leaftaps.com/opentaps/control/main
		 * 
		 * 1 Launch the browser 2 Enter the username 3 Enter the password 4 Click Login
		 * 5 Click crm/sfa link 6 Click Leads link 7 Click Find leads 8 Click on Email 9
		 * Enter Email 10 Click find leads button 11 Capture name of First Resulting
		 * lead 12 Click First Resulting lead 13 Click Duplicate Lead 14 Verify the
		 * title as 'Duplicate Lead' 15 Click Create Lead 16 Confirm the duplicated lead
		 * name is same as captured name 17 Close the browser (Do not log out)
		 * 
		 */
	}
}
