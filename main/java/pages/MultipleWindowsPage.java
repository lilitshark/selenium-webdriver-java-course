package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.event.AdjustmentListener;

public class MultipleWindowsPage {
    private WebDriver driver;
    private By clickHere = By.linkText("Click Here");

    public MultipleWindowsPage (WebDriver driver){
        this.driver = driver;
    }

    public void clickHere(){
        driver.findElement(clickHere).click();
    }


}
