import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class AmpKeywords {
	@Keyword
	def AddActionCommercialESG() {
		if ((WebUI.verifyTextPresent('Add Actions', false)) == true) {

			WebUI.selectOptionByLabel(findTestObject('Action plan/AddActionsCommercialESG/lst_Module'), ModuleName, false)
			WebUI.selectOptionByLabel(findTestObject('Action plan/AddActionsCommercialESG/lst_Asset'), Asset, false)
			WebUI.selectOptionByLabel(findTestObject('Action plan/AddActionsCommercialESG/lst_Priority'), Priority, false)
			WebUI.selectOptionByLabel(findTestObject('Action plan/AddActionsCommercialESG/lst_Status'), Status, false)
			WebUI.selectOptionByLabel(findTestObject('Action plan/AddActionsCommercialESG/lst_ResponsibleBy'), ResponsibleBy, false)

			if ((findTestObject('Object Repository/Action plan/AddActionsCommercialESG/txt_StartDateAndTime')) != null){
				WebUI.clearText(findTestObject('Action plan/AddActionsCommercialESG/txt_StartDateAndTime'))
				WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_StartDateAndTime'), StartDateandTime)
			}
			else {
				WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_StartDateAndTime'), StartDateandTime)
			}

			if ((findTestObject('Action plan/AddActionsCommercialESG/txt_ResolutionDate')) != null){
				WebUI.clearText(findTestObject('Action plan/AddActionsCommercialESG/txt_ResolutionDate'))
				WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_ResolutionDate'), ExpectedResolutiondate)
			}
			else {
				WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_ResolutionDate'), ExpectedResolutiondate)
			}

			if ((findTestObject('Action plan/AddActionsCommercialESG/txt_EndDate')) != null) {
				WebUI.clearText(findTestObject('Action plan/AddActionsCommercialESG/txt_EndDate'))
				WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_EndDate'), EndDateandtime)
			}
			else {
				WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_EndDate'), EndDateandtime)
			}

			WebUI.selectOptionByLabel(findTestObject('Action plan/AddActionsCommercialESG/lst_WaitingFor'), WaitingFor, false)

			if (TobesharedwiththeClient == TobesharedwiththeClient.equalIgnoreCase("Yes")) {
				WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_ToBeSharedWithTheClient'))
			}

			if (Reportable == Reportable.equalIgnoreCase("Yes")) {
				WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_Reportable'))
			}

			if (client == Client.equalIgnoreCase("Yes")) {
				WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_ClientInformed'))
			}

			if (Commercial == Commercial.equalIgnoreCase("Yes")) {
				WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_CommercialInformed'))
			}

			if (Finance == Finance.equalIgnoreCase("Yes")) {
				WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_FinanceInformed'))
			}

			if (Technical == Technical.equalIgnoreCase("Yes")) {
				WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_TechnicalInformed'))
			}

			if (ESG == ESG.equalIgnoreCase("Yes")) {
				WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_EsgInformed'))
			}

			if (ClientManagement == ClientManagement.equalIgnoreCase("Yes")) {
				WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_ClientManagementInformed'))
			}

			if (DebtManagement == DebtManagement.equalIgnoreCase("Yes")) {
				WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_DebtManagementInformed'))
			}

			if(HSE == HSE.equalIgnoreCase("Yes")) {
				WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_HseInformed'))
			}

			if(OM == OM.equalIgnoreCase("Yes")) {
				WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_OMInformed'))
			}

			if(SiteManagement == SiteManagement.equalIgnoreCase("Yes")) {
				WebUI.check(findTestObject('Action plan/AddActionsCommercialESG/chk_SiteManagementDeptInformed'))
			}

			WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_Title'), Title)
			WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_Description'), Description)
			WebUI.selectOptionByLabel(findTestObject('Action plan/AddActionsCommercialESG/lst_Category'), CategoryBy, false)
			WebUI.selectOptionByLabel(findTestObject('Action plan/AddActionsCommercialESG/lst_Frequency'), Frequency, false)

			if ((findTestObject('Action plan/AddActionsCommercialESG/txt_ActualOpExcost')) != null) {
				WebUI.clearText(findTestObject('Action plan/AddActionsCommercialESG/txt_ActualOpExcost'))
				WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_ActualOpExcost'), ActualOpExcost)
			}
			else {
				WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_ActualOpExcost'), ActualOpExcost)
			}

			if ((findTestObject('Action plan/AddActionsCommercialESG/txt_ActualCapExcost')) != null) {
				WebUI.clearText(findTestObject('Action plan/AddActionsCommercialESG/txt_ActualCapExcost'))
				WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_ActualCapExcost'), ActualCapExcost)
			}
			else {
				WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_ActualCapExcost'), ActualCapExcost)
			}

			if((findTestObject('Action plan/AddActionsCommercialESG/txt_ProjectedOpExcost')) != null) {
				WebUI.clearText(findTestObject('Action plan/AddActionsCommercialESG/txt_ProjectedOpExcost'))
				WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_ProjectedOpExcost'), ProjectedopExcost)
			}
			else {
				WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_ProjectedOpExcost'), ProjectedopExcost)
			}

			if((findTestObject('Action plan/AddActionsCommercialESG/txt_ProjectedCapExcost')) != null) {
				WebUI.clearText(findTestObject('Action plan/AddActionsCommercialESG/txt_ProjectedCapExcost'))
				WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_ProjectedCapExcost'), ProjectedCapExcost)
			}
			else {
				WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_ProjectedCapExcost'), ProjectedCapExcost)
			}

			if((findTestObject('Action plan/AddActionsCommercialESG/txt_AcquisitionBudget')) != null) {
				WebUI.clearText(findTestObject('Action plan/AddActionsCommercialESG/txt_AcquisitionBudget'))
				WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_AcquisitionBudget'), AcquisitionBudget)
			}
			else {
				WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_AcquisitionBudget'), AcquisitionBudget)
			}

			if((findTestObject('Action plan/AddActionsCommercialESG/txt_OperatingBudget')) != null) {
				WebUI.clearText(findTestObject('Action plan/AddActionsCommercialESG/txt_OperatingBudget'))
				WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_OperatingBudget'), OperatingBudget)
			}
			else {
				WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_OperatingBudget'), OperatingBudget)
			}
			WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_Latitude'), Latitude)
			WebUI.setText(findTestObject('Action plan/AddActionsCommercialESG/txt_Longitude'), Longitude)
			WebUI.click(findTestObject('Action plan/AddActionsCommercialESG/btn_Save'))
			WebUI.waitForPageLoad(0)
			WebUI.verifyElementPresent(findTestObject('Action plan/AddActionsCommercialESG/Title_Editaction'), 0)
			
			println "The user is able to create action for Commercial ESG."
		}
	}
}

