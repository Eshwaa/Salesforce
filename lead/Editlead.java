package auto;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Editlead {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Eshwaa",Keys.ENTER);
		WebElement findElement2 = driver.findElement(By.xpath("//a[@title='Eshwaa janaki']"));
		driver.executeScript("arguments[0].click();",findElement2);
	driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']")).click();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		WebElement findElement = driver.findElement(By.xpath("//input[@name='lastName']"));

		findElement.clear();
		Thread.sleep(5000);
		findElement.sendKeys("janaki");
		WebElement phone = driver.findElement(By.xpath("//input[@name='Phone']"));
		phone.clear();
		Thread.sleep(5000);
		phone.sendKeys("9360776321");
		WebElement findElement3 = driver.findElement(By.xpath("//span[text()='Open - Not Contacted']"));
		driver.executeScript("arguments[0].click();",findElement3);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		

	}

}
