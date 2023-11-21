package testsuite;
/**
 * Create the package ‘testsuite’ and create the following classes inside the ‘testsuite’ package.
 * 1. LoginTest
 * 2. TopMenuTest
 * 3. RegisterTest
 * Write down the following test into ‘LoginTest’ class
 * 1. userShouldNavigateToLoginPageSuccessfully * click on the ‘Login’ link
 * * Verify the text ‘Welcome, Please Sign In!’
 * 2. userShouldLoginSuccessfullyWithValidCredentials
 * * click on the ‘Login’ link
 * * Enter valid username
 * * Enter valid password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Log out’ text is display
 * 3. verifyTheErrorMessage
 * * click on the ‘Login’ link
 * * Enter invalid username
 * * Enter invalid password
 * * Click on Login button
 * * Verify the error message ‘Login was unsuccessful.
 * Please correct the errors and try again. No customer account found’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
        //Find the login link and click on login link
        //finding webElement using Link text
        driver.findElement(By.linkText("Log in")).click();
        Thread.sleep(2000);
        //Expected text
        String expectedText = "Welcome, Please Sign In!";
        //Finding actual text and get text from element
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualText = actualTextElement.getText();
        //Verify expected and actual using Assert
        Assert.assertEquals("User not navigated to the login page successfully", expectedText, actualText);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException {
        //finding webElement using Link text
        driver.findElement(By.linkText("Log in")).click();
        Thread.sleep(2000);
        //finding WebElement for Email Text field
        driver.findElement(By.id("Email")).sendKeys("agg.mahak1986@gmail.com");
        Thread.sleep(2000);
        //finding WebElement for Password Text Field
        driver.findElement(By.id("Password")).sendKeys("Aarav12345");
        Thread.sleep(2000);
        //Clicking on login button
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        //driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
        //Verify the logout text is display
        String expectedResult = "Log out";
        String actualResult = driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).getText();
        //Verify expected and actual text
        Assert.assertEquals("User is not able to login successfully",expectedResult,actualResult);
        Thread.sleep(2000);

    }
@Test
    public void verifyTheErrorMessage() throws InterruptedException {
        //finding webElement using Link text
        driver.findElement(By.linkText("Log in")).click();
        //Enter invalid Username
        driver.findElement(By.id("Email")).sendKeys("Mahak123@gmail.com");
        Thread.sleep(2000);
        //Enter invalid password
        driver.findElement(By.id("Password")).sendKeys("Mahak");
        Thread.sleep(2000);
        //Clicking on login button
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        Thread.sleep(2000);
    String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
            "No customer account found";
    //Find the errorMessage element and get the text
    String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
    Assert.assertEquals("Error message",expectedErrorMessage,actualErrorMessage);

    }
    @After
    public void setDown() {
        closeBrowser();
    }
}
