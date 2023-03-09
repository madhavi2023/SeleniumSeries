package SeleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {

		String browserName = "chrome";
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver(browserName);
		brUtil.launchUrl("https://www.amazon.com");
		String actTitle = brUtil.getPageTitle();
		if (actTitle.contains("Amazon")) {
			System.out.println("Title : Pass");
		} else {
			System.out.println("Title : Fail");
		}

		String actUrl = brUtil.getPageUrl();
		if (actUrl.contains("amazon")) {
			System.out.println("URL : Pass");
		} else {
			System.out.println("URL  : Fail");
		}
		
		brUtil.quitBrowser();
	}

}
