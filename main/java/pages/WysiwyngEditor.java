package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwyngEditor {
    private WebDriver driver;
    private String editorIFrameID = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentButton = By.id("mceu_12");

    public WysiwyngEditor(WebDriver driver){
        this.driver = driver;
    }

    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    public void increaseIndentButton(){
        driver.findElement(increaseIndentButton).click();
    }

    public void switchToEditArea(){
        driver.switchTo().frame(editorIFrameID);
    }

    public void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}
