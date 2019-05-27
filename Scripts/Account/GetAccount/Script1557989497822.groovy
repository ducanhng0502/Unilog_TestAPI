import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

getAccount = WS.sendRequest(findTestObject('Account/GetAccount'))

WS.verifyResponseStatusCode(getAccount, 200)

WS.verifyElementPropertyValue(getAccount, 'data[1].id', 3)

WS.verifyElementPropertyValue(getAccount, 'data[1].idAspNetUser', 3) 

WS.verifyElementPropertyValue(getAccount, 'data[1].email', 'luandnh1998@gmail.com')

WS.verifyElementPropertyValue(getAccount, 'data[1].companyId', 4)

WS.verifyElementPropertyValue(getAccount, 'data[1].role', 3)

WS.verifyElementPropertyValue(getAccount, 'data[1].active', true)

WS.verifyElementPropertyValue(getAccount, 'data[1].manageProject[0].id', 11)

WS.verifyElementPropertyValue(getAccount, 'data[1].manageProject[0].createTime', '2019-05-05 00:00:00.000')

WS.verifyElementPropertyValue(getAccount, 'data[1].manageProject[0].lastUpdate', '2019-05-23 14:20:50.323')

WS.verifyElementPropertyValue(getAccount, 'data[1].manageProject[0].name', 'System Monitoring')

WS.verifyElementPropertyValue(getAccount, 'data[1].manageProject[0].status', 1)

WS.verifyElementPropertyValue(getAccount, 'data[1].manageProject[0].description', 'UniLog - Luan')

WS.verifyElementPropertyValue(getAccount, 'data[1].manageProject[0].serverId', 1)

WS.verifyElementPropertyValue(getAccount, 'data[1].manageProject[0].active', true)

WS.verifyElementPropertyValue(getAccount, 'data[1].manageProject[0].systemsId', 14)

WS.verifyElementPropertyValue(getAccount, 'data[1].manageProject[0].application[0].applicationId', 1)

WS.verifyElementPropertyValue(getAccount, 'data[1].manageProject[0].application[0].applicationName', 'Test Application v1.0')

WS.verifyElementPropertyValue(getAccount, 'data[1].manageProject[0].application[0].createTime', '2019-05-13 15:48:51.063')

WS.verifyElementPropertyValue(getAccount, 'data[1].manageProject[0].application[0].updateTime', '2019-05-21 16:32:14.940')

WS.verifyElementPropertyValue(getAccount, 'data[1].manageProject[0].application[0].category', 1)

WS.verifyElementPropertyValue(getAccount, 'data[1].manageProject[0].application[0].status', 3)

WS.verifyElementPropertyValue(getAccount, 'data[1].manageProject[0].server', '210.2.98.10')


