package testng2;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day6javaexecutor {

	WebDriver driver;
	
	@Test
	public void TestCase1() {
		//javascript executor to click on element
		
			System.setProperty("webdriver.Chrome.driver",
					"C:\\Users\\sharm\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.webdriveruniversity.com/");
		
			// driver.findElement(By.id("contact-us")).click();
			 WebElement contactUsLink = driver.findElement(By.id("contact-us"));
			 JavascriptExecutor je = (JavascriptExecutor)driver;
			 je.executeScript("arguments[0].click()",contactUsLink, null);
		
	driver.close();
	}
	
	
	
	//conditon 2
	// javascript executor to click on element
	
	
	@Test()
	public void Testcase2() throws InterruptedException {
	System.setProperty("webdriver.Chrome.driver",
			"C:\\Users\\sharm\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.webdriveruniversity.com/");
	
	// driver.findElement(By.id("contact-us")).click();
	 WebElement scrollElement = driver.findElement(By.id("scrolling-around"));
	 JavascriptExecutor je = (JavascriptExecutor)driver;
	 je.executeScript("arguments[0].scrollIntoView(true)",scrollElement);
Thread.sleep(5000);
driver.close();
	}
	  
	// condition 3
	// javascript executor to click on element
	
	@Test()
	
	public void Testcase3() throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\sharm\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/");
		
		
		 WebElement scrollElement = driver.findElement(By.id("scrolling-around"));
		 JavascriptExecutor je = (JavascriptExecutor)driver;
		 je.executeScript("arguments[0].setAttribute('data-cy','two')",scrollElement);
		 //je.executeScript("arguments[0].removeAttribute('data-cy')",scrollElement);
		String attributeValue = scrollElement.getAttribute("data-cy");
	
		 System.out.println(attributeValue);
		 
	driver.close();
	
	
	}	
	
	//condition 5 for title
	
	 @Test
	
	public void Testcase4() {
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\sharm\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/");
		
			 WebElement scrollElement = driver.findElement(By.id("scrolling-around"));
		 JavascriptExecutor je = (JavascriptExecutor)driver;
		 
		 
		String title = (String)je.executeScript("return document.title;");
	// First parameter of javascriptExecutor is script
		Assert.assertEquals(title, "WebDriverUniversity.com");
		
	driver.close();
	} 
	
	// condtion 5 Double click
	@Test
	
	public void Testcase5() {
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\sharm\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Actions/index.html");
		
		Actions ac = new Actions(driver);
		 WebElement e = driver.findElement(By.id("double-click"));
		 ac.doubleClick(e).build().perform();
		 String className = e.getAttribute("class");
		 
		Assert.assertEquals(className,"div-double-click double");
		
	driver.close();
	
	
	
}}


	

