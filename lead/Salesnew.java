package auto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Salesnew {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();	
		options.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(options);
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys(" hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		WebElement scroll = driver.findElement(By.xpath("//p[text()='Leads']"));
		Actions ScrollDown = new Actions(driver);
		ScrollDown.scrollToElement(scroll).click().perform();
		driver.findElement(By.xpath("//p[text()='Leads']")).click();
		driver.findElement(By.xpath("//div[text()='New']")).click();
		//WebElement down = driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']"));
		
		WebElement findElement = driver.findElement(By.xpath("//button[@name='salutation']"));
		findElement.click();
		 driver.findElement(By.xpath("//span[text()='Mr.']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Eshwaa");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@name='Title']")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@name='Phone']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@name='MobilePhone']")).sendKeys("9566963563");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("eshwaakumart@gmail.com");
		WebElement status = driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']"));
		status.click();
		WebElement findElement2 = driver.findElement(By.xpath("//span[text()='Open - Not Contacted']"));
		driver.executeScript("arguments[0].click();",findElement2);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}

}
	