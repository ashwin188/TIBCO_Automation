package Config;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class BaseTest {
	public static ExtentTest extentTest;
	public static String baseDir;   
	public static String screenshotDirName;
	public static WebDriver driver; 
	public static ExtentReports report = null;
	
	@Parameters({ "environment", "browser", "url", "baseDirPath","platform",
			"screenshotDirName"})
	@BeforeSuite
	public static void setup(String environment, String browser, String url,
			String baseDirPath, String platform, String screenshotfolderName) throws Exception {
	
		
		baseDir = baseDirPath;
		screenshotDirName = screenshotfolderName;
		report = Reports.getReports(baseDirPath);
		report.addSystemInfo("Environment", environment);

		driver = Driver.getDriver(browser);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies() ;
		driver.get(url);
	
	}

	@AfterSuite
	public static void tearDown() throws Exception {
		
      driver.quit();
	}

	@BeforeMethod
	public void nameBefore(Method method) {

		extentTest = report
				.startTest(
						method.getName(),
						method.getAnnotation(org.testng.annotations.Test.class)
								.description())
				.assignCategory(
						method.getAnnotation(org.testng.annotations.Test.class)
								.groups())
				.assignAuthor("Ashwin Gangadharan");
		System.out.println("we are in " + method.getName());

	}

	@AfterMethod
	public void afterMethod(Method method) {
		report.endTest(extentTest);
		report.flush();
	}

	@BeforeClass
	public void beforeclass() {

		String className = this.getClass().getSimpleName();
		String[] parts = className.split("T", 2);
		String string1 = parts[0];
		System.out.println("Class name: " + string1);
		Class s;
		
		try {
			s = Class.forName("page.objects." + string1 + "Objects");
			Object t = s.newInstance();
			PageFactory.initElements(driver, t);
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
