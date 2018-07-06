package com.qait.automation.flipkartMobileAutomation;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TestCasesInstallation {
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
	public void Step_01_installing_APP_using_AppStore() throws MalformedURLException, InterruptedException {
		install=new AppInstallation(driver);
		install.installing_App(caps);
	}
	
}
