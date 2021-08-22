package com.run;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Mute (m)']"))).isEnabled();
		
		driver.findElement(By.xpath("//button[@aria-label='Mute (m)']")).click();
		
		Thread.sleep(105000);
		
		driver.quit();
		
	}

}
