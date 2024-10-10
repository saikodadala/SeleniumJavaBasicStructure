package seleniumtest.test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	@org.testng.annotations.Test
	public void Test() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saik7\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.addArguments("— headless"); // Run Chrome in headless mode
//		chromeOptions.addArguments("— remote-allow-origins=*"); // for chrome version control
//		chromeOptions.addArguments("— incognito"); 
		chromeOptions.setAcceptInsecureCerts(true);// SSL certificate
		WebDriver driver= new ChromeDriver(chromeOptions);

		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String title=driver.getTitle();
		
		
		System.out.println("title of application is:"+ title);
	}

}
