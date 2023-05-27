package testSeleniumSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowserUsingIfElse {

	public static void main(String[] args) {
		String Browser ="InternetExplorerBrowser";
		
		if (Browser=="ChromeBrowser") {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\SeleniumWork\\Browsers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in");
			System.out.println(driver.getTitle());
			driver.quit();
		}
		else if(Browser =="FirefoxBrowser") {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Welcome\\eclipse-workspace\\SeleniumWork\\Browsers\\geckodriver.exe");
			WebDriver mydriver = new FirefoxDriver();
			mydriver.get("https://www.amazon.in");
			System.out.println(mydriver.getTitle());
			mydriver.quit();
		}
		else if (Browser =="InternetExplorerBrowser") {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Welcome\\eclipse-workspace\\SeleniumWork\\Browsers\\IEDriverServer(1).exe");
			WebDriver driver2 = new InternetExplorerDriver();
			driver2.get("https://www.amazon.in");
			driver2.getTitle();
			driver2.quit();
		}

	}

}
