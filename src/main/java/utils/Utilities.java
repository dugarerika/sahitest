package utils;

import org.openqa.selenium.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
	public static WebDriver driver;
	
	public static void openUrl(String strUrl){
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(strUrl);
		driver.manage().window().maximize();
	}

	public static boolean isElementPresent(By by) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 1);
			wait.until(ExpectedConditions.or(ExpectedConditions.presenceOfElementLocated(by),
					ExpectedConditions.elementToBeSelected(by),
					ExpectedConditions.invisibilityOfElementLocated(by),
					ExpectedConditions.elementToBeClickable(by),
					ExpectedConditions.presenceOfNestedElementLocatedBy(by, null)));
			return true;
		} catch (NoSuchElementException | TimeoutException e) {
			return false;
		}
	}

	public static WebElement el(By by) {
		return driver.findElement((By) by);
	}

	public static String base64Screenshot(){
		return "data:image/png;base64," + ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
	}
	
	public static List<WebElement> els(By by) {
		return driver.findElements((By) by);
	}

	public static void wt(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	public static void waitForElement(By by, long timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.or(ExpectedConditions.elementToBeClickable(by),
				ExpectedConditions.elementToBeSelected(by), 
				ExpectedConditions.presenceOfNestedElementLocatedBy(by, null)));
	}
		
	public static void closeExplorer() {
		driver.close();
	}
	
	public static void closeProcess() {
		driver.quit();
	}
	
	public static void type(By by, String str) {
		el(by).sendKeys(str);
	}
	
	public static void click(By by) {
		el(by).click();
	}
	
	public static String getText(By by) {
		return el(by).getText();
	}

	public static String getDateYYYYMMDDHHMMSS() {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd HHmmss");
		Date date = new Date();
		return dateFormat.format(date);
	}

	public static boolean isAlertPresent() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 1);
			wait.until(ExpectedConditions.alertIsPresent());
			return true;
		} catch (NoSuchElementException | TimeoutException e) {
			return false;
		}
	}

	public static void closeAlert(){
		Alert objAlert = driver.switchTo().alert();
		objAlert.accept();
	}

	public static void executeScript(String script) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script);
	}

	public static void scrollDown() {
		executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}

	public static void selectXName(By by, String str) {
		Select objSelect = new Select(el(by));
		objSelect.selectByVisibleText(str);
	}

	public static void selectXIndex(By by, Integer n) {
		Select objSelect = new Select(el(by));
		objSelect.selectByIndex(n);
	}

	public static boolean compareText(By by, String str) {
		String text = getText(by);
		if (str.equals(text)) {
			return true;
		}
		else{ return false;
		}
	}
	}