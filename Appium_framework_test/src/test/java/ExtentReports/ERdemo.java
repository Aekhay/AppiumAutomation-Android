package ExtentReports;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ERdemo {

	protected ExtentReports extent;
	ExtentSparkReporter spark;

	@BeforeTest
	public void reportSetUp() {

		extent = new ExtentReports();
		spark = new ExtentSparkReporter(
				"/Users/wrp/eclipse-workspace/Appium_framework_test/src/test/java/ExtentReports/Spark/Spark.html");
		extent.attachReporter(spark);

	}

	@AfterSuite
	public void reporttearDown() {
		extent.flush();

	}

}
