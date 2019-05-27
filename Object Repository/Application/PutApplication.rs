<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>PutApplication</name>
   <tag></tag>
   <elementGuidId>99bf1c94-a239-4e45-9901-d49dff200bf5</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;applicationId\&quot;: 8,\n  \&quot;applicationName\&quot;: \&quot;string\&quot;,\n  \&quot;updateTime\&quot;: \&quot;2019-05-22T08:43:26.874Z\&quot;,\n  \&quot;startDate\&quot;: \&quot;2019-05-22T08:43:26.874Z\&quot;,\n  \&quot;endDate\&quot;: \&quot;2019-05-22T08:43:26.874Z\&quot;,\n  \&quot;description\&quot;: \&quot;string\&quot;,\n  \&quot;note\&quot;: \&quot;string\&quot;,\n  \&quot;category\&quot;: 0,\n  \&quot;stage\&quot;: 0,\n  \&quot;efford\&quot;: 0,\n  \&quot;origin\&quot;: \&quot;string\&quot;,\n  \&quot;type\&quot;: \&quot;string\&quot;,\n  \&quot;technologies\&quot;: \&quot;string\&quot;,\n  \&quot;team\&quot;: 0,\n  \&quot;priority\&quot;: 0,\n  \&quot;status\&quot;: 0,\n  \&quot;sourceCodeUrl\&quot;: \&quot;string\&quot;,\n  \&quot;link\&quot;: \&quot;string\&quot;,\n  \&quot;linkMonitor\&quot;: \&quot;string\&quot;,\n  \&quot;isDone\&quot;: true\n}&quot;,
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
   <restRequestMethod>PUT</restRequestMethod>
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
