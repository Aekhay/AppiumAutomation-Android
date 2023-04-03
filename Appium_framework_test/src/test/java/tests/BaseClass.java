package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ExtentReports.ERdemo;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass extends ERdemo{

	static AndroidDriver driver;
	

	@BeforeTest
	public void setup() {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0.0");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus 6T");
			cap.setCapability(MobileCapabilityType.UDID, "192.168.100.9:5555");
//			cap.setCapability(MobileCapabilityType.UDID, "810b9bb6");
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60); // waiting for a new command from client
																				// side
			// cap.setCapability(MobileCapabilityType.APP, "");
//			cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			cap.setCapability(MobileCapabilityType.APP, "/Users/wrp/git/AppiumAutomation-Android/Appium_framework_test/src/test/resources/apps/Sun & Sand Sports Shopping App_2.4.6_Apkpure.apk");
			cap.setCapability("unicodeKeyboard", true);
			cap.setCapability("resetKeyboard", true);
			
			try {
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
//			driver = new AppiumDriver(url, cap); // parent driver for android,ios and windows
			driver = new AndroidDriver(url, cap); //extend capabilities specific to android
//			driver = new IOSDriver(url, cap); //extend capabilities specific to ios

		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println("Cause is" + exp.getCause());
			System.out.println("Cause is" + exp.getMessage());
			exp.printStackTrace();
		}

	}
	
	
	@Test
	public void sampleTest() throws InterruptedException {
		System.out.println("Sample Test");
		
	}

	@AfterTest
	// Make sure the above library is properly imported from TestNG annotations
	public void teardown() {
		if (driver != null)
		      driver.quit();
	}

}
