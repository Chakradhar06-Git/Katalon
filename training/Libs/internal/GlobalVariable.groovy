package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object GlobalLoginID
     
    /**
     * <p></p>
     */
    public static Object GlobalPassword
     
    /**
     * <p></p>
     */
    public static Object GlobalURL
     
    /**
     * <p></p>
     */
    public static Object GlobalAccountNO
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            GlobalLoginID = selectedVariables['GlobalLoginID']
            GlobalPassword = selectedVariables['GlobalPassword']
            GlobalURL = selectedVariables['GlobalURL']
            GlobalAccountNO = selectedVariables['GlobalAccountNO']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
