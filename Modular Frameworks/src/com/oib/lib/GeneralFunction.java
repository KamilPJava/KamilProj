package com.oib.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeneralFunction extends GlobalData{
	//rule-TO maintain all
	//re-usable fun: related to whole application
	
	public void openApplication() throws Exception {
	System.setProperty("webdriver.gecko.driver", "D:\\Selenium1\\Driver\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	 driver = new FirefoxDriver();
	driver.navigate().to(url);
	System.out.println("Application Opened");
	Thread.sleep(3000);
	}
	
	public void login() throws Exception {
	driver.findElement(By.name(textbox_login_name)).sendKeys(loginname);
	driver.findElement(By.name(txtbox_password_name)).sendKeys(password);
	driver.findElement(By.name(button_login_name)).click();
	System.out.println("Login completed");
    Thread.sleep(3000);
	}
	//ADD
	public void ADD() throws Exception {
		driver.switchTo().frame(AddName);
	driver.findElement(By.xpath("//input[@value='Add']")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.name(First_Name)).sendKeys(FirstName);	
	driver.findElement(By.name(Last_Name)).sendKeys(LastName);	
	Thread.sleep(3000);
	driver.findElement(By.className(SaveButton)).click();
	System.out.println("Add emp Completed");
	driver.switchTo().defaultContent();
	}
	public void logout() throws Exception {
	driver.findElement(By.linkText(link_logout_linktext)).click();
	System.out.println("Logout completed");
	Thread.sleep(3000);
	}
	public void closeApplication() {
        driver.quit();
        System.out.println("Application closed");
}
	}

	

