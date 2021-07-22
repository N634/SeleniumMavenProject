package com.Jenkins.com.Jenkins;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreestyleProject {
      
	WebDriver driver;
	
	@BeforeClass
	public void setUp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//String url = Configuration.getConfig("Url");
		driver.get("https://www.jcpenney.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void checkPageTitle() {
		String text = driver.getTitle();
		Assert.assertEquals(text, "JCPenney: Window & Home Decor, Bedding, Clothing & Accessories");
		
	}
	

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}

