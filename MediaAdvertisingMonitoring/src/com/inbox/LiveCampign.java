package com.inbox;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LiveCampign {
	WebDriver driver=new FirefoxDriver();
	@Test

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
	 
	 
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);        
		 driver.get(" http://192.168.1.10:8080/sptest/home");
		        System.out.println("Successfully opened the website  snapooh.com");  
		        driver.findElement(By.className("loginBtn")).click();
		        driver.findElement(By.id("emailaddress")).sendKeys("deeps@gmail.com");
		        driver.findElement(By.id("loginpassword")).sendKeys("12345678");
		        driver.findElement(By.id("loginEnter")).click();
		        driver.findElement(By.id("usrUtils")).click();
		        driver.findElement(By.linkText("Campaigns")).click();
		        System.out.println("Successfully opend Campaigns page");
//		        driver.findElement(By.linkText("Live Campaign")).click();
//		        driver.findElement(By.xpath(" html/body/div[2]/div[2]/div/div/div[3]/div[1]/p[2]/label")).click();
//		        System.out.println("Create popup is displayed");
//		        driver.findElement(By.id("campnNameInput")).sendKeys("Jagannath");
//		        driver.findElement(By.id("campnForNameInput")).sendKeys("Regression");
//		        driver.findElement(By.id("campnDescInput")).sendKeys("Automation is powerful and learning tool not a technique");
//		        //DateWidget Start date and end date
//		        driver.findElement(By.id("campnStartInput")).click();
//		        driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[3]/a")).click();
//		        driver.findElement(By.xpath(" .//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[5]/a")).click();
//		        driver.findElement(By.xpath(".//*[@id='CreateCampaignPopup']/div[2]/a[1]")).click();
//		        driver.findElement(By.xpath(".//*[@id='dynamicTable']/tbody/tr[1]/td[7]/div/div/img")).click();
//		        driver.findElement(By.xpath(" .//*[@id='addCreativesPopup']/div[2]/div[1]/div/button[1]")).click();
		 //       driver.findElement(By.xpath(".//*[@id='latestCreatives']/div/div[1]/div[2]/div/button")).click();
		       driver.findElement(By.xpath(".//*[@id='tabs']/ul/li[2]/a")).click();
		        
		        driver.findElement(By.xpath(".//*[@id='dynamicTable']/tbody/tr[1]/td[1]/p/a")).click();
		        Thread.sleep(2000);
				driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div[1]/div[5]/button")).click();
				//Alert alert=driver.switchTo().alert();
				//System.out.println(alert.getText());
				//alert.accept();
				driver.findElement(By.xpath(".//*[@id='searchBarWrapper']/div[1]/p/input")).sendKeys("11111");
				driver.findElement(By.xpath(".//*[@id='searchBarWrapper']/div[1]/p/button")).click();
				driver.findElement(By.xpath(".//*[@id='searchByIdPopup']/div[2]/div[3]/button")).click();
	}
}
