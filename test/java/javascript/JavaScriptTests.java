package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();

    }

    @Test
    public void testScrollToBlockFour(){
        homePage.clickInfiniteScroll().scrollToParagraph(4);
    }


    @Test
    public void testMultipleAttributeToDropdown(){
        var dropdownPage = homePage.clickDropDown();
        List<String> expectedOptions = new ArrayList<String>();
        expectedOptions.add("Option 1");
        expectedOptions.add("Option 2");
        dropdownPage.addMultipleAttributeToCss();
        //TODO
        expectedOptions.forEach(dropdownPage::selectFromDropdown);

        var selectedOptions = dropdownPage.getSelectedOptions();

        System.out.println(dropdownPage.getSelectedOptions());
        assertTrue(selectedOptions.containsAll(expectedOptions), "All options were not selected");
        assertEquals(selectedOptions.size(), expectedOptions.size(), "Number of options do not match");

    }
}
