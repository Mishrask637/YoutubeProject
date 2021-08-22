package com.run;

import org.junit.Test;
import org.junit.internal.runners.JUnit38ClassRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class ExecuteChromeTest {

	@Test
	public void runTest() throws InterruptedException {
		
		WebDriverManager m = new ChromeDriverManager();
		
		m.setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://youtu.be/8d21RCZ41Qw");		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@aria-label='Mute (m)']")).click();
		
		Thread.sleep(105000);
		
		driver.quit();
		
	}

}
