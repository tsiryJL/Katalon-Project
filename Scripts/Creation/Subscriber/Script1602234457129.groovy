import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

//Déclaration Variable
int legacyID = 55966258661
int IdRef = 55966258223

//Test service internet
WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"

//Test connexion portal Admin
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("http://192.168.69.2:8180/portal/server/web/adminconsole/home")
selenium.click("id=_58_login")
selenium.type("id=_58_login", "70586665")
selenium.type("id=_58_password", "Utiba@123")
selenium.click("//button")
WebUI.waitForPageLoad(20)


	selenium.open("http://192.168.69.2:8180/portal/server/group/adminconsole/a/subscriber/register")
	selenium.click("id=content")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f1")
	selenium.click("id=content")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets_save")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f2")
	selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f2", "${legacyID}")
	printf "legacy OK"
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f3")
	selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f3", "label=ORDINAIRE")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f3")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f4")
	selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f4", "label=KYC 1 (registration)")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f4")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f5")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f6")
	selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f6", "ers")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f9")
	selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f9", "test")
	selenium.click("id=content")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f12")
	selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f12", "label=Male")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f12")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f14")
	selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f14", "testsetset")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f33")
	selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f33", "label=Yes")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f33")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f32")
	selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f32", "label=Yes")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f32")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f30")
	selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f30", "label=Yes")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f30")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f16")
	selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f16", "test")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f34")
	selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f34", "label=English")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f34")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f35")
	selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f35", "test")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f36")
	selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f36", "label=No")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f36")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f39")
	selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f39", "label=Yes")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f39")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets_save")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f1")
	selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f1", "${IdRef}")
	printf "Reference OK"
	selenium.click("id=content")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f5")
	selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f5", "First name Subtistributor 2")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f7")
	selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f7", "last name test")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f26")
	selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f26", "c2")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets_save")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets___f8")
	selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets___f8", "10/06/1997")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f14")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f14")
	selenium.doubleClick("id=_RegisterAgent_WAR_utiba_agent_portlets__f14")
	selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f14", "084566656565")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets_save")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f14")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f14")
	selenium.doubleClick("id=_RegisterAgent_WAR_utiba_agent_portlets__f14")
	selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f14", "902525454555")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets_save")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f2")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f2")
	selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f2", "2544845456545648")
	selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets_save")

