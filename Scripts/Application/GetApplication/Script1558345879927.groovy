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

getApplication = WS.sendRequest(findTestObject('Application/GetApplication'))

WS.verifyResponseStatusCode(getApplication, 200)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationId', 1)

WS.verifyElementPropertyValue(getApplication, 'data[0].systemInstanceId', 11)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationName', 'Test Application v1.0')

WS.verifyElementPropertyValue(getApplication, 'data[0].createTime', '2019-05-13 15:48:51.063')

WS.verifyElementPropertyValue(getApplication, 'data[0].startDate', '2019-05-13')

WS.verifyElementPropertyValue(getApplication, 'data[0].endDate', '2019-05-13')

WS.verifyElementPropertyValue(getApplication, 'data[0].description', 'Test Application Description')

WS.verifyElementPropertyValue(getApplication, 'data[0].note', 'Test Application Description')

WS.verifyElementPropertyValue(getApplication, 'data[0].category', 1)

WS.verifyElementPropertyValue(getApplication, 'data[0].stage', 1)

WS.verifyElementPropertyValue(getApplication, 'data[0].efford', '1234')

WS.verifyElementPropertyValue(getApplication, 'data[0].origin', 'I')

WS.verifyElementPropertyValue(getApplication, 'data[0].type', 'N')

WS.verifyElementPropertyValue(getApplication, 'data[0].technologies', 'C#')

WS.verifyElementPropertyValue(getApplication, 'data[0].team', 1)

WS.verifyElementPropertyValue(getApplication, 'data[0].priority', 2)

WS.verifyElementPropertyValue(getApplication, 'data[0].status', 3)

WS.verifyElementPropertyValue(getApplication, 'data[0].isDone', false)

WS.verifyElementPropertyValue(getApplication, 'data[0].active', true)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.applicationCharacteristicId', 1)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.applicationId', 1)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.ecf.ecfid', 3)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.ecf.applicationCharacteristicId', 1)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.ecf.e1', 3)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.ecf.e2', 3)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.ecf.e3', 2)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.ecf.e4', 5)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.ecf.e5', 2)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.ecf.e6', 1)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.ecf.e7', 0)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.ecf.e8', 4)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.tcf.tcfid', 1)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.tcf.t1', 5)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.tcf.t2', 5)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.tcf.t3', 3)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.tcf.t4', 2)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.tcf.t5', 3)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.tcf.t6', 1)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.tcf.t7', 5)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.tcf.t8', 2)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.tcf.t9', 2)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.tcf.t10', 3)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.tcf.t11', 5)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.tcf.t12', 1)

WS.verifyElementPropertyValue(getApplication, 'data[0].applicationCharacteristic.tcf.t13', 1)







