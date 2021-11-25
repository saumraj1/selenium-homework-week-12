package homepage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utility.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {

        openBrowser(baseUrl);
    }

    @Test
    public void VerifyUsershouldabletoSeeComputer() {
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.xpath("//div[contains(text(),'I agree')]")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();


    }
}