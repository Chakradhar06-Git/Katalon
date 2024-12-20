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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.AMPUrl)

WebUI.click(findTestObject('Action plan/Page_AMP/pge_General'))

WebUI.click(findTestObject('Action plan/Page_AMP/pge_Action Plan'))

WebUI.click(findTestObject('Action plan/Page_AMP/pge_Add Action'))

WebUI.selectOptionByLabel(findTestObject('Action plan/AddActionsCommercialESG/lst_Module'), ModuleName, false)

WebUI.selectOptionByLabel(findTestObject('Action plan/AddActionsCommercialESG/lst_Asset'), Asset, false)

WebUI.selectOptionByLabel(findTestObject('Action plan/AddActionsCommercialESG/lst_Priority'), Priority, false)

WebUI.selectOptionByLabel(findTestObject('Action plan/AddActionsCommercialESG/lst_Status'), Status, false)

WebUI.selectOptionByLabel(findTestObject('Action plan/AddActionsCommercialESG/lst_ResponsibleBy'), ResponsibleBy, false)

WebUI.clearText(findTestObject('Action plan/AddActionsCommercialESG/txt_StartDateAndTime'))

WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_StartDateAndTime'), StartDateandTime)

WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_ResolutionDate'), ExpectedResolutiondate)

WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_EndDate'), EndDateandtime)

WebUI.selectOptionByLabel(findTestObject('Action plan/AddActionsCommercialESG/lst_WaitingFor'), WaitingFor, false)

WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_ToBeSharedWithTheClient'))

WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_Reportable'))

WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_ClientInformed'))

WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_CommercialInformed'))

WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_FinanceInformed'))

WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_TechnicalInformed'))

WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_EsgInformed'))

WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_ClientManagementInformed'))

WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_DebtManagementInformed'))

WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_HseInformed'))

WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_OMInformed'))

WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_SiteManagementDeptInformed'))

WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_Title'), Title)

WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_Description'), Description)

WebUI.selectOptionByLabel(findTestObject('Action plan/AddActionsCommercialESG/lst_Category'), Category, false)

WebUI.selectOptionByLabel(findTestObject('Action plan/AddActionsCommercialESG/lst_Frequency'), Frequency, false)

WebUI.clearText(findTestObject('Action plan/AddActionsCommercialESG/txt_ActualOpExcost'))

WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_ActualOpExcost'), ActualOpExcost)

WebUI.clearText(findTestObject('Action plan/AddActionsCommercialESG/txt_ActualCapExcost'))

WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_ActualCapExcost'), ActualCapExcost)

WebUI.clearText(findTestObject('Action plan/AddActionsCommercialESG/txt_ProjectedOpExcost'))

WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_ProjectedOpExcost'), ProjectedopExcost)

WebUI.clearText(findTestObject('Action plan/AddActionsCommercialESG/txt_ProjectedCapExcost'))

WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_ProjectedCapExcost'), ProjectedCapExcost)

WebUI.clearText(findTestObject('Action plan/AddActionsCommercialESG/txt_AcquisitionBudget'))

WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_AcquisitionBudget'), AcquisitionBudget)

WebUI.clearText(findTestObject('Action plan/AddActionsCommercialESG/txt_OperatingBudget'))

WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_OperatingBudget'), OperatingBudget)

WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_Latitude'), Latitude)

WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_Longitude'), Longitude)

WebUI.click(findTestObject('Action plan/AddActionsCommercialESG/btn_Save'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('Action plan/AddActionsCommercialESG/Title_Editaction'), 0)

