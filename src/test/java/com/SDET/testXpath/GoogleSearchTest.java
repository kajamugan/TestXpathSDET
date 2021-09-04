package com.SDET.testXpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
     public static void main(String[] args) {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\blver\\Desktop\\chromedriver_win32\\chromedriver.exe");
   		WebDriver Driver = new ChromeDriver();
   		Driver.manage().window().maximize();
  		Driver.manage().deleteAllCookies();
   		
  		Driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
 		Driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
 		
 		Driver.get("https://www.google.com");
 		
 		Driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testing");
 		
 		List <WebElement> list = Driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
 		
 		System.out.println("Total number of sugestions : " + list.size());
 		
 		for(int i=0; i<list.size(); i++) {
 			System.out.println(list.get(i).getText());
 			if(list.get(i).getText().contains("testing tools")) {
 				list.get(i).click();
 				break;
 			}
 		}
 		
 		Driver.quit();
 		
	}
}
