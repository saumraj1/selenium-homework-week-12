package computer;

import com.google.common.base.Verify;
import com.sun.org.apache.bcel.internal.generic.Select;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utility.Utility;

import java.util.ArrayList;
import java.util.Set;

public class TestSuite extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyComputerMenu() throws InterruptedException {
        // WebElement login=   driver.findElement((by));
        // login.click();
        clickOnElement(By.linkText("Computers "));
        clickOnElement(By.linkText("Desktop  "));
        selectByVisibleTextFromDropDown(By.id("//select[@id='products-orderby']"), "Name: Z to A");
        String expectedMessage = "Verify the Product will arrange in Descending order.";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = getTextFromElement(By.xpath(" (//select[@id='products-orderby'])[1]"));
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);
        ArrayList<String> listName = new ArrayList<>();
        listName.add("Computers");
        listName.add("Electronics");
        listName.add("Apparel");
        listName.add("Digital downloads");
        listName.add("Books");
        listName.add("Jewelry");
        listName.add("Gift Cards");
        for (String print : listName) {
            driver.findElement(By.linkText(print)).click();
            Thread.sleep(2000);

        }
    }
}

      /*  @Test
        public void verifyProductAddedToShoppingCartSuccessFully () {
            clickOnElement(By.linkText("Computers "));
            clickOnElement(By.linkText("Desktop "));
            selectByVisibleTextFromDropDown(By.xpath("//select[@id='products-orderby']"), "Name: A to Z");

            clickOnElement(By.linkText("button-2 product-box-add-to-cart-button"));

            verifyTheText(" Verify the Text \"Build your own computer", By.xpath("//h1[normalize-space()='Build your own computer']"));
            selectByVisibleTextFromDropDown(By.xpath("//select[@id='product_attribute_1']"), "2.2 GHz Intel Pentium Dual-Core E2200");
            selectByVisibleTextFromDropDown(By.id("product_attribute_2"), "8GB [+$60.00]");
            clickOnElement(By.xpath("//label[normalize-space()='400 GB [+$100.00]'])[1]"));
            clickOnElement(By.xpath("//label[normalize-space()='Vista Premium [+$60.00]'])[1]"));
            clickOnElement(By.xpath("//label[normalize-space()='Microsoft Office[ [+$50.00]'])[1]"));
            clickOnElement(By.xpath("//input[@id='product_attribute_5_12']"));
            verifyTheText("$1475.00", By.xpath("//span[@id='price-value-1'] "));


            clickOnElement(By.xpath("//button[@id='add-to-cart-button-1']"));
            verifyTheText("The product has been added to your shopping cart", By.xpath("//p[@class]='context']"));
            clickOnElement(By.xpath("//span[@title='close']"));
            mouseHover(By.xpath("//span[@title='cart-lable']"));
            clickOnElement(By.xpath("//button[normalize-space()='Go To cart']"));

            verifyTheText("Shopping cart", By.xpath("//h1[normalize-space()='shopping cart'] "));

            sendTextToElement(By.xpath("//input[@id='itemquantity11274']"), "2");
            clickOnElement(By.xpath("//button[normalize-space()='Update shopping cart']"));
            verifyTheText("$2,950.00", By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,870.00']"));
            clickOnElement(By.xpath("//input[@id='tearmsofservice']"));
            clickOnElement(By.xpath("//button[@id='checkout']"));

            verifyTheText("Welcome, Please Sign In!", By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']"));
            clickOnElement(By.xpath("//button[normalize-space()='Checkout as Guest']"));

            //Filling The FORM
            sendTextToElement(By.xpath("//input[@id='BillingNewAddress_FirstName']"), "xyz1234@gmai.com");
            sendTextToElement(By.xpath("//input[@id='BillingNewAddress_LastName']"), "prajapati");
            sendTextToElement(By.xpath("//input[@id='BillingNewAddress_Email']"), "xyz1234@gmail.com");
            selectByVisibleTextFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"), "United Kingdom");
            sendTextToElement(By.xpath("//input[@id='BillingNewAddress_City']"), "London");
            sendTextToElement(By.xpath("//input[@id='BillingNewAddress_Address1']"), "Harrow");
            sendTextToElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"), "");
            sendTextToElement(By.xpath("BillingNewAddressPhone_Number]"), "2323565677");
            sendTextToElement(By.xpath("BillingNewAddress_PhoneNumber]"), "2323565677");
            clickOnElement(By.xpath("//button[@onclick='Billing.save()']"));
            clickOnElement(By.xpath("//label[normalize-space()='Next Day Air ()$0.00']"));
            clickOnElement(By.xpath("//div[@id='Payment-method-buttons-container']//p[@class='back-link']//a[@href='#']"));
            clickOnElement(By.xpath("//label[normalize-space()='Credit Card']"));
            clickOnElement(By.xpath("//button[@class='button-1 Payment-method-next-step-button']"));


            //SELECTING MASTER CARD AND FILLING THE FORM
            selectByVisibleTextFromDropDown(By.id("CreditCardType"), "Master card");
            sendTextToElement(By.id("CardholderName"), "Ricky Streich");
            sendTextToElement(By.id("CardNumber"), "7894561237894563");
            selectByVisibleTextFromDropDown(By.id("ExpireMonth"), "01");
            selectByVisibleTextFromDropDown(By.id("ExpireYear"), "2025");
            sendTextToElement(By.name("CardCode"), "864");
            clickOnElement(By.xpath("//button[@class='button1' payment-info-next-step--button']"));
            {
              /*  @After
                public void tearDown () {
               closeBrowser();
               // driver.close();
            }*/




