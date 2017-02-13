// below we created WebDriver interface and having unimplemented methods and we ahev to implement this methods uing implements keyword
package com.ondot.common;

public interface WebDriver {
	
	public void get();
	public void close();
	public void findElement();
	public void manage();
	public void getCurrentUrl();
	public void getTitle();
	public void navigate();
	public void getWindowHandle();
	public void quit();
	

}
