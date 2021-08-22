package com.run;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;

public class ExecuteEdgeTest {

	@Test
	public void runTest() throws InterruptedException {

		WebDriverManager m = new EdgeDriverManager();
		
		m.setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://youtu.be/8d21RCZ41Qw");		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@aria-label='Play']")).click(); //Mute (m)
		
		driver.findElement(By.xpath("//button[@aria-label='Mute (m)']")).click();
		
		Thread.sleep(105000);
		
		driver.quit();
		
	}

}
