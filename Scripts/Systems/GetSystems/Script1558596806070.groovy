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

getSystems = WS.sendRequest(findTestObject('Systems/GetSystems'))

WS.verifyResponseStatusCode(getSystems, 200)

WS.verifyElementPropertyValue(getSystems, 'data[0].id', 2)

WS.verifyElementPropertyValue(getSystems, 'data[0].name', 'Unicode System')

WS.verifyElementPropertyValue(getSystems, 'data[0].description', 'Uni System')

WS.verifyElementPropertyValue(getSystems, 'data[0].companyId', 4)

WS.verifyElementPropertyValue(getSystems, 'data[0].active', true)

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].id', 12)

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].createTime', '2019-05-05 00:00:00.000')

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].lastUpdate', '2019-05-23 14:20:50.323')

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].name', 'Promotion')

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].status', 1)

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].description', 'Promotion Dev')

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].serverId', 1)

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].active', true)

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].systemsId', 2)

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].applicationId', 1008)

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].systemInstanceId', 12)

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].applicationName', 'string v2')

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].createTime', '2019-05-22 16:22:18.177')

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].updateTime', '2019-05-22 16:22:18.177')

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].startDate', '2019-05-22')

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].endDate', '2019-05-22')

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].description', 'string')

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].note', 'string')

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].category', 1)

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].stage', 2)

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].efford', 3)

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].origin', 'U')

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].type', 'N')

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].technologies', 'string')

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].team', '1')

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].priority', '2')

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].status', 3)

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].link', 'string')

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].linkMonitor', 'string')

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].sourceCodeUrl', 'string')

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].isDone', false)

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].active', true)

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].applicationCharacteristic.applicationCharacteristicId', 1004)

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].applicationCharacteristic.applicationId', 1008)

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].applicationCharacteristic.active', true)

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].applicationCharacteristic.ecf.ecfid', 1005)

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].applicationCharacteristic.ecf.applicationCharacteristicId', 1004)

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].applicationCharacteristic.tcf.tcfid', 1003)

WS.verifyElementPropertyValue(getSystems, 'data[0].systemInstance[0].application[0].applicationCharacteristic.tcf.applicationCharacteristicId', 1004)




