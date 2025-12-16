package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import uistore.FableBeautyLocators;
import utils.Base;
import utils.LoggerManager;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class FableBeauty {
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
      Method name: clickOnTargetNewArrivals();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Target New Arrivals section.
     */
    public void clickOnTargetNewArrivals(ExtentTest test) {
        try {
            helper.explicitWait(HomePageLocators.newArrivals, 6);
            helper.clickOnElement(HomePageLocators.newArrivals);
            test.log(Status.PASS, "TARGET NEW ARRIVALS CLICKED SUCCESSFULLY");
            LoggerManager.info("Target New Arrivals section clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK TARGET NEW ARRIVALS");
            LoggerManager.error("Failed to click Target New Arrivals section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "target new arrivals", "Failed to click Target New Arrivals section");
        }
    }

    /*
      Method name: verifyTargetNewArivals();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the URL of Target New Arrivals section.
     */
    public void verifyTargetNewArivals(ExtentTest test) {
        try {
        	helper.implicitWait();
            if (helper.isURLContaining("what-s-new")) {
                Screenshot.takeAScreenshot("TargetNewArrivals");
                test.log(Status.PASS, "TARGET NEW ARRIVALS URL VERIFIED SUCCESSFULLY");
                LoggerManager.info("Target New Arrivals URL verified successfully");
            } else {
                throw new Exception("URL does not contain 'TargetNewArrivals'");
            }
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO VERIFY TARGET NEW ARRIVALS URL");
            LoggerManager.error("Failed to verify Target New Arrivals URL: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "target new arrivals", "Failed to verify Target New Arrivals URL");
        }
    }

    /*
      Method name: scrollAndClickFableBeauty();
      Author: Umanshi Sarkar
      Return type: void
      Description: Scrolls to and clicks on the Fable Beauty section.
     */
    public void scrollAndClickFableBeauty(ExtentTest test) {
        try {
            helper.explicitWait(FableBeautyLocators.fableBeauty, 6);
            helper.scrollToElement(FableBeautyLocators.fableBeauty);
            helper.clickOnElement(FableBeautyLocators.fableBeauty);
            test.log(Status.PASS, "FABLE BEAUTY CLICKED SUCCESSFULLY");
            LoggerManager.info("Fable Beauty section clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK FABLE BEAUTY");
            LoggerManager.error("Failed to click Fable Beauty section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "fable beauty", "Failed to click Fable Beauty section");
        }
    }

    /*
      Method name: clickOnFilter();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Filter button.
     */
    public void clickOnFilter(ExtentTest test) {
        try {
            helper.explicitWait(FableBeautyLocators.filter, 6);
            helper.clickOnElement(FableBeautyLocators.filter);
            test.log(Status.PASS, "FILTER CLICKED SUCCESSFULLY");
            LoggerManager.info("Filter button clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK FILTER");
            LoggerManager.error("Failed to click Filter button: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "filter", "Failed to click Filter button");
        }
    }

    /*
      Method name: clickOnType();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Type option.
     */
    public void clickOnType(ExtentTest test) {
        try {
            helper.explicitWait(FableBeautyLocators.type, 6);
            helper.clickOnElement(FableBeautyLocators.type);
            test.log(Status.PASS, "TYPE CLICKED SUCCESSFULLY");
            LoggerManager.info("Type option clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK TYPE");
            LoggerManager.error("Failed to click Type option: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "type", "Failed to click Type option");
        }
    }

    /*
      Method name: verifyTypeLabel();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the Type label.
     */
    public void verifyTypeLabel(ExtentTest test) {
        try {
            helper.assertion(FableBeautyLocators.typeLabel, "Type");
            Screenshot.takeAScreenshot("type");
            test.log(Status.PASS, "TYPE LABEL VERIFIED SUCCESSFULLY");
            LoggerManager.info("Type label verified successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO VERIFY TYPE LABEL");
            LoggerManager.error("Failed to verify Type label: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "type label", "Failed to verify Type label");
        }
    }
}
