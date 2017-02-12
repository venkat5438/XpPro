package com.ondot.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenimMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\naa files\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.facebook.com/login.php?login_attempt=1&lwv=110");
		w.findElement(By.name("email")).sendKeys("venkatramreddy108@gmail.com");
		w.findElement(By.name("pass")).sendKeys("execute");
		w.findElement(By.name("login")).click();
		
		//WebElement ele=w.findElement(By.name("email"));
		//ele.sendKeys("venkatramreddy108@gmail.com");
		//String str= ele.getAttribute("name");
		//System.out.println(str);
		//ele.submit();
	    w.wait(5000);
	    //w.close();
	    w.quit();

	}

}
