package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import uistore.BlackOwnedLocators;
import utils.Base;
import utils.LoggerManager;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class BlackOwned {
    static WebDriverHelper helper = new WebDriverHelper(Base.driver);

    /*
      Method name: clickOnNewAndFeatured();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the "New and Featured" section.
     */
    public void clickOnNewAndFeatured(ExtentTest test) {
        try {
            helper.explicitWait(HomePageLocators.newAndFeatured, 6);
            helper.clickOnElement(HomePageLocators.newAndFeatured);
            test.log(Status.PASS, "NEW AND FEATURED CLICKED SUCCESSFULLY");
            LoggerManager.info("New and Featured section clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK NEW AND FEATURED");
            LoggerManager.error("Failed to click New and Featured section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "new and featured", "Failed to click New and Featured section");
        }
    }

    /*
      Method name: clickOnBlackBeyond();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Black Beyond section.
     */
    public void clickOnBlackBeyond(ExtentTest test) {
        try {
            helper.explicitWait(HomePageLocators.blackHistoryMonth, 6);
            helper.clickOnElement(HomePageLocators.blackHistoryMonth);
            test.log(Status.PASS, "BLACK BEYOND CLICKED SUCCESSFULLY");
            LoggerManager.info("Black Beyond section clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK BLACK BEYOND");
            LoggerManager.error("Failed to click Black Beyond section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "black beyond", "Failed to click Black Beyond section");
        }
    }

    /*
      Method name: verifyBlackOwned();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the URL of Black Owned section.
     */
    public void verifyBlackOwned(ExtentTest test) {
        try {
            if (helper.isURLContaining("black-owned")) {
                Screenshot.takeAScreenshot("blackOwned");
                test.log(Status.PASS, "BLACK OWNED URL VERIFIED SUCCESSFULLY");
                LoggerManager.info("Black Owned URL verified successfully");
            } else {
                throw new Exception("URL does not contain 'black-owned'");
            }
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO VERIFY BLACK OWNED URL");
            LoggerManager.error("Failed to verify Black Owned URL: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "black owned", "Failed to verify Black Owned URL");
        }
    }

    /*
      Method name: clickOnApparell();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Apparell section.
     */
    public void clickOnApparell(ExtentTest test) {
        try {
            helper.explicitWait(BlackOwnedLocators.apparell, 6);
            helper.scrollToElement(BlackOwnedLocators.apparell);
            helper.clickOnElement(BlackOwnedLocators.apparell);
            test.log(Status.PASS, "APPARELL CLICKED SUCCESSFULLY");
            LoggerManager.info("Apparell section clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK APPARELL");
            LoggerManager.error("Failed to click Apparell section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "apparell", "Failed to click Apparell section");
        }
    }

    /*
      Method name: verifyApparall();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the URL of Apparell section.
     */
    public void verifyApparall(ExtentTest test) {
        try {
            helper.implicitWait();
            if (helper.isURLContaining("apparel")) {
                Screenshot.takeAScreenshot("apparell");
                test.log(Status.PASS, "APPARELL URL VERIFIED SUCCESSFULLY");
                LoggerManager.info("Apparell URL verified successfully");
            } else {
                throw new Exception("URL does not contain 'apparel'");
            }
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO VERIFY APPARELL URL");
            LoggerManager.error("Failed to verify Apparell URL: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "apparell", "Failed to verify Apparell URL");
        }
    }

    /*
      Method name: verifyAparellLabel();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the Apparell label.
     */
    public void verifyAparellLabel(ExtentTest test) {
        try {
            helper.implicitWait();
            helper.assertion(BlackOwnedLocators.aparellLabel, "Black History Month Apparel & Accessories");
            Screenshot.takeAScreenshot("Chantel Gray");
            test.log(Status.PASS, "APPARELL LABEL VERIFIED SUCCESSFULLY");
            LoggerManager.info("Apparell label verified successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO VERIFY APPARELL LABEL");
            LoggerManager.error("Failed to verify Apparell label: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "apparell label", "Failed to verify Apparell label");
        }
    }
}
