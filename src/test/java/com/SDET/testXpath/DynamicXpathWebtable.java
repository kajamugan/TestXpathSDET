package com.SDET.testXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathWebtable {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\blver\\Desktop\\chromedriver_win32\\chromedriver.exe");
	  		WebDriver Driver = new ChromeDriver();
	  		Driver.manage().window().maximize();
	 		Driver.manage().deleteAllCookies();
	  		
	 		Driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			Driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			
			Driver.get("https://www.freecrm.com/");
			
			Driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
			Driver.findElement(By.xpath("//input[@name='email']")).sendKeys("user");
			Driver.findElement(By.xpath("//input[@name='password']")).sendKeys("****");
			Thread.sleep(3000);
			Driver.findElement(By.xpath("//div[text()='Login']")).click();
			Thread.sleep(3000);
			Driver.findElement(By.xpath("//a[@href='/contacts']")).click();
			
			//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[1]/td[2]
			//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[2]/td[2]
			//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[3]/td[2]
			//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[4]/td[2]
			
			//Method - 1
			
//			String beforeXpath = "//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[";
//			String afterXpath = "]/td[2]";
//			
//			for(int i=1;i<=4;i++) {
//				String name = Driver.findElement(By.xpath(beforeXpath+i+afterXpath)).getText();
//				System.out.println(name);
//				if(name.contains("steve jobs")) {
//					//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[4]/td[1]/div/input
//					//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[4]/td[1]
//					Driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr["+i+"]/td[1]")).click();
//					
//				}
//			}
			
			//Method -2 
			Driver.findElement(By.xpath("//a[text()='steve jobs']//parent::td//preceding-sibling::td//div[@class='ui fitted read-only checkbox']")).click();
			
		
		}
}
