package testsuite;
/**
 * Write down the following test into ‘TopMenuTest’ class
 * 1. userShouldNavigateToComputerPageSuccessfully
 * * click on the ‘Computers’ Tab
 * * Verify the text ‘Computers’
 * 2. userShouldNavigateToElectronicsPageSuccessfully
 * * click on the ‘Electronics’ Tab
 * * Verify the text ‘Electronics’
 * 3. userShouldNavigateToApparelPageSuccessfully
 * * click on the ‘Apparel’ Tab
 * * Verify the text ‘Apparel’ 4.
 * userShouldNavigateToDigitalDownloadsPageSuccessfully
 * * click on the ‘Digital downloads’ Tab
 * * Verify the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully
 * * click on the ‘Books’ Tab
 * * Verify the text ‘Books’
 * 6. userShouldNavigateToJewelryPageSuccessfully
 * * click on the ‘Jewelry’ Tab
 * * Verify the text ‘Jewelry’
 * 7. userShouldNavigateToGiftCardsPageSuccessfully
 * * click on the ‘Gift Cards’ Tab
 * * Verify the text ‘Gift Cards’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/computers']")).click();
        String expectedText = "Computers";
        //Finding actual text and get text from element
        WebElement actualTextElement = driver.findElement(By.tagName("h1"));
        Thread.sleep(2000);
        String actualText = actualTextElement.getText();
        //Verify expected and actual using Assert
        Assert.assertEquals("Computers tab name match error", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/electronics']")).click();
        String expectedText = "Electronics";
        //Finding actual text and get Text from element
        WebElement actualTextElement = driver.findElement(By.tagName("h1"));
        Thread.sleep(2000);
        String actualText = actualTextElement.getText();
        //Verify expected and actual using Assert
        Assert.assertEquals("Electronics tab name match error", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/apparel']")).click();
        String expectedText = "Apparel";
        WebElement actualTextElement = driver.findElement(By.className("page-title"));
        Thread.sleep(2000);
        String actualText = actualTextElement.getText();
        //Verify expected and actual using Assert
        Assert.assertEquals("Apparel tab name match error", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/digital-downloads']")).click();
        String expectedText = "Digital downloads";
        WebElement actualTextElement = driver.findElement(By.className("page-title"));
        Thread.sleep(2000);
        String actualText = actualTextElement.getText();
        //Verify expected and actual using Assert
        Assert.assertEquals("Digital downloads tab name match error", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/books']")).click();
        String expectedText = "Books";
        WebElement actualTextElement = driver.findElement(By.className("page-title"));
        Thread.sleep(2000);
        String actualText = actualTextElement.getText();
        //Verify expected and actual using Assert
        Assert.assertEquals("Books tab name match error", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/jewelry']")).click();
        String expectedText = "Jewelry";
        WebElement actualTextElement = driver.findElement(By.className("page-title"));
        Thread.sleep(2000);
        String actualText = actualTextElement.getText();
        //Verify expected and actual using Assert
        Assert.assertEquals("Jewelry tab name match error", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/gift-cards']")).click();
        String expectedText = "Gift Cards";
        WebElement actualTextElement = driver.findElement(By.className("page-title"));
        Thread.sleep(2000);
        String actualText = actualTextElement.getText();
        //Verify expected and actual using Assert
        Assert.assertEquals("Gift Cards tab name match error", expectedText, actualText);
    }

    @After
    public void setDown() {

        closeBrowser();
    }
}
