package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");

    }

    @Test
    public void testSwitchToTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
        //assertTrue(driver.getTitle(), "New Window", "Tab titles do not match!")
    }

    @Test
    public void testWindowInNewTab(){
        var buttonPage = homePage.clickDynamicLoading().openExample2InNewTab();
        //var example2Page = homePage.clickDynamicLoading().clickExample2();
        getWindowManager().switchToNewTab();
        assertTrue(buttonPage.isStartButtonPresent(), "Start button is not displayed");
    }
}
