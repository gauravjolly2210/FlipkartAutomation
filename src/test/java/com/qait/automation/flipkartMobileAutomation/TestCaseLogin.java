package com.qait.automation.flipkartMobileAutomation;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TestCaseLogin {
	DesiredCapabilities caps;
	AndroidDriver driver;
	AppInstallation install;
	Login login;
	@BeforeClass
	public void setting_Capabilites_Of_Device() {
		caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Nexus_5");
		caps.setCapability("udid", "emulator-5554"); 
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.1.1");
	}
	
	@Test
	public void Step_02_Entering_Flipkart() throws MalformedURLException {
		login=new Login(driver);
		login.entering_App(caps);
	}
	@Test
	public void Step_03_Logging_in_the_Flipkart() throws InterruptedException {
		login.Signing_up();
	}
	

}
