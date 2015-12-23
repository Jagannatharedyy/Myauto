package com.inbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Inbox {
	public static void main(String[] args)  {
		 
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);        
		 driver.get(" http://192.168.1.10:8080/sptest/home");
		        System.out.println("Successfully opened the website  snapooh.com");  
		        driver.findElement(By.className("loginBtn")).click();
		        driver.findElement(By.id("emailaddress")).sendKeys("deeps@gmail.com");
		        driver.findElement(By.id("loginpassword")).sendKeys("12345678");
		        driver.findElement(By.id("loginEnter")).click();
		        driver.findElement(By.id("usrUtils")).click();
		        driver.findElement(By.linkText("Monitor view")).click();
		        driver.findElement(By.className("linkCampaignNow")).click();
		        driver.findElement(By.xpath(".//*[@id='addCampaignCreativesPopup']/div[1]/div[2]/div/div[1]/div/div[1]/div/label/input")).click();
		        //Note: Write loop for the selecting a radio button isSelected()
		        driver.findElement(By.xpath(" .//*[@id='addCampaignCreativesPopup']/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/label/input")).click();
		        driver.findElement(By.xpath(" .//*[@id='addCampaignCreativesPopup']/div[1]/div[2]/div/div[1]/div/div[1]/div/label/div[2]/div/a")).click();       
	
	}
}