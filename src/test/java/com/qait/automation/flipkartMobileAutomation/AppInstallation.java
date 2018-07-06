package com.qait.automation.flipkartMobileAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AppInstallation {

	AndroidDriver driver;
	public AppInstallation(AndroidDriver driver) {
		this.driver=driver;
	}
	
	public void installing_App(DesiredCapabilities caps) throws MalformedURLException, InterruptedException {
		caps.setCapability("appPackage", "com.android.vending");
		caps.setCapability("appActivity", ".AssetBrowserActivity");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		Thread.sleep(5000);
		driver.findElement(By.id("search_box_idle_text")).click();
        driver.findElement(By.id("search_box_text_input")).sendKeys("flipkart");
        Thread.sleep(2000);
        driver.findElement(By.id("com.android.vending:id/text_frame")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("android.widget.Button")).click();
        Thread.sleep(8000);
        driver.closeApp();
	}
}
