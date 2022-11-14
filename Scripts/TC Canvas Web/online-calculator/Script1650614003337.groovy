import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import java.awt.List as List
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

WebUI.navigateToUrl('https://www.online-calculator.com//html5/simple/index.php?v=10')

WebUI.maximizeWindow()

//WebUI.click(findTestObject('Object Repository/Canvas/Online Calculator/canvas_concat(id(, , canvas, , ))_canvas'))
WebUI.delay(5)

//WebUI.executeJavaScript("document.body.style.zoom='60%'", null)

WebDriver driver = DriverFactory.getWebDriver()

WebElement element = driver.findElement(By.xpath('//canvas[@id=\'canvas\']'))

Actions act = new Actions(driver)

canvas_dimension = element.getSize()

println(canvas_dimension)

int xCoordinatesCenter = canvas_dimension.getWidth() / 2

println('X Center Coordinates: ' + xCoordinatesCenter)

int yCoordinatesCenter = canvas_dimension.getHeight() / 2

println('Y Center Coordinates: ' + yCoordinatesCenter)

//For Number 1 Button
int xCoordinatesObject1 = (xCoordinatesCenter / 3) * 2

int yCoordinatesObject1 = (yCoordinatesCenter / 3) * 1

println('X Coordinates for the Center: ' + xCoordinatesObject1)

println('Y Coordinates for the Center: ' + yCoordinatesObject1)

Thread.sleep(2)

act.moveToElement(element, -(xCoordinatesObject1), yCoordinatesObject1).click().build().perform()

//For Plus Button
int xCoordinatesObject2 = (xCoordinatesCenter / 3) * 2

int yCoordinatesObject2 = (yCoordinatesCenter / 3) * 2

println('X Coordinates for the Center: ' + xCoordinatesObject2)

println('Y Coordinates for the Center: ' + yCoordinatesObject2)

Thread.sleep(2)

act.moveToElement(element, xCoordinatesObject2, yCoordinatesObject2).click().build().perform()

//For Number 8 Button
int xCoordinatesObject3 = (xCoordinatesCenter / 3) * 1

int yCoordinatesObject3 = (yCoordinatesCenter / 3) * 1

println('X Coordinates for the Center: ' + xCoordinatesObject3)

println('Y Coordinates for the Center: ' + yCoordinatesObject3)

Thread.sleep(2)

act.moveToElement(element, -(xCoordinatesObject3), -(yCoordinatesObject3)).click().build().perform()

//For Number = Button
int xCoordinatesObject4 = (xCoordinatesCenter / 3) * 0

int yCoordinatesObject4 = (yCoordinatesCenter / 3) * 2

println('X Coordinates for the Center: ' + xCoordinatesObject4)

println('Y Coordinates for the Center: ' + yCoordinatesObject4)

Thread.sleep(2)

act.moveToElement(element, xCoordinatesObject4, yCoordinatesObject4).click().build().perform()

WebUI.closeBrowser()