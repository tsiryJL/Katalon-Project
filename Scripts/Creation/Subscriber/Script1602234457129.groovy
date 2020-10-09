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

//Declaration variable
int RefID = 559662587775, ShortCode =1, DateOfBirth = 10/05/1995
String FirstName = "testFirst", LastName = "testLas"

WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("http://192.168.69.2:8180/portal/server/web/adminconsole/home")
selenium.click("//div[@id='main-content']/div")
selenium.click("id=_58_login")
selenium.type("id=_58_login", "70586665")
selenium.type("id=_58_password", "Utiba@123")
selenium.click("class=btn btn-primary")
WebUI.waitForPageLoad(100)

//begin test
selenium.open("http://192.168.69.2:8180/portal/server/group/adminconsole/a/distributor/register")
WebUI.waitForPageLoad(100)
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f1")
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f1", "${RefID}")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f2")
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f2", "Alias-type-test0")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f3")
selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f3", "label=AUTRE")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f3")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f4")
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f4", "${ShortCode}")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f5")
selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f5", "label=KYC 2 (full registration / certification)")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f5")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f5")
selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f5", "label=KYC 1 (registration)")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f5")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f5")
selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f5", "label=KYC 0 (lite account)")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f5")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f6")
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f6", "${FirstName}")

selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f7", "Distributeur à 2 niveaux")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f8")
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f8", "${LastName}")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f10")

//Use WebUI keyword
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f10", "12345678904123456789012345678901234567890123456789")
selenium.click("id=location_search_panel")
selenium.type("id=location_search_panel", "madagascar")
selenium.submit("id=_RegisterAgent_WAR_utiba_agent_portlets_fm")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f13")
selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f13", "label=Male")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f13")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f14")
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f14", "test")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f15")
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f15", "test")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f29")
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f29", "test")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f17")
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f17", "test")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f18")
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f18", "test")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f19")
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f19", "test")
selenium.click("xpath=(//input[@id='location_search_panel'])[2]")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f27")
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f27", "C1")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f28")
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f28", "fezfzef")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f36_set_checkboxCheckbox")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f32_set_checkboxCheckbox")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f31_set_checkboxCheckbox")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f37_set_checkboxCheckbox")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f48_set_checkboxCheckbox")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f43")
selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f43", "label=Français")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f43")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f42")
selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f42", "label=Yes")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f42")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f41")
selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f41", "label=Yes")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f41")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f40")
selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f40", "label=Réel avec TVA")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f40")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f39")
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f39", "test")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f44")
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f44", "test")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f45")
selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f45", "label=Yes")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f45")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f47")
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f47", "iban")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f49")
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f49", "test")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f51")
selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f51", "label=Yes")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f51")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f52")
selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f52", "label=Yes")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f52")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f53")
selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f53", "label=BOIS")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f53")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f54")
selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f54", "label=Yes")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f54")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f38")
selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f38", "label=Yes")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f38")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f56")
selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f56", "label=Yes")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f56")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets_save")
WebUI.waitForPageLoad(20)
println "CHECK-1"
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f56")
selenium.select("id=_RegisterAgent_WAR_utiba_agent_portlets__f56", "label=No")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f56")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f1")

selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets_save")
WebUI.waitForPageLoad(20)
println "CHECK-2"
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets___f9")
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets___f9", "10/09/1580")
selenium.click("id=content")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f14")
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f14", "test@test.mg")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f15")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f15")
selenium.doubleClick("id=_RegisterAgent_WAR_utiba_agent_portlets__f15")
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f15", "123454548479")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets_save")
WebUI.waitForPageLoad(20)
println "CHECK-3"
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets___f9")
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets___f9", "${DateOfBirth}")
selenium.click("id=content")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets__f2")
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f2", "510123")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets_save")
WebUI.waitForPageLoad(20)
println "CHECK-4"
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets___f9")

//Date of Birth
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets___f9", "10/09/1998")
selenium.click("id=content")
selenium.click("id=_RegisterAgent_WAR_utiba_agent_portlets_save")
WebUI.waitForPageLoad(20)
println "CHECK-5"
selenium.type("id=_RegisterAgent_WAR_utiba_agent_portlets__f1", "559662587775")
selenium.click("id=_UpdateAgent_WAR_utiba_agent_portlets_save")
selenium.click("id=_UpdateAgent_WAR_utiba_agent_portlets___f37")
selenium.click("id=calendaryui_patched_v3_11_0_1_1602241894513_1005_pane_0_8_31")
selenium.click("id=_UpdateAgent_WAR_utiba_agent_portlets___f38")
selenium.click("//table[@id='calendaryui_patched_v3_11_0_1_1602241894513_1291_pane_0']/tbody/tr[2]")
selenium.click("id=calendaryui_patched_v3_11_0_1_1602241894513_1291_pane_0_2_4")
selenium.click("id=_UpdateAgent_WAR_utiba_agent_portlets___f49")
selenium.click("id=calendaryui_patched_v3_11_0_1_1602241894513_1595_pane_0_8_31")
selenium.click("id=_UpdateAgent_WAR_utiba_agent_portlets___f32")
selenium.type("id=_UpdateAgent_WAR_utiba_agent_portlets___f32", "10/23/1995")
selenium.click("//div[@id='yui_patched_v3_11_0_3_1602241916018_7']/div[14]/label")
selenium.click("id=_UpdateAgent_WAR_utiba_agent_portlets___f33")
selenium.click("id=calendaryui_patched_v3_11_0_1_1602241916018_1321_pane_0_8_31")
selenium.click("id=_UpdateAgent_WAR_utiba_agent_portlets___f37")
selenium.type("id=_UpdateAgent_WAR_utiba_agent_portlets___f37", "10/31/1991")
selenium.click("id=yui_patched_v3_11_0_3_1602241916018_9")
selenium.click("id=_UpdateAgent_WAR_utiba_agent_portlets__f49_set_checkboxCheckbox")
selenium.click("id=_UpdateAgent_WAR_utiba_agent_portlets_sss")
WebUI.waitForPageLoad(20)
println "CHECK-6"
selenium.click("id=_UpdateAgent_WAR_utiba_agent_portlets___f38")
selenium.type("id=_UpdateAgent_WAR_utiba_agent_portlets___f38", "10/04/2028")
selenium.click("id=yui_patched_v3_11_0_3_1602241984023_9")
selenium.waitForPageToLoad("30")
println "CHECK-7"
selenium.click("id=_UpdateAgent_WAR_utiba_agent_portlets_save")


