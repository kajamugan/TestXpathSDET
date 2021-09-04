package com.SDET.testXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicXpath {
      public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\blver\\Desktop\\chromedriver_win32\\chromedriver.exe");
  		WebDriver Driver = new ChromeDriver();
  		Driver.manage().window().maximize();
  		Driver.manage().deleteAllCookies();
  		
  		Driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
  		Driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
  		
		Driver.get("https://classic.freecrm.com/");
		
		Driver.findElement(By.name("username")).sendKeys("user");
		Driver.findElement(By.name("password")).sendKeys("******");
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Driver.switchTo().frame("mainpanel");
		//Driver.findElement(By.xpath("//frame[@name='mainpanel']"));
		Thread.sleep(2000);
		
		Driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		Driver.findElement(By.xpath("//a[text()='kaja blver')]//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
		

  	    
      }
}
