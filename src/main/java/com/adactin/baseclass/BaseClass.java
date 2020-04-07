package com.adactin.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver broswerLaunch(String broswerName) {
		try {
			if (broswerName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Vigneshwari\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
				driver = new ChromeDriver();

			}

			else if (broswerName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\Vigneshwari\\eclipse-workspace\\SeleniumPractice\\driver\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}

			else {
				System.out.println("Invalid broswer");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	public static void inputtoWebElement(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void mouseclick(WebElement element) {

		element.click();
	}

	public static void enterurl(String url) {

		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void naviback() {

		driver.navigate().back();
	}

	public static void naviforward() {

		driver.navigate().forward();

	}

	public static void navito(String url) {

		driver.navigate().to(url);

	}

	public static void dropDownMethod(WebElement element, String option, String value) {

		Select s = new Select(element);
		if (option.equalsIgnoreCase("Value")) {
			s.selectByValue(value);
		}

		else if (option.equalsIgnoreCase("VisibleText")) {
			s.selectByVisibleText(value);
		}

		else if (option.equalsIgnoreCase("Index")) {
			int i = Integer.parseInt(value);
			s.selectByIndex(i);
		}
	}

	public static void actionMethod(WebElement element, String option) {

		Actions ac = new Actions(driver);

		if (option.equalsIgnoreCase("Element")) {
			ac.moveToElement(element).perform();
			;

		}

		else if (option.equalsIgnoreCase("context")) {
			ac.contextClick(element).perform();
		}
	}

}
