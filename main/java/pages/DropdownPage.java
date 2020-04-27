package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage{

    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFromDropdown(String option){
        findDropdownElement().selectByVisibleText(option);
    }

    //TODO
    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements =
                findDropdownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    private Select findDropdownElement(){
        return new Select(driver.findElement(dropdown));
    }

    public void addMultipleAttributeToCss(){
        var jsExecutor = (JavascriptExecutor)driver;
        String script = "arguments[0].setAttribute('multiple','')";
        jsExecutor.executeScript(script, findDropdownElement());
    }

}
