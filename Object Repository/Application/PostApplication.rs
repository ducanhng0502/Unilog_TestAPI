<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>PostApplication</name>
   <tag></tag>
   <elementGuidId>26ce4d89-920d-4856-a2ae-89ef4a5c4616</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;systemInstanceId\&quot;: 12,\n  \&quot;applicationName\&quot;: \&quot;string v5\&quot;,\n  \&quot;updateTime\&quot;: \&quot;2019-05-22T08:56:13.136Z\&quot;,\n  \&quot;startDate\&quot;: \&quot;2019-05-22T08:56:13.136Z\&quot;,\n  \&quot;endDate\&quot;: \&quot;2019-05-22T08:56:13.136Z\&quot;,\n  \&quot;description\&quot;: \&quot;string\&quot;,\n  \&quot;note\&quot;: \&quot;string\&quot;,\n  \&quot;category\&quot;: 1,\n  \&quot;stage\&quot;: 2,\n  \&quot;efford\&quot;: 3,\n  \&quot;origin\&quot;: \&quot;U\&quot;,\n  \&quot;type\&quot;: \&quot;N\&quot;,\n  \&quot;technologies\&quot;: \&quot;string\&quot;,\n  \&quot;team\&quot;: 1,\n  \&quot;priority\&quot;: 2,\n  \&quot;status\&quot;: 3,\n  \&quot;sourceCodeUrl\&quot;: \&quot;string\&quot;,\n  \&quot;link\&quot;: \&quot;string\&quot;,\n  \&quot;linkMonitor\&quot;: \&quot;string\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://apiunilog.unicode.edu.vn/api/Application</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
