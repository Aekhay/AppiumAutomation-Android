package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;

public class Testcases extends BaseClass {

//	@Test
//	public void test1() throws InterruptedException {
//		ExtentTest test = extent.createTest("Test1","Sample Testcase");
//        test.log(Status.INFO, "Test 1 started");
//
//        
//		driver.get("https://www.google.com/");
//		
//        test.log(Status.PASS, "Navigated to https://www.google.com/ ");
//		driver.findElement(By.name("q")).sendKeys("Appium");
//		test.log(Status.PASS, "Enter Appium in google search box");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		test.log(Status.PASS, "Hit keyboard enter key");
//		Thread.sleep(5000);
//		test.log(Status.INFO, "Testcase is successfully completed...");
//	}
//
//	@Test
//	public void FacebookLogin() throws InterruptedException {
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(3000);
//		driver.findElement(By.id("m_login_email")).click();
//		driver.findElement(By.id("m_login_email")).sendKeys("Testiosdev1@gmail.com");
//		driver.findElement(By.id("m_login_password")).click();
//		driver.findElement(By.id("m_login_password")).sendKeys("Test@dev1");
//		driver.findElement(By.name("login")).click();
//		Thread.sleep(5000);
////		driver.findElement(By.cssSelector("svg.x3ajldb > g")).click();
////		driver.findElement(By.xpath("//div[@id='mount_0_0_yQ']/div/div/div/div[2]/div[5]/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[5]/div/div/div[2]/div/div/div/div/span"))
////				.click();
//
//	}

	@Test (priority=1)
	public void test_SSS_GuestChk() throws InterruptedException {

		ExtentTest testSSS = extent.createTest("Testing Results", "SSS Guest Checkout");
		testSSS.log(Status.INFO, "Test 1 started");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView[1]"));
		el.click();
		testSSS.log(Status.PASS, "Launching application and selecting country");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView")));
		WebElement el2 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView"));
		el2.click();

		testSSS.log(Status.PASS, "Selecting gender");

		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.ImageView")));
		WebElement el3 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.ImageView"));
		el3.click();
		Thread.sleep(5000);
		testSSS.log(Status.PASS, "Selecting Men Category");

		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait3.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//android.widget.FrameLayout[@content-desc=\"Category\"]/android.widget.ImageView")));
		WebElement el4 = driver.findElement(
				By.xpath("//android.widget.FrameLayout[@content-desc=\"Category\"]/android.widget.ImageView"));
		el4.click();
		testSSS.log(Status.PASS, "Going to category screen");

		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout")));
		WebElement el5 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout"));
		el5.click();
		testSSS.log(Status.PASS, "Clicking search field");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el6 = driver.findElement(By.id("com.sssports.sssports:id/searchField"));
		el6.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String Searchtext = "Shirts";
		el6.sendKeys(Searchtext);
		testSSS.log(Status.PASS, "Searching " + Searchtext);
//		el6.sendKeys(Keys.ENTER);
//		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el7 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView"));
		el7.click();
		testSSS.log(Status.PASS, "Navigate to PLP for " + Searchtext);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el8 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.Button"));
		el8.click();
		testSSS.log(Status.PASS, "Navigate to PDP");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el9 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView"));
		el9.click();
		testSSS.log(Status.PASS, "Selecting product available size");

		// Add to bag
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el10 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.Button"));
		el10.click();
		testSSS.log(Status.PASS, "Adding product to bag");

		// Checkout Securely mini bag
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el11 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[5]"));
		el11.click();
		testSSS.log(Status.PASS, "Clicking checkout securely from mini bag");

		// Estimated Delivery message
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el12 = driver.findElement(By.id("com.sssports.sssports:id/tvDeliveryDay"));
		String elText = el12.getText();
		System.out.println(elText);
		testSSS.log(Status.PASS, "Checking product is added to cart by" + elText);

		// Total Value
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el13 = driver.findElement(By.id("com.sssports.sssports:id/totalValue"));
		String elText2 = el13.getText();
		System.out.println(elText2);
		testSSS.log(Status.PASS, "Checking product total cart value: " + elText2);

		// Checkout Securely again
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el14 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView"));
		el14.click();
		testSSS.log(Status.PASS, "Clicking Checkout Securely from cart");

		// Enter Guest email
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el15 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
		el15.click();
		el15.sendKeys("Testiosdev1+1@gmail.com");
		testSSS.log(Status.PASS, "Entering guest email address");

//		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "enter"));

		// Continue as guest btn
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el16 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[3]"));
		el16.click();
		testSSS.log(Status.PASS, "Clicking Continue as guest button");

		Thread.sleep(5000);
		
		// Confirm location permission
//		WebDriverWait waitnew = new WebDriverWait(driver, Duration.ofSeconds(10));
//		waitnew.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
//				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")));
		WebElement el17 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]"));
		el17.click();

		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement el17 = driver.findElement(By.xpath(
//				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]"));
//		el17.click();
//		testSSS.log(Status.PASS, "Confirming location permission dialogbox");
//		Thread.sleep(5000);
		// Pin location
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el18 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.LinearLayout/android.widget.EditText"));
		el18.click();
		testSSS.log(Status.PASS, "Starting pinning location");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el18new = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText"));
		el18new.sendKeys("Al Barsha 1");
		testSSS.log(Status.PASS, "Searching location");

		// Select location
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el19 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView[1]"));
		el19.click();
		testSSS.log(Status.PASS, "Selecting searched location from results");

		// Confirm location
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el20 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.TextView"));
		el20.click();
		testSSS.log(Status.PASS, "Clicking on Confirm location button");

		// Address form
		// Flat
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el21 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
//		el21.click();
		el21.sendKeys("Test flat");
		testSSS.log(Status.PASS, "Entering flat field text");

		// Building
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el22 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
//		el22.click();
		el22.sendKeys("Test Building");
		testSSS.log(Status.PASS, "Entering building field text");

		// Landmark
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el23 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
//		el23.click();
		el23.sendKeys("Test landmark");
		testSSS.log(Status.PASS, "Entering landmark field text");

		// Personal info
		// Title
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el24 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[1]"));
		el24.click();
		testSSS.log(Status.PASS, "Selecting title");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el25 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]"));
		el25.click();

		// Firstname
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el26 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
//		el26.click();
		el26.sendKeys("Aaqib");
		testSSS.log(Status.PASS, "Entering firstname field text");

		// lastname
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el27 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
//		el27.click();
		el27.sendKeys("QA");
		testSSS.log(Status.PASS, "Entering lastname field text");

		// Swipe down

		WebElement element = (WebElement) driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)"
						+ ".scrollIntoView(new UiSelector().text(\"Mobile Number*\"))"));
		testSSS.log(Status.PASS, "Scrolling down");

		// Mobile
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el28 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
//		el28.click();
		el28.sendKeys("501254875");
		testSSS.log(Status.PASS, "Entering mobile number field text");

		// Save address
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el29 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.Button"));
		el29.click();
		testSSS.log(Status.PASS, "Saving address form");
		// OTP
		Thread.sleep(15000);

		// Close card toggle
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement el30 = driver.findElement(By.xpath(
//				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.RelativeLayout/android.widget.ToggleButton"));
//		el30.click();

		WebDriverWait waitneww = new WebDriverWait(driver, Duration.ofSeconds(60));
		waitneww.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.RelativeLayout/android.widget.ToggleButton")));
		WebElement el30 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.RelativeLayout/android.widget.ToggleButton"));
		el30.click();
		testSSS.log(Status.PASS, "Unchecking credit card toggle");
		Thread.sleep(5000);

		// Swipe down on checkout

		boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
				ImmutableMap.of("left", 100, "top", 100, "width", 200, "height", 200, "direction", "down", "percent",
						3.0));
		testSSS.log(Status.PASS, "Swipping down");
		// Check COD toggle
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el31 = driver.findElement(By.xpath("//*[contains(@text,'Pay with Cash')]"));
		el31.click();
		testSSS.log(Status.PASS, "Checking cash on delivery toggle");

		// Check place order is enabled
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el32 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button"));
		boolean buttonEnabled = el32.isEnabled();
		if (buttonEnabled == true) {
			System.out.println("Place order button is enabled");
			testSSS.log(Status.PASS, "Validating Place order button is enabled");

		} else {
			System.out.println("Place order button is disabled");
			testSSS.log(Status.FAIL, "Validating Place order button is disabled");
		}

		Thread.sleep(5000);
		testSSS.log(Status.INFO, "Testcase completed..");
	}

//	@Test (priority=2)
//	public void test_SSS_login() {
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement el = driver.findElement(By.xpath(
//				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView[1]"));
//		el.click();
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
//				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView")));
//		WebElement el2 = driver.findElement(By.xpath(
//				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView"));
//		el2.click();
//
//		// Clicking account icon
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement el33 = driver.findElement(By.xpath("//*[contains(@text,'Account')]"));
//		el33.click();
//
//		// Click Sign in
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement el34 = driver.findElement(By.xpath("//*[contains(@text,'Sign In')]"));
//		el34.click();
//		
//		//Email field
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement el35 = driver.findElement(By.xpath("//*[contains(@text,'Email')]"));
//		String email = "Testiosdev1@gmail.com";
//		el35.sendKeys(email);
//		
//		//Password field
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement el36 = driver.findElement(By.xpath("//*[contains(@text,'Password')]"));
//		String pass = "Test@123";
//		el36.sendKeys(pass);
//		
//		//Signin button
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement el37 = driver.findElement(By.xpath("//*[contains(@text,'Sign In')]"));
//		el37.click();
//		
//		//Validate correct login
//		WebElement el38 = driver.findElement(By.xpath("//*[contains(@text,'Hi, Test QA')]"));
//		String loginname = el38.getText();
//		boolean buttonDisplayed = el38.isDisplayed();
//		if (buttonDisplayed == true) {
//			System.out.println("Logged in as " +  loginname);
//			
//
//		} else {
//			System.out.println("Wrong login");
//			
//		}
//
//	}

}
