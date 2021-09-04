package com.SDET.testXpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\blver\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver(); //launch chrome

		Driver.manage().window().maximize(); //maximize window
		Driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		Driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		System.out.println("=======================================================================================================");	
		System.out.println("=======================================================================================================");
		System.out.println("=======================================================================================================");
		System.out.println("=======================================================================================================");	
	    System.out.println("=======================================================================================================");	
		System.out.println("=======eBay.com=======");	
		System.out.println("=======================================================================================================");	
		System.out.println("=======================================================================================================");
		System.out.println("=======================================================================================================");
	    System.out.println("=======================================================================================================");	
		System.out.println("=======================================================================================================");	
	    System.out.println("=======================================================================================================");	
		
		Driver.get("https://www.ebay.com/"); //enter the URL
		
		//get the count of links on the page
		//get the text of each link on the page
		List <WebElement> linkList = Driver.findElements(By.tagName("a"));
		
		//size of linklist
		System.out.println("Total is : " + linkList.size());
		
		//print the links from linkList
		for(int i=0;i<linkList.size();i++) {
		String linkText = linkList.get(i).getText();
		System.out.println(linkText);
		}

	    System.out.println("=======================================================================================================");
	    System.out.println("=======================================================================================================");	
	    System.out.println("=======================================================================================================");	
	    System.out.println("=======================================================================================================");	
	    System.out.println("=======================================================================================================");	
	    System.out.println("=======================================================================================================");	
	    System.out.println("=======================================================================================================");	
	    System.out.println("=======Facebook.com========");	
	    System.out.println("=======================================================================================================");	
	    System.out.println("=======================================================================================================");	
	    System.out.println("=======================================================================================================");	
	    System.out.println("=======================================================================================================");	
	    System.out.println("=======================================================================================================");	
	    System.out.println("=======================================================================================================");	
	    System.out.println("=======================================================================================================");	
	    System.out.println("=======================================================================================================");	

		
		Driver.get("https://www.facebook.com/"); //enter the URL
																					
		//get the count of links on the page
		//get the text of each link on the page
		List <WebElement> linkList2 = Driver.findElements(By.tagName("a"));
		
		//size of linklist
		System.out.println("Total is : " + linkList2.size());
				
		//print the links from linkList
		for(int i=0;i<linkList2.size();i++) {
			String linkText2 = linkList2.get(i).getText();
			System.out.println(linkText2);
		}
		
		
		
		Driver.quit();
		
}
}
