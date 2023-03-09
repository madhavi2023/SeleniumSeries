package SeleniumSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllElements {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");

//		Select select = new Select(driver.findElement(country));
//		
//		List<WebElement> countryList = select.getOptions();
//		System.out.println(countryList.size()-1);
//		
//		for(WebElement e : countryList) {
//		String text = e.getText();	
//		System.out.println(text);
//		if(text.equals("Brazil")) {
//			e.click();
//			break;
//		}
//		
//		}

		By country = By.id("Form_getForm_Country");
		if (getTotalDropDownOptions(country) - 1 == 232) {
			System.out.println("Country drop down count is correct");
		}

		if (getDropDownOptionsTextList(country).contains("India")) {
			System.out.println("India is in the drop down list");
		}

		List<String> expCountryList = Arrays.asList("India", "Brazil", "Belgium");

		if (getDropDownOptionsTextList(country).containsAll(expCountryList)) {
			System.out.println("India, Brazil and Belgium in the drop down list");
		}
		
		selectDropDownValue(country,"Canada");
	}

	public static WebElement getElement(By locater) {
		return driver.findElement(locater);

	}

	public static List<WebElement> getDropDownOptionsList(By locater) {
		Select select = new Select(getElement(locater));
		return select.getOptions();

	}

	public static List<String> getDropDownOptionsTextList(By locater) {
		List<WebElement> optionsList = getDropDownOptionsList(locater);
		List<String> optionsTextList = new ArrayList<String>();
		for (WebElement e : optionsList) {
			String text = e.getText();
			optionsTextList.add(text);
		}
		return optionsTextList;
	}
	
	public static void selectDropDownValue(By locater, String expValue) {
		List<WebElement> optionsList = getDropDownOptionsList(locater);
		for(WebElement e: optionsList) {
			String text=e.getText();
			System.out.println(text);
			
			if(text.equals(expValue)){
				e.click();
				break;
			}
		}
		
	}

	public static int getTotalDropDownOptions(By locater) {
		int optionsCount = getDropDownOptionsList(locater).size();
		System.out.println("Total drop down count: " + optionsCount);
		return optionsCount;

	}

}
