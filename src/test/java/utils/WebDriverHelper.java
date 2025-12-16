package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class WebDriverHelper {

    private WebDriver driver;

    public WebDriverHelper(WebDriver driver) {
        this.driver = driver;
    }

    // Click on an element By locator
    public void clickOnElement(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    // Send keys to an element
    public void inputData(By locator, String data) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(data);
    }

    // Press ENTER key on an element
    public void pressEnter(By locator) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(Keys.ENTER);
    }

    // Hover over an element
    public void hoverOverElement(By locator) {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(locator);
        action.moveToElement(element).perform();
    }

    // Scroll to an element
    public void scrollToElement(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(locator);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    // Switch to a specific window by index
    public void switchToWindow(int n) {
        Object[] windowHandles = driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[n]);
    }

    // Get text of an element
    public String getText(By locator) {
        WebElement element = driver.findElement(locator);
        return element.getText();
    }

    // Set implicit wait
    public void implicitWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    // Set explicit wait
    public void explicitWait(By locator, int timeInSeconds) {
        new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Assert the text of an element
    public void assertion(By locator, String text) {
        String actualText = getText(locator);
        assert (actualText.equals(text)); 
    }

    // Handle select dropdown
    public void handleSelect(By locator) {
        new Select(driver.findElement(locator));
    }

    // Select a value from dropdown
    public void selectValue(By locator, String value) {
        Select select = new Select(driver.findElement(locator));
        select.selectByVisibleText(value);
    }

    // Switch to a specific iframe by index
    public void switchToIframe(int index) {
        driver.switchTo().frame(index);
    }

    // Switch back to the main window
    public void switchToMainWindow() {
        driver.switchTo().defaultContent();
    }
    
    // Switch to the parent frame
    public void switchToPreviousFrame() {
        driver.switchTo().parentFrame();
    }
    
    // Check if URL contains the specific text 
    public boolean isURLContaining(String text) {
        return driver.getCurrentUrl().contains(text);
    }
}