package com.inbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdvanceSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);        
		 driver.get(" http://192.168.1.10:8080/sptest/home");
		        System.out.println("Successfully opened the website  snapooh.com");  
		        driver.findElement(By.className("loginBtn")).click();
		        driver.findElement(By.id("emailaddress")).sendKeys("deeps@gmail.com");
		        driver.findElement(By.id("loginpassword")).sendKeys("12345678");
		        driver.findElement(By.id("loginEnter")).click();
		        driver.findElement(By.xpath(".//*[@id='selCity_chzn']/a/span")).click();
		        driver.findElement(By.xpath(".//*[@id='selCity_chzn_o_1']")).click();
		        driver.findElement(By.xpath(" .//*[@id='selectStreetArea_chzn']/a/span")).click();
		        driver.findElement(By.xpath(" .//*[@id='selectStreetArea_chzn_o_7']']")).click();
		        driver.findElement(By.xpath(" .//*[@id='selectStreetMType_chzn']/a/span")).click();
		        driver.findElement(By.xpath(" .//*[@id='selectStreetMType_chzn_o_1']")).click();
		        driver.findElement(By.xpath(".//*[@id='streetForm']/div[4]/button")).click();
	}

}
