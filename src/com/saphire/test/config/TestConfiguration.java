package com.saphire.test.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.saphire.util.GetData;

public class TestConfiguration {
	public static WebDriver createDriverInstance(){
		WebDriver driver=null;
		String browser=GetData.fromProperties("configuration","browser");
		String url=GetData.fromProperties("configuration","url");
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "./browser-server/geckodriver.exe");
			driver=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.gecko.driver", "./browser-server/chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "./browser-server/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}else{
			System.out.println("Invlid browser option");
		}
		driver.get(url);
		return driver;
	}
}
