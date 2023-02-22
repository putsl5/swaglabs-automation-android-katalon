import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication('"com.swaglabsmobileapp"', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Test Scenario Keseluruhan/Username'), 'standard_user', 0)

Mobile.setEncryptedText(findTestObject('Test Scenario Keseluruhan/Password'), 'qcu24s4901FyWDTwXGr6XA==', 0)

Mobile.tap(findTestObject('Test Scenario Keseluruhan/ButtonLogin'), 0)

Mobile.tap(findTestObject('Test Scenario Keseluruhan/ButtonADDTOCART'), 0)

Mobile.tap(findTestObject('Test Scenario Keseluruhan/ButtonCart'), 0)

Mobile.tap(findTestObject('Test Scenario Keseluruhan/ButtonCHECKOUT'), 0)

Mobile.setText(findTestObject('Test Scenario Keseluruhan/FieldFirst Name'), 'Putri', 0)

Mobile.setText(findTestObject('Test Scenario Keseluruhan/FiledLast Name'), 'Salsabila', 0)

Mobile.setText(findTestObject('Test Scenario Keseluruhan/FieldZipPostal Code'), '45363', 0)

Mobile.tap(findTestObject('Test Scenario Keseluruhan/ButtonCONTINUE'), 0)

Mobile.scrollToText('FINISH', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Test Scenario Keseluruhan/ButtonFINISH'), 0)

Mobile.tap(findTestObject('Test Scenario Keseluruhan/ButtonBACK HOME'), 0)

Mobile.closeApplication()

