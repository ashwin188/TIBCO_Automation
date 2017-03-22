package Config;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.relevantcodes.extentreports.LogStatus;


public class BasePageActions extends BaseTest {

	public static String pass;
	public static String teci;
	public static String text;
	public static String actual1;
	public static String textOFElement;
	public static String report_date;
	public static String report_date1 ;
	public static String mahi;
	

	public static void click(WebElement locator, String description, String tc) {
		try {
			waitForpageLoad() ;
			waitForElementToBeclicked(locator) ;
			higlightElement(locator);
			locator.isEnabled();
			Actions actions = new Actions(driver);
			actions.moveToElement(locator).perform();
			locator.click();
			extentTest.log(LogStatus.PASS, description);
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException:");
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.PASS, description);
			System.out.println("element not found :  " + locator + description);
			takeScreenshot(tc);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.PASS, description);
			takeScreenshot(tc);
			
		}
	}
	
	
	
	public static void selectDropDown(WebElement locator,int index, String description, String tc) {
		try {
			waitForpageLoad() ;
			higlightElement(locator);
			locator.isEnabled();
			Select  select = new Select(locator);
			select.deselectByIndex(index);
			extentTest.log(LogStatus.PASS, description);
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException:");
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			System.out.println("element not found :  " + locator + description);
			takeScreenshot(tc);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			takeScreenshot(tc);
			
		}
	}
	
	
	
	public static void mousehoverAnClick(WebElement locator, String description,
			String tcid) throws InterruptedException, IOException {
		try {
			waitForpageLoad() ;
			Actions a = new Actions(Driver.driver);
			a.moveToElement(locator).click().perform();
			extentTest.log(LogStatus.PASS, description);
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			takeScreenshot(tcid);
			System.out.println("element not found" + locator + description);

		}
	}
	
	
	
	public static void clear(WebElement locator, String description, String tc) {
		try {

			higlightElement(locator);
			locator.clear();
			extentTest.log(LogStatus.PASS, description);
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			System.out.println("element not found" + locator + description);
			takeScreenshot(tc);
		}
	}

	
	
	public static void sendkeys(WebElement locator, String val,
			String description, String tc) {
		try {
			waitForpageLoad() ;
			higlightElement(locator);
			locator.sendKeys(val);
			extentTest.log(LogStatus.PASS, description);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			String des= "element not found " + description ;
			extentTest.log(LogStatus.FAIL, des);
			takeScreenshot(tc);
		}
	}
	
	
	
	public static void sendkeysWithIndex(List<WebElement> locator, int index, String val,
			String description, String tc) {
		try {
			waitForpageLoad() ;
			
			locator.get(index).sendKeys(val);
			extentTest.log(LogStatus.PASS, description);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			takeScreenshot(tc);
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	public static void verifyText(WebElement locator, String value,
			String description, String tcid) {
		
		try {
			waitForpageLoad() ;
			higlightElement(locator);
			String actual = locator.getText();
			if (actual.equals(value)) {
				extentTest.log(LogStatus.PASS, description);
			} else {
				extentTest.log(LogStatus.PASS, description);
				System.out.println("text not  matched");
				takeScreenshot(tcid);
				System.out.println("text not matched :  " + description);
				System.out.println(actual + "  not equals  " + value);
			}
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.PASS, description);
			takeScreenshot(tcid);
			System.out.println("element not found" + locator + description);
		
	  }catch (Exception e) {
		System.out.println(e.getMessage());
		extentTest.log(LogStatus.PASS, description);
		takeScreenshot(tcid);

	}
	}
	
	public static void dragAndDrop(WebElement locator, WebElement locator1,
			String description, String tc) {
		try {

			Actions act = new Actions(driver);
			act.dragAndDrop(locator, locator1).perform();
			extentTest.log(LogStatus.PASS, description);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			takeScreenshot(tc);
		}
	}
	
	public static void waitForElementVisible (WebElement locator) throws InterruptedException, IOException 
	 {   
	  
	  WebDriverWait wait = new WebDriverWait(driver, 15);
	  wait.until(ExpectedConditions.visibilityOf(locator)) ;
	 	  
	 }
	
	public static void waitForElementToBeclicked(WebElement locator) throws InterruptedException, IOException 
	 {   
	  
	  WebDriverWait wait = new WebDriverWait(driver, 15);
	  wait.until(ExpectedConditions.elementToBeClickable(locator)) ;
	 }
	
	public static void waitForpageLoad () throws InterruptedException, IOException 
	 {   
		  ExpectedCondition<Boolean> pageLoadCondition = new
	                ExpectedCondition<Boolean>() {
	                    public Boolean apply(WebDriver driver) {
	                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
	                    }
	                };
	        WebDriverWait wait = new WebDriverWait(driver, 30);
	        wait.until(pageLoadCondition);
	   	
	 }
	
	 
	public static void elemetIsEnable(WebElement locator, String description, String tc) {
		try {
			higlightElement(locator);
			locator.isEnabled();
			extentTest.log(LogStatus.PASS, description);
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException:");
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			System.out.println("element not found :  " + locator + description);
			takeScreenshot(tc);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			takeScreenshot(tc);

		}
	}
	
	public static void elementIsSelected(WebElement locator, String description, String tc) {
		try {
			higlightElement(locator);
			locator.isEnabled();
			boolean value = locator.isSelected();
			if (value == true) {
				extentTest.log(LogStatus.FAIL, description);
				System.out.println("checkbox is checked");
			} else {
				extentTest.log(LogStatus.PASS, description);
				System.out.println(description + "  checkbox is not checked");
			}
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException:");
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			System.out.println("element not found :  " + locator + description);
			takeScreenshot(tc);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("element is disabled");
			extentTest.log(LogStatus.PASS, description);
			takeScreenshot(tc);

		}
	}
	
	
	
	
	public static void elementIsSelectedUsingIndex(List<WebElement> locator, int index,String description, String tc) {
		try {
			
			boolean value = locator.get(index).isSelected();
			if (value == true) {
				extentTest.log(LogStatus.FAIL, description);
				System.out.println("checkbox is checked");
			} else {
				extentTest.log(LogStatus.PASS, description);
				System.out.println(description + "  checkbox is not checked");
			}
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException:");
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			System.out.println("element not found :  " + locator + description);
			takeScreenshot(tc);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("element is disabled");
			extentTest.log(LogStatus.PASS, description);
			takeScreenshot(tc);

		}
	}
	

	public static void getWindowhandles(WebElement locator,
			String actualchildUrl, String actualParentUrl) {
		try {

			String parent = driver.getWindowHandle();
			locator.click();
			Set<String> s1 = driver.getWindowHandles();
			s1.remove(parent);
			driver.switchTo().window(s1.iterator().next());

			String actual = driver.getCurrentUrl();
			System.out.println("child window URL: " + actual);
			if (actual.equals(actualchildUrl)) {
				extentTest.log(LogStatus.PASS,
						"Successfully navigate to the child window window");
			} else {
				extentTest.log(LogStatus.FAIL,
						"Successfully navigate to the child window window");
			}

			driver.close();
			driver.switchTo().window(parent);

			// once all pop up closed now switch to parent window
			driver.switchTo().window(parent);
			String actual1 = driver.getCurrentUrl();
			System.out.println("child window URL: " + actual1);
			if (actual1.equals(actualParentUrl)) {
				extentTest.log(LogStatus.PASS,
						"Successfully navigate to the parent window");
			} else {
				extentTest.log(LogStatus.FAIL,
						"Successfully navigate to the parent window");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, "window handle working not fine");

		}
	}

	public static void doubleClick(WebElement locator, String description, String tc) {
		try {
			higlightElement(locator);
			locator.isEnabled();
			Actions a = new Actions(driver) ;
			a.moveToElement(locator);
			a.doubleClick(locator).build().perform();
			extentTest.log(LogStatus.PASS, description);
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException:");
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			System.out.println("element not found :  " + locator + description);
			takeScreenshot(tc);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			takeScreenshot(tc);

		}
	}
	
	public static void takeScreenshot(String sTestCaseName) {
		try {
			File scrFile = ((TakesScreenshot) Driver.driver)
					.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("C:\\Users\\Ashwin\\workspace\\TIBCO_Automation\\Screenshot\\"+ sTestCaseName + ".jpg"));

		} catch (Exception e) {
      System.out.println("got exeception in screenshoot method");
		
		}
	}

	

	public static void verifyCurrentUrl(String value, String description,
			String tcid) {

		try {
			String actual = driver.getCurrentUrl();
			if (actual.equals(value)) {
				extentTest.log(LogStatus.PASS, description);
			} else {
				extentTest.log(LogStatus.FAIL, description);
				System.out.println("text not  matched");
				takeScreenshot(tcid);
			}
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			takeScreenshot(tcid);

		}
	}


	
	public static void getAttribute(WebElement locator,String atrribute,String value,
			String description, String tcid) {
		try {
			higlightElement(locator);
			String actual = locator.getAttribute(atrribute);
			boolean val = actual.length() != 0 ;
			if (val == true) {
				extentTest.log(LogStatus.PASS, description);
			} else {
				extentTest.log(LogStatus.FAIL, description);
				System.out.println("text not  matched");
				takeScreenshot(tcid);
				System.out.println("href not matched :  " + description);
				System.out.println(actual + "  not equals  " + value);
			}
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			takeScreenshot(tcid);
			System.out.println("element not found" + locator + description);

		}
	}

	public static void elementNotPresent(WebElement locator,
			String description, String tcid) {
		try {
 
			boolean value = locator.isDisplayed();

			if (value == true) {
				extentTest.log(LogStatus.FAIL, description);
			} else {
				extentTest.log(LogStatus.FAIL, description);
			}

		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.PASS, description);
			takeScreenshot(tcid);

		}
	}

	public static void elementIsPresent(WebElement locator, String description,
			String tcid) {
		try {
			higlightElement(locator);
			boolean value = locator.isDisplayed();
			if (value == true) {
				extentTest.log(LogStatus.PASS, description);
				
			} else {
				extentTest.log(LogStatus.FAIL, description);
			}

		} catch (NoSuchElementException e) {
			extentTest.log(LogStatus.FAIL, description);
			takeScreenshot(tcid);

		}
	}
	
	public static void elementIsNotPresent(WebElement locator, String description,
			String tcid) {
		try {

			boolean value = locator.isDisplayed() ;
			
			if (value == true) {
				extentTest.log(LogStatus.FAIL, description);
				System.out.println(description +" is present");
			} else {
				extentTest.log(LogStatus.PASS, description);
				System.out.println(description + "  element is not present");
			}

		} catch (NoSuchElementException e) {
			extentTest.log(LogStatus.PASS, description);
			takeScreenshot(tcid);
			System.out.println( description+ " inexception" +" element is not present");

		}
	}
	
	
	public static void copyText(WebElement locator, String description,
			String tcid) {
		try {
			higlightElement(locator);
			locator.isEnabled();
			locator.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			locator.sendKeys(Keys.chord(Keys.CONTROL, "c"));
			extentTest.log(LogStatus.PASS, description);
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException:");
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			System.out.println("element not found :  " + locator + description);
			takeScreenshot(tcid);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			takeScreenshot(tcid);

		}
	}
	
	public static void pageUp( String description) {
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_HOME);
			robot.keyRelease(KeyEvent.VK_HOME);
			System.out.println("page scroll up");
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException:");
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);

		}catch (Exception e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			

		}
	}
	
	
	public static void scrollTo(WebElement element) {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
    }
	
	
	public static void pageDown(String description) {
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException:");
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);

		}catch (Exception e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			

		}
	}
	
	
	
	public static void pasteText(WebElement locator, String description,
			String tcid) {
		try {
			higlightElement(locator);
			locator.sendKeys(Keys.chord(Keys.CONTROL, "v"));
			extentTest.log(LogStatus.PASS, description);
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException:");
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			System.out.println("element not found :  " + locator + description);
			takeScreenshot(tcid);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			takeScreenshot(tcid);

		}
	}

	public static void elementIsChecked(WebElement locator, String description,
			String tcid) {
		try {

			boolean value = locator.isSelected();
			if (value == true) {
				extentTest.log(LogStatus.PASS, description);
				System.out.println("checkbox is checked");
			} else {
				extentTest.log(LogStatus.FAIL, description);
				System.out.println(description + "  checkbox is not checked");
			}

		} catch (NoSuchElementException e) {
			extentTest.log(LogStatus.FAIL, description);
			takeScreenshot(tcid);
			
			System.out.println("checkbox is not checked");

		}
	}
	
	public static void elementIsNotChecked(WebElement locator, String description,
			String tcid) {
		try {

			boolean value = locator.isSelected();
			
			if (value == true) {
				extentTest.log(LogStatus.FAIL, description);
				System.out.println("checkbox is checked");
			} else {
				extentTest.log(LogStatus.PASS, description);
				
				System.out.println(description + "  checkbox is not checked");
			}

		} catch (NoSuchElementException e) {
			extentTest.log(LogStatus.FAIL, description);
			takeScreenshot(tcid);
			
			System.out.println("checkbox is not checked");

		}
	}
	
	
	
	public static void clickByjs(WebElement locator, String description,
			String tcid) {
		try {
			String js = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';";
			((JavascriptExecutor) driver).executeScript(js, locator);
			locator.click();
			extentTest.log(LogStatus.PASS, description);
		} catch (NoSuchElementException e) {
			extentTest.log(LogStatus.FAIL, description);
			takeScreenshot(tcid);

		}
	}

	public static String valueOfIputbox(WebElement locator, String value,
			String description, String tcid) {
		try {
			higlightElement(locator);
			String actual = locator.getAttribute("value");
			System.out.println(actual);
			if (actual.equals(value)) {
				extentTest.log(LogStatus.PASS, description);
				System.out.println("text matched");
			} else {
				extentTest.log(LogStatus.FAIL, description);
				System.out.println("text not  matched");
				takeScreenshot(tcid);
			}
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			takeScreenshot(tcid);

		}
	catch (Exception e) {
		System.out.println(e.getMessage());
		extentTest.log(LogStatus.FAIL, description);
		

	}

		return actual1;
	}

	public static void mousehover(WebElement locator, String description,
			String tcid) {
		try {

			Actions a = new Actions(Driver.driver);
			a.moveToElement(locator).perform();
			extentTest.log(LogStatus.PASS, description);
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			takeScreenshot(tcid);
			System.out.println("element not found" + locator + description);
		
	   }catch (Exception e) {
		System.out.println(e.getMessage());
		extentTest.log(LogStatus.PASS, description);
		takeScreenshot(tcid);
		
	   }
	}

	public static void keys(WebElement locator, String description, String tc) {
		try {
			locator.sendKeys(Keys.ENTER);
			extentTest.log(LogStatus.PASS, description);
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			System.out.println("element not found" + locator + description);
			takeScreenshot(tc);

		}
	}
	
	public static void keboadkeys(WebElement locator, String description, String tc) {
		try {
			locator.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			extentTest.log(LogStatus.PASS, description);
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			System.out.println("element not found" + locator + description);
			takeScreenshot(tc);

		}
	}

	public static String  getTextAndStoreInVariable(WebElement locator, String description, String tc) {
		try {
			 textOFElement = locator.getText() ;
			extentTest.log(LogStatus.PASS, description);
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			System.out.println("element not found" + locator + description);
			takeScreenshot(tc);
		}
		return textOFElement;
		
		
	}

	public static WebElement higlightElement(WebElement ele) {
		if (Driver.driver instanceof JavascriptExecutor) {
			((JavascriptExecutor) Driver.driver).executeScript(
					"arguments[0].style.border='3px solid red'", ele);
		}
		return ele;
	}

	public static void setClipboardData(String string) {
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard()
				.setContents(stringSelection, null);
		System.out.println(stringSelection);
	}

	public static void fileUpload(WebElement locator, String path,
			String description, String TCID) {
		try {
			
			locator.click();
			Thread.sleep(1500);
			path = path.trim();
			setClipboardData(path);
			Robot robot1 = new Robot();
			robot1.keyPress(KeyEvent.VK_CONTROL);
			robot1.keyPress(KeyEvent.VK_V);
			robot1.keyRelease(KeyEvent.VK_V);
			robot1.keyRelease(KeyEvent.VK_CONTROL);
			robot1.keyPress(KeyEvent.VK_ENTER);
			robot1.keyRelease(KeyEvent.VK_ENTER);
			extentTest.log(LogStatus.PASS, description);
		} catch (Exception e) {
			e.printStackTrace();
			extentTest.log(LogStatus.FAIL, description);
			takeScreenshot(TCID);

		}
	}


	public static String currecntTime() {
		DateFormat dateFormat = new SimpleDateFormat("E-yyyy-MM-dd-'at'-hh-mma");
		// get current date time with Date()
		Date date = new Date();
		
		dateFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		 report_date1 = dateFormat.format(date);
		 report_date = report_date1.toLowerCase();
		 System.out.println("cureent time is" + report_date);
		return report_date;
	}


	
	public static void autoIt(String path, String description)
			throws IOException {

		Runtime.getRuntime().exec(path);
		extentTest.log(LogStatus.PASS, description);

	}
	
	public static void wiatForElement(String xpath) {

		new WebDriverWait(Driver.driver, 30).until(ExpectedConditions
				.visibilityOfElementLocated((By.xpath(xpath))));
		extentTest.log(LogStatus.PASS, "wait for element present");

	}

	public static void click(By locator, String description, String tc_id) {
		try {

			int ok_size = Driver.driver.findElements(locator).size();
			
			System.out.println("eement size:"+ ok_size );

			Driver.driver.findElements(locator).get(ok_size - 1).click();

			extentTest.log(LogStatus.PASS, description);
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.PASS, description);
			takeScreenshot(tc_id);

		
	}catch (Exception e) {
		System.out.println(e.getMessage());
		extentTest.log(LogStatus.PASS, description);
		takeScreenshot(tc_id);
		
	}


	}
	
	

	public static void clickByindex(List<WebElement> locator, int index,
			String description, String tc_id) {
		try {

			System.out.println("element size is  "+ locator.size() );
			locator.get(index).click();
			extentTest.log(LogStatus.PASS, description);
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.PASS, description);
			takeScreenshot(tc_id);

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.PASS, description);
			takeScreenshot(tc_id);

		}

	}
	
	public static void elementCheckedByindex(List<WebElement> locator, int index,
			String description, String tc_id) {
		try {

			System.out.println("element size is  "+ locator.size() );
			boolean value = locator.get(index).isSelected();
			if (value == true) {
				extentTest.log(LogStatus.PASS, description);
				System.out.println("checkbox is checked");
			} else {
				extentTest.log(LogStatus.FAIL, description);
				System.out.println(description + "  checkbox is not checked");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			takeScreenshot(tc_id);

		}

	}
	
	public static void verifyElementSize(List<WebElement> locator, int actual_size,
			String description, String tc_id) {
		try {

			System.out.println("element size is  "+ locator.size() );
		     int size =	locator.size() ;
		     if (size == actual_size) {
					extentTest.log(LogStatus.PASS, description);
				} else {
					extentTest.log(LogStatus.FAIL, description);
				}

			} catch (NoSuchElementException e) {
				extentTest.log(LogStatus.FAIL, description);
				takeScreenshot(tc_id);

			}
	}
	
	
	public static void verifyTextByindex(List<WebElement> locator,String value,
			String description, String tc_id) {
		try {
           
			waitForSometime(1000) ;
			int elementSize = locator.size() ;
		    String actual =  locator.get(elementSize-1).getText() ;
		 	System.out.println("text is "+ actual);
			if (actual.equals(value)) {
				extentTest.log(LogStatus.PASS, description);
			} else {
				extentTest.log(LogStatus.PASS, description);
				System.out.println("text not  matched");
				takeScreenshot(tc_id);
				System.out.println("text not matched :  " + description);
				System.out.println(actual + "  not equals  " + value);

			}
		  } catch (Exception e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.PASS, description);
			takeScreenshot(tc_id);

		}
	}
	
	
	public static void verifyTextByindex(List<WebElement> locator,int index,String value,
			String description, String tc_id) {
		try {
          
			higlightElement(locator.get(index));
			
			String actual =  locator.get(index).getText() ;
			if (actual.equals(value)) {
				extentTest.log(LogStatus.PASS, description);
			} else {
				extentTest.log(LogStatus.FAIL, description);
				System.out.println("text not  matched");
				takeScreenshot(tc_id);
				System.out.println("text not matched :  " + description);
				System.out.println(actual + "  not equals  " + value);

			}
		  } catch (Exception e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			takeScreenshot(tc_id);

		}
	}
	
	
	
	
	
	
	

	public static void jsForEnableElemenet(WebElement locator,
			String description) {

		((JavascriptExecutor) driver).executeScript(
				"arguments[0].enabled = true", locator);
		extentTest.log(LogStatus.PASS, description);
	}

	public static void waitForSometime(int time) {

		try {
			Thread.sleep(time);
			System.out.println("wait for" + time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void waitForElementVisible(String locator) {

		try {
			WebElement element = null;
			WebDriverWait wait = new WebDriverWait(driver, 30);
			
			element = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(locator)));
			element.click();

		} catch (Exception e) {
	
			e.printStackTrace();
		}
	}
	
	public static void clickWithoutHiglight(WebElement locator, String description, String tc) {
		try {
			
			locator.click();
			extentTest.log(LogStatus.PASS, description);
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException:");
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			System.out.println("element not found :  " + locator + description);
			takeScreenshot(tc);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			takeScreenshot(tc);

		}
	}



	public static void getCssValue(WebElement locator,String cssValue, String value,String description, String tcid) {
		
		try {
			higlightElement(locator);
			String actual = locator.getCssValue(cssValue) ;
			System.out.println("css value is : " + actual);
			if (actual.equals(value)) {
				extentTest.log(LogStatus.PASS, description);
			} else {
				extentTest.log(LogStatus.FAIL, description);
				System.out.println("text not  matched");
				takeScreenshot(tcid);
				System.out.println("text not matched :  " + description);
				System.out.println(actual + "  not equals  " + value);
			}
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			extentTest.log(LogStatus.FAIL, description);
			takeScreenshot(tcid);
			System.out.println("element not found" + locator + description);
		
	  }catch (Exception e) {
		System.out.println(e.getMessage());
		extentTest.log(LogStatus.FAIL, description);
		takeScreenshot(tcid);

	}
 }
	
	public static void  deleteReport()
    {	
    	try{
    		String fileName = new File(BaseTest.baseDir+Reports.report_name)
    		.getAbsolutePath();
    		File file = new File(fileName);
    		if(file.delete()==true){
    			System.out.println(file.getName() + " is deleted!");
    		}else{
    			System.out.println("Delete operation is failed.");
    		
    		}
    	   
    	}catch(Exception e){
    		
    		e.printStackTrace();
    	}
    }
}

