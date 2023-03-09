package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownWithXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.microchip.com/prochiplicensing");
		WebElement designDropDown = driver.findElement(
				By.xpath("//label[text()='When is your design planned for production?']/preceding-sibling::select"));
		Select select = new Select(designDropDown);
		select.selectByVisibleText("2023");

		WebElement hdlDropDown = driver
				.findElement(By.xpath("//label[text()='What is your HDL preference?']/preceding-sibling::select"));
		Select select1 = new Select(hdlDropDown);
		select1.selectByVisibleText("Verilog");
		
		WebElement cpldDropDown = driver.findElement(By.xpath("//label[text()='Which CPLD will you be using?']/preceding-sibling::select"));
		Select select2 = new Select(cpldDropDown);	
		select2.selectByVisibleText("ATF1502");
		
//		WebElement cpldDesignDropDown = driver
//				.findElement(By.xpath("//label[text()='What are the potential quantities per year(or total CPLD volume) you plan to use in your design(s)?']//preceding-sibling::select"));
//		Select select3 = new Select(cpldDesignDropDown);	
//		select3.selectByVisibleText(">5000 units");
	
	}

}
