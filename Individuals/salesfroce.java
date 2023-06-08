package auto;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class salesfroce {

	public static void main(String[] args) throws IOException, InterruptedException {
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
		WebElement scroll = driver.findElement(By.xpath("//p[text()='Individuals']"));
		Actions ScrollDown = new Actions(driver);
		ScrollDown.scrollToElement(scroll).click().perform();
		driver.findElement(By.xpath("//p[text()='Individuals']")).click();
		driver.findElement(By.xpath("//div[text()='New']")).click();
		WebElement Salutation = driver.findElement(By.xpath("//a[@class='selected']"));
		Select down=new Select(Salutation);
		down.selectByIndex(2);
		driver.findElement(By.xpath("//input[contains(@class,'firstName compoundBorderBottom form-element__row input')]")).sendKeys("Eshwaa");
	    driver.findElement(By.xpath("//input[contains(@class,'lastName compoundBLRadius compoundBRRadius form')]")).sendKeys("Kumar");	
	    
	}
	}
       
