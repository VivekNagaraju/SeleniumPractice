package com.it.qa.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// declaration and instantiation of objects/variables  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ac95936\\staf-data\\webdrivers\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver(); 
		
		//Maximize the browser window
		driver.manage().window().maximize();

		// Navigate to target website  
		driver.navigate().to("https://www.lumen.com/en-us/home.html");  

		//Instantiating of Actions class object
		Actions actions = new Actions(driver);

		// Hover on the Solutions tab
		WebElement solutions = driver.findElement(By.xpath("//span[@data-id=\"nav--1059986590\"]"));
		actions.moveToElement(solutions).perform();

		// Hover on the By Industry
		WebElement byIndustry = driver.findElement(By.xpath("//li[@data-id=\"nav-202024983\"]"));
		actions.moveToElement(byIndustry).perform();

		// Click on Retail
		WebElement retail = driver.findElement(By.xpath("//ul[@data-id=\"nav-202024983\"]/li[9]/a"));
		retail.click();

		//Exit from the browser
		driver.quit();
	}  

}
