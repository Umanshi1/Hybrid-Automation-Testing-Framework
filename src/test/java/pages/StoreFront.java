package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import uistore.StoreFrontLocators;
import utils.Base;
import utils.LoggerManager;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class StoreFront {
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
      Method name: clickOnTargetFinds();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Target Finds section.
     */
    public void clickOnTargetFinds(ExtentTest test) {
        try {
            helper.explicitWait(HomePageLocators.targetFinds, 6);
            helper.clickOnElement(HomePageLocators.targetFinds);
            test.log(Status.PASS, "TARGET FINDS CLICKED SUCCESSFULLY");
            LoggerManager.info("Target Finds section clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK TARGET FINDS");
            LoggerManager.error("Failed to click Target Finds section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "target finds", "Failed to click Target Finds section");
        }
    }

    /*
      Method name: verifyTargetUrl();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the URL of Target Finds section.
     */
    public void verifyTargetUrl(ExtentTest test) {
        try {
            helper.implicitWait();
            if (helper.isURLContaining("FINDS_GDD")) {
                Screenshot.takeAScreenshot("targetFinds");
                test.log(Status.PASS, "TARGET FINDS URL VERIFIED SUCCESSFULLY");
                LoggerManager.info("Target Finds URL verified successfully");
            } else {
                throw new Exception("URL does not contain 'FINDS_GDD'");
            }
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO VERIFY TARGET FINDS URL");
            LoggerManager.error("Failed to verify Target Finds URL: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "target finds", "Failed to verify Target Finds URL");
        }
    }

    /*
      Method name: clickOnChantelGrey();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Chantel Grey section.
     */
    public void clickOnChantelGrey(ExtentTest test) {
        try {
            helper.explicitWait(StoreFrontLocators.chantelGrey, 6);
            helper.scrollToElement(StoreFrontLocators.chantelGrey);
            helper.clickOnElement(StoreFrontLocators.chantelGrey);
            test.log(Status.PASS, "CHANTEL GREY CLICKED SUCCESSFULLY");
            LoggerManager.info("Chantel Grey section clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK CHANTEL GREY");
            LoggerManager.error("Failed to click Chantel Grey section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "chantel grey", "Failed to click Chantel Grey section");
        }
    }

    /*
      Method name: verifyChantelGrayLabel();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the Chantel Grey label.
     */
    public void verifyChantelGrayLabel(ExtentTest test) {
        try {
            helper.implicitWait();
            helper.assertion(StoreFrontLocators.chantelGreyLabel, "Chantel Gray");
            Screenshot.takeAScreenshot("Chantel Gray");
            test.log(Status.PASS, "CHANTEL GREY LABEL VERIFIED SUCCESSFULLY");
            LoggerManager.info("Chantel Grey label verified successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO VERIFY CHANTEL GREY LABEL");
            LoggerManager.error("Failed to verify Chantel Grey label: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "chantel grey label", "Failed to verify Chantel Grey label");
        }
    }

    /*
      Method name: clickOnStoreFront();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Store Front section.
     */
    public void clickOnStoreFront(ExtentTest test) {
        try {
            helper.explicitWait(StoreFrontLocators.storeFront, 6);
            helper.clickOnElement(StoreFrontLocators.storeFront);
            test.log(Status.PASS, "STORE FRONT CLICKED SUCCESSFULLY");
            LoggerManager.info("Store Front section clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK STORE FRONT");
            LoggerManager.error("Failed to click Store Front section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "store front", "Failed to click Store Front section");
        }
    }
}
