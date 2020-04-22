package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SliderTests extends BaseTests {

    @Test
    public void testSlider4() {
        String value = "4";
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.slideHorizontal(value);
        assertEquals(sliderPage.getRangeText(), value, "Slider value is incorrect");
    }
}