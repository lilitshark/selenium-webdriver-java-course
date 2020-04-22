package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPressesPage {

    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultText = By.id("result");

    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterText(String text){
        Actions actions = new Actions(driver);
        actions.sendKeys(driver.findElement(inputField), text).perform();

        //driver.findElements(inputField).sendKeys(text);
    }

    public String getResult(){
        return driver.findElement(resultText).getText();
    }
}
