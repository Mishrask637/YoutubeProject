package com.run;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

public class ExecuteFireFoxTest {

	@Test
	public void runTest() throws InterruptedException {

		WebDriverManager m = new FirefoxDriverManager();
		
		m.setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://youtu.be/8d21RCZ41Qw");		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@aria-label='Play']")).click(); //Mute (m)
		
		driver.findElement(By.xpath("//button[@aria-label='Mute (m)']")).click();
		
		Thread.sleep(105000);
		
		driver.quit();
		
	}

}
