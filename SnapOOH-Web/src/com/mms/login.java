package com.mms;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {
	public static void main(String[] args) throws IOException  {
		 
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);        
		 driver.get(" http://192.168.1.10:8080/sptest/home");
		        System.out.println("Successfully opened the website  snapooh.com");  
		        driver.findElement(By.className("loginBtn")).click();
		        driver.findElement(By.id("emailaddress")).sendKeys("abc@snapooh.com");
		        driver.findElement(By.id("loginpassword")).sendKeys("87654321");
		        driver.findElement(By.id("loginEnter")).click();
		      driver.findElement(By.id("usrUtils")).click();
		      System.out.println("Succussfully opened Monitor view page");
		      driver.findElement(By.xpath(".//*[@id='homeMainContainer']/div[1]/div/div/div[1]/div/ul/li[2]/a")).click();
		      driver.findElement(By.id("dateRangeInput")).click();
		      driver.findElement(By.xpath("html/body/div[9]/div/ul/li[4]/a")).click();
		      driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div[2]/ul/li[2]/a")).click();
		      File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	  // Now you can do whatever you need to do with it, for example copy somewhere
	    	  FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
	}
	}