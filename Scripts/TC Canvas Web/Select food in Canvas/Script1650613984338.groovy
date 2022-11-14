import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.JavascriptExecutor
import java.awt.List as List
import org.apache.logging.log4j.core.appender.db.jdbc.AbstractDriverManagerConnectionSource as AbstractDriverManagerConnectionSource
import org.openqa.selenium.By as By
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kitchen.applitools.com/ingredients/canvas')

WebUI.maximizeWindow()

WebUI.delay(5)

//WebUI.executeJavaScript("document.body.style.zoom='60%'", null)
WebUI.scrollToPosition(600, 500)

WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()

WebElement ele = driver.findElement(By.xpath('//canvas[@id=\'burger_canvas\']'))

canvas_dim = ele.getSize()

println(canvas_dim)

int xcoor = canvas_dim.getWidth() / 2

println(xcoor)

int ycoor = canvas_dim.getHeight() / 2

println(ycoor)

int xbutton = (xcoor / 3) * 2

println(xbutton)

int ybutton = (ycoor / 3) * 2

println(ybutton)

Actions act = new Actions(driver)

JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].setAttribute('style', arguments[1]);",ele, "color: red; border: 3px solid red;");
//act.moveByOffset(714, 500).contextClick().build().perform();
act.moveToElement(ele, xbutton, ybutton).click().build().perform()

WebUI.closeBrowser()


