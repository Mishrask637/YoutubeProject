/*
 * package com.run;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.ie.InternetExplorerDriver;
 * 
 * import io.github.bonigarcia.wdm.WebDriverManager; import
 * io.github.bonigarcia.wdm.managers.ChromeDriverManager; import
 * io.github.bonigarcia.wdm.managers.InternetExplorerDriverManager;
 * 
 * public class ExecuteIE {
 * 
 * public static void main(String[] args) throws InterruptedException {
 * 
 * WebDriverManager m = new InternetExplorerDriverManager();
 * 
 * m.setup();
 * 
 * WebDriver driver = new InternetExplorerDriver();
 * 
 * driver.get("https://youtu.be/8d21RCZ41Qw");
 * 
 * driver.manage().window().maximize();
 * 
 * driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
 * 
 * driver.findElement(By.xpath("//button[@aria-label='Mute (m)']")).click();
 * 
 * Thread.sleep(105000);
 * 
 * driver.quit();
 * 
 * }
 * 
 * }
 */