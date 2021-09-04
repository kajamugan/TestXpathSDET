package com.SDET.testXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\blver\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver(); //launch chrome

		Driver.manage().window().maximize(); //maximize window
		Driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		Driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		Driver.get("https://www.ebay.com/"); //enter the URL
		
		//------------------customized xpath------------------------------
		//Driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("java");
		
		//Driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("java");
		
		//Driver.findElement(By.xpath("//input[contains(@class, 'gh-tb ui-autocomplete-input')]")).sendKeys("java");
		
		Driver.findElement(By.xpath("//input[starts-with(@name, '_n')]")).sendKeys("java");
		
        Driver.findElement(By.xpath("//a[contains(text(), 'My eBay')]")).click();
         
        //-------------------absolute xpath---------------------------------
        //Driver.findElement(By.xpath("//*[@id=\"gh-eb-My\"]/div/a[1]")).click();
		
        Driver.close();
		
}
}
