package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {
    private WebDriver driver;

    private By example1Link = By.xpath("//*[@id=\"content\"]/div/a[1]");
    private By example2Link = By.partialLinkText("Example 2");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(example1Link).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickExample2(){
        driver.findElement(example2Link).click();
        return new DynamicLoadingExample2Page(driver);
    }

    public DynamicLoadingExample2Page openExample2InNewTab(){
        //Actions actions = new Actions(driver);
        //actions.sendKeys(Keys.CONTROL).click(driver.findElement(example2Link)).perform();
        driver.findElement(example2Link).sendKeys(Keys.CONTROL, Keys.RETURN);
        return new DynamicLoadingExample2Page(driver);
    }

}
