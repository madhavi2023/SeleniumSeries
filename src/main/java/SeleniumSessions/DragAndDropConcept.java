package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement srcElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(srcElement).moveToElement(targetElement).release().build().perform();
//		selenium has direct actions method for "draganddrop"
//		act.dragAndDrop(srcElement, targetElement).build().perform();
		
	}

}
