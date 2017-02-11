package com.ondot.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\naa files\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://google.com");
		WebElement e=w.findElement(By.name("q"));
		Thread.sleep(5000);
		e.sendKeys("maheshbabu");
		e.submit();
		Thread.sleep(5000);
		w.quit();

	}

}
