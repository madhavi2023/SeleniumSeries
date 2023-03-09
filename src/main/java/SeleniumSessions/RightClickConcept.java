package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
//		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
//		Thread.sleep(2000);
		act.contextClick(ele).build().perform();
	List<WebElement> rightClickEle =	driver.findElements(By.cssSelector("ul.context-menu-root span"));
	System.out.println(rightClickEle.size());
	for(WebElement e: rightClickEle) {
		
		String text = e.getText();
		System.out.println(text);
		
		if(text.equals("Edit")) {
			e.click();
			Alert alert =driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
			break;
			
		}
		
	
		
//		for(int i=0;i<rightClickEle.size(); i++) {
//			Thread.sleep(2000);
//			e.click();
//			Alert alert =driver.switchTo().alert();
//			System.out.println(alert.getText());
//			alert.accept();	
//			act.contextClick(ele).build().perform();
//		}	
		
	}

	}

}
