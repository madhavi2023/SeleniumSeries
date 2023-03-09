package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@title='vehicle-registration-forms-and-templates']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'frame-one')]")));
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("2020");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Honda");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("CRV");
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("RED");
		driver.findElement(By.id("RESULT_TextField-6")).sendKeys("10,000");
		driver.findElement(By.id("RESULT_TextField-7")).sendKeys("USA-1000");
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("John Doe");
		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("2 summerhill dr");
		driver.findElement(By.id("RESULT_TextField-11")).sendKeys("Denville");
//		Dropdown list handle
		WebElement dropDown=driver.findElement(By.id("RESULT_RadioButton-12"));
		Select select=new Select(dropDown);
		select.selectByVisibleText("New Jersey");
	
		driver.findElement(By.id("RESULT_TextField-13")).sendKeys("07540");
		driver.findElement(By.id("RESULT_TextField-14")).sendKeys("9738870381");
		driver.findElement(By.id("RESULT_TextField-15")).sendKeys("john.doe@yahoo.com");
		driver.findElement(By.id("FSsubmit")).click();
		driver.switchTo().defaultContent();
	}

}
