package com.qait.automation.flipkartMobileAutomation;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumTest {

	public static void main(String[] args) {

		String path = "/home/himanshuchaudhary/Android/Sdk/tools/base.apk";
		File app=new File(path);
		
		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Nexus_5");
		caps.setCapability("udid", "emulator-5554"); // Give Device ID of your
														// mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.1.1");
		caps.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		caps.setCapability("appActivity", "com.amazon.micron.SignInPromptActivity");
		caps.setCapability("noReset", "true");
		caps.setCapability("clearSystemFiles","true");
		caps.setCapability("autoGrantPermissions","true");
//		caps.setCapability("app", app.getAbsolutePath());
		
		// Instantiate Appium Driver
		try {
			AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

			driver.findElement(By.id("sign_in_button")).click();
//			driver.findElement(By.id("url_bar")).sendKeys("10.0.1.86/tatoc");
//			driver.findElement(By.xpath("//android.view.ViewGroup[@index='0' and @clickable='true']")).click();

			//			driver.findElement(By.id("button")).click();
			((AppiumDriver)driver).quit();
//			driver.close();
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}

}