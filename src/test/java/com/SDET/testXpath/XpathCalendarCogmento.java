package com.SDET.testXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathCalendarCogmento {
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
		Driver.findElement(By.xpath("//a[@href='/calendar']")).click();
		
		String date = "31-August-2021";
		String dateArr[] = date.split("-");
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];
		
//		Select selectm = new Select(Driver.findElement(By.name("slctMonth")));
//		selectm.selectByVisibleText(month);	
//		
//		Select selecty = new Select(Driver.findElement(By.name("slctYear")));
//		selecty.selectByVisibleText(year);
//		
		//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[7]
		
		//*[@id="main-content"]/div/div[2]/div/div[2]/div/div[2]/div[7]/div[2]/div/div[2]
		
		String beforeXpath = "//*[@id=\"main-content\"]/div/div[2]/div/div[2]/div/div[2]/div[";
		String afterXpath = "]/div[2]/div/div[";
		
		final int totalWeekDays = 7;
		boolean flag = false;
		String dayVal = null;
		
		for (int rowNum=2; rowNum<=7; rowNum++ ) {
			for(int colNum=1; colNum<=totalWeekDays; colNum++) {
				 try {
				dayVal = Driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getText();
				}catch(NoSuchElementException e) {
					System.out.println("Please enter a valid date value");
					flag=false;
					 break;
				}
				System.out.println(dayVal);
				if(dayVal.equals(day)) {
					Driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).click();
					flag = true;
					break;
				}
			}
			if(flag) {
				break;
			}
		}	
		
		Driver.close();	
		
	}
}
