package utility;

import basetest.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class Utility extends BaseTest {

    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }

    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public void mouseHover(By by) {
        Actions actions = new Actions(driver);
        WebElement hoverElement = driver.findElement(by);
        actions.moveToElement(hoverElement).build().perform();
    }

    public void sendTextToElement(By by, String txt) {
        driver.findElement(by).sendKeys(txt);
        Random random = new Random();
        int randomInt = random.nextInt(100);
        // emailTxt.sendKeys("Laxmi"+randomInt+"@gmail.com");

    }

    public void verifyTheText(String expTxt, By by) {
        String actualMsg = getTextFromElement(by);
        Assert.assertEquals(expTxt, actualMsg);
    }

    public void dropDownExampleWithList() {

        List<WebElement> productType = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
        for (WebElement product : productType) {
            if (product.getText().equalsIgnoreCase("Loans")) {
                product.click();
            }


        }
    }
}
