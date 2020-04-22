package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider = By.tagName("input");
    private By sliderValue = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void slideHorizontal(String value){
        while (!getRangeText().equals(value)){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }

    }

    public String getRangeText(){
        return driver.findElement(sliderValue).getText();
    }
}
