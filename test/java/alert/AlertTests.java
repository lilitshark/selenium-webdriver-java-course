package alert;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerAlert();
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResultText(), "You successfuly clicked an alert", "Alert result doesn't match");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerConfirm();
        assertEquals(alertPage.alert_getText(), "I am a JS Confirm", "Message doesn't match");
        alertPage.alert_clickToDismiss();
    }

    @Test
    public void testSetInputInAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerPrompt();
        String text = "Testing input in alert!";
        alertPage.alert_setInput(text);
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResultText(), "You entered: " + text, "Result doesn't match");
    }
}
