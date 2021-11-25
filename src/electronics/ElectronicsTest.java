package electronics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utility.Utility;

public class ElectronicsTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {

        openBrowser(baseUrl);
    }

    @Test
    public void VerifyUsershouldabletoSeeElectronic() {
        //driver.navigate().to("https://www.google.com/");
        // driver.navigate().to("https://www.google.com/");
        //driver.findElement(By.xpath("//div[contains(text(),'I agree')]")).click();
        //driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        // driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        //driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();
        driver.findElement(By.linkText("Electronics")).click();
        //driver.navigate().to("https://www.google.com/");
    }

    @Test
    public void verifyUserShouldNavigateToCellPhonePageSuccessfully(){
        Actions actions = new Actions(driver);
        mouseHover(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        mouseHover(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));
        //driver.findElement(By.xpath("//h1[normalize-space()='Cell phones']")).click();
        String expectedMessage = "Verify the text “Cell phones";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = getTextFromElement(By.xpath(" //h1[normalize-space()='Cell phones']"));
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() {
        //Cell Phones
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']"));
        clickOnElement(By.linkText("Cell phones  "));
        clickOnElement(By.xpath("//a[contains(text(),'Cell Phones')]/parent::li"));
        verifyTheText("Cell Phones",By.xpath("//h1[normalize-space()='Cell phones']"));
        clickOnElement(By.xpath("//a[normalize-space()='List']"));

        //NOLIA LUMIYA
        clickOnElement(By.xpath("//a[contains(text(),'Nokia Lumia 1020')]/parent::h2/ancestor::div"));
        sendTextToElement(By.id("product_enteredQuantity_20"),"2");
        clickOnElement(By.id("button[@id='add-to-cart-button-20']"));
        verifyTheText("The product has been added to your shopping cart",By.xpath("//a[normalize-space()='shopping cart']/parent::p"));
        clickOnElement(By.xpath("//span[@title='Close']"));
        mouseHover(By.xpath("//span[@class='vart-lable']"));
        clickOnElement(By.xpath("//button[normalize-space()='Go to cart']"));
        verifyTheText("Shopping cart",By.xpath("//h1[contains(text(),'shopping cart')]/parent::div/ancestor::div"));
        verifyTheText("2",By.id("itemquantity11227"));
        verifyTheText("$698.00",By.xpath("//span[@class='product-subtotal']/parent::td"));
        clickOnElement(By.id("termsofservice"));
        clickOnElement(By.id("checkout"));
        verifyTheText("Welcome, Please Sign In!",By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']/ancestor::div"));
        clickOnElement(By.className("button-1 register-button"));
        verifyTheText("Register",By.xpath("//h1[normalize-space()='Register']/ancestor::div"));

        //FILLING THE FORM
        clickOnElement(By.id("gender-female"));
        sendTextToElement(By.id("FirstName"),"xyyz");

        sendTextToElement(By.id("LastName"),"Prajapati");
        selectByVisibleTextFromDropDown(By.name("DateofBirthDay"),"01");
        selectByVisibleTextFromDropDown(By.name("DateofBirthMonth"),"04");
        selectByVisibleTextFromDropDown(By.name("DateofBirthYear"),"1984");
        sendTextToElement(By.id("Email"),"xyv1234@gmail.com");
        sendTextToElement(By.name("Company"),"Prime Testig");
        clickOnElement(By.name("Newsletter"));
        sendTextToElement(By.id("Password"),"*********");
        sendTextToElement(By.id("ConfirmPassword"),"********");
        clickOnElement(By.id("register-button"));






        driver.close();


    }


}



