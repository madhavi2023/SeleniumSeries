package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {

	@BeforeSuite
	public void startDBConnection() {
		System.out.println("BS-- startDBConnection");
	}

	@BeforeTest
	public void createUser() {
		System.out.println("BT-- createUser");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC-- launchBrowser");

	}

	@BeforeMethod
	public void loginToApp() {
		System.out.println("BMS-- loginToApp");

	}

	@Test
	public void homePageTitleTest() {
		System.out.println("homePageTitleTest");
	}

	@Test
	public void homePageURLTest() {
		System.out.println("homePageURLTest");
	}

	@Test
	public void homePageSearchTest() {
		System.out.println("homePageSearchTest");
	}

	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS-- disconnectWithDB");
	}

	@AfterTest
	public void deleteUser() {
		System.out.println("AT-- deleteUser");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("AC-- closeBrowser");

	}

	@AfterMethod
	public void logout() {
		System.out.println("AM-- logout");

	}

}
