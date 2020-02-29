package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.sql.SQLOutput;
import java.util.List;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);

        //to-delete
        //driver.manage().window().setSize(new Dimension(375, 812));

        //WebElement inputsLink = driver.findElement(By.linkText("Shifting Content"));
        //inputsLink.click();
        //WebElement inputsLink2 = driver.findElement(By.linkText("Example 1: Menu Element"));
        //inputsLink2.click();

        //List<WebElement> links = driver.findElements(By.tagName("li"));
        //System.out.println("Number of table columns are: " + links.size());
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

/*    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
}*/

}
