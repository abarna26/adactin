package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static JavascriptExecutor js;
	public static TakesScreenshot ts;
	public static Select s;
	public static Alert al;
	public static Date d;

	public static WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace1\\Cucumberr\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		return driver;
		
	}

	public static void lanuchUrl(String url) {
		driver.get(url);
	}

	public static void toMaximimize() {
		driver.manage().window().maximize();
	}

	public static String toGetUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	public static String toGetTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static void toSendInput(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void toClick(WebElement element) {
		element.click();
	}

	public static void toQuit() {
		driver.quit();
	}

	public static void toclose() {
		driver.close();

	}

	public static String toGetText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public static String toGetAttribute(WebElement element, String value) {
		String attribute = element.getAttribute("value");
		return attribute;

	}

	public static void toMovetoElement(WebElement target) {
		a = new Actions(driver);
		a.moveToElement(target).perform();

	}

	public static void toDragandDown(WebElement source, WebElement target) {
		a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}

	public static void toDoubleClick(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).perform();

	}

	public static void toRightClick(WebElement target) {
		a = new Actions(driver);
		a.contextClick(target).perform();

	}

	public static void tocopy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

	public static void toPaste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}

	public static void toenter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void tosendkeys(String values, WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + values + "')", element);
	}

	public static void toclickjs(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

	}

	public static void toReterive(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("return arguments[0].getAttribute('value')", element);
	}

	public static void toScrollDown(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	public static void toScrollUp(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);

	}

	public static void toScreenShot(String filename) throws IOException {
		ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\user\\eclipse-workspace1\\Cucumberr\\src\\test\\resources\\Reports\\SShots" + filename + ".png");
		FileUtils.copyFile(temp, dest);

	}
	public static byte[] bytescreenshot() {
		ts = (TakesScreenshot) driver;
		 byte[] b=ts.getScreenshotAs(OutputType.BYTES);
		 return b;
		 	 
	}

	public static void toSelectByIndex(WebElement element, int n) {
		s = new Select(element);
		s.selectByIndex(n);

	}

	public static void toSlectByValue(WebElement element, String value) {
		s = new Select(element);
		s.selectByValue(value);
	}

	public static void toSelectByVisibletext(WebElement element, String text) {
		s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void toisMultiple(WebElement element) {
		s = new Select(element);
		s.isMultiple();
	}

	public static String togetOptions(WebElement element) {
		s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			return text;
		}
		return null;

	}

	public static String togetAllSelected(WebElement element) {
		s = new Select(element);
		List<WebElement> selectedoptions = s.getAllSelectedOptions();
		for (int i = 0; i < selectedoptions.size(); i++) {
			WebElement webElement = selectedoptions.get(i);
			String text = webElement.getText();
			return text;
		}

		return null;
	}

	public static String toFirstselectedOption(WebElement element) {
		s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		return text;

	}

	public static void todeSelectByvalue(WebElement element, int n) {
		s = new Select(element);
		s.deselectByIndex(n);

	}

	public static void todeSlectByValue(WebElement element, String value) {
		s = new Select(element);
		s.deselectByValue(value);
	}

	public static void todeSelectByVisibletext(WebElement element, String text) {
		s = new Select(element);
		s.deselectByVisibleText(text);
	}

	public static void todeSelectAll(WebElement element) {
		s = new Select(element);
		s.deselectAll();

	}

	public static void toSwitchtoFrame(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void toMainhtmlFrame() {
		driver.switchTo().defaultContent();
	}

	public static void toOuterframe() {
		driver.switchTo().parentFrame();
	}

	public static void toSwitchtoAlert() {
		driver.switchTo().alert();
	}

	public static void toWindowHandle() {
		String parentId = driver.getWindowHandle();
		Set<String> allwindIds = driver.getWindowHandles();
		for (String allId : allwindIds) {
			if (!parentId.equals(allId)) {
				driver.switchTo().window(allId);
			}

		}
	}

	public static void toparticularWindow(int n) {
		int count = 0;
		Set<String> allwindIds = driver.getWindowHandles();
		for (String particularId : allwindIds) {
			if (count == n) {
				driver.switchTo().window(particularId);
			}
			count++;
		}

	}

	public static void toNavigate(String url) {
		driver.navigate().to(url);

	}

	public static void toforward() {
		driver.navigate().forward();

	}

	public static void torefresh() {
		driver.navigate().refresh();
	}

	public static void toback() {
		driver.navigate().back();

	}

	public static void selectwitoutselecttag(List<WebElement> element1, String value) {
		for (WebElement element : element1) {
			if (element.getText().equals(value)) {
				element.click();
				break;
			}

		}
	}

	public static Date stratDate() {
		d = new Date();
		return d;
	}

	public static Date endDate() {
		d = new Date();
		return d;
	}

	public static void towait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
