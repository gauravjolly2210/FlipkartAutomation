package com.qait.automation.flipkartMobileAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Login {
	
	AndroidDriver driver;
	
	public Login(AndroidDriver driver) {
		this.driver=driver;
	}
	public void entering_App(DesiredCapabilities caps) throws MalformedURLException {
		caps.setCapability("appPackage", "com.flipkart.android");
        caps.setCapability("appActivity", ".activity.HomeFragmentHolderActivity");
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);

	}
	public void Signing_up() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("btn_mlogin")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("mobileNo")).click();
		driver.findElement(By.id("com.google.android.gms:id/cancel")).click();;
		Thread.sleep(1000);
		driver.findElement(By.id("mobileNo")).sendKeys("8745059424");
		Thread.sleep(1000);
		driver.findElement(By.id("et_password")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("et_password")).sendKeys("jolly22");
		Thread.sleep(1000);
		driver.findElement(By.id("btn_mlogin")).click();
		
	}

}
