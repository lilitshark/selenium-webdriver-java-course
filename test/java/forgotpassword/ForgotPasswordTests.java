package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.EmailSentPage;

import static org.testng.Assert.assertEquals;

//import static org.testng.Assert.*;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testRetrievePassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("test@gmail.com");

        EmailSentPage enterEmailPage = forgotPasswordPage.clickRetrievePasswordButton();

        //assertTrue(enterEmailPage.getMessage().contains("Your e-mail's been sent!"),
        //        "Password Recovery confirmation message does not match");
        assertEquals(enterEmailPage.getMessage(), "Your e-mail's been sent!",
                "Password Recovery confirmation message does not match");
    }

}
