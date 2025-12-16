package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import uistore.TargetStyleLocators;
import utils.Base;
import utils.LoggerManager;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class TargetStyle {
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
      Method name: clickOnTargetStyle();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Target Style section.
     */
    public void clickOnTargetStyle(ExtentTest test) {
        try {
            helper.explicitWait(HomePageLocators.targetStyle, 6);
            helper.clickOnElement(HomePageLocators.targetStyle);
            test.log(Status.PASS, "TARGET STYLE CLICKED SUCCESSFULLY");
            LoggerManager.info("Target Style section clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK TARGET STYLE");
            LoggerManager.error("Failed to click Target Style section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "target style", "Failed to click Target Style section");
        }
    }

    /*
      Method name: verifyTargetStyleUrl();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the URL of Target Style section.
     */
    public void verifyTargetStyleUrl(ExtentTest test) {
        try {
            helper.implicitWait();
            if (helper.isURLContaining("targetstyle")) {
                Screenshot.takeAScreenshot("targetStyle");
                test.log(Status.PASS, "TARGET STYLE URL VERIFIED SUCCESSFULLY");
                LoggerManager.info("Target Style URL verified successfully");
            } else {
                throw new Exception("URL does not contain 'targetstyle'");
            }
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO VERIFY TARGET STYLE URL");
            LoggerManager.error("Failed to verify Target Style URL: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "target style", "Failed to verify Target Style URL");
        }
    }

    /*
      Method name: verifyStyloeHeader();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the Styloe header.
     */
    public void verifyStyloeHeader(ExtentTest test) {
        try {
            helper.implicitWait();
            helper.assertion(TargetStyleLocators.targeTStyle, "#TargetStyle");
            test.log(Status.PASS, "STYLOE HEADER VERIFIED SUCCESSFULLY");
            LoggerManager.info("Styloe header verified successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO VERIFY STYLOE HEADER");
            LoggerManager.error("Failed to verify Styloe header: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "styloe header", "Failed to verify Styloe header");
        }
    }

    /*
      Method name: clickOnFinds();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Finds section.
     */
    public void clickOnFinds(ExtentTest test) {
        try {
            helper.explicitWait(TargetStyleLocators.finds, 6);
            helper.clickOnElement(TargetStyleLocators.finds);
            test.log(Status.PASS, "FINDS CLICKED SUCCESSFULLY");
            LoggerManager.info("Finds section clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK FINDS");
            LoggerManager.error("Failed to click Finds section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "finds", "Failed to click Finds section");
        }
    }

    /*
      Method name: verifyFinds();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the Finds label.
     */
    public void verifyFinds(ExtentTest test) {
        try {
            helper.implicitWait();
            helper.assertion(TargetStyleLocators.findsLabel, "Finds");
            test.log(Status.PASS, "FINDS LABEL VERIFIED SUCCESSFULLY");
            LoggerManager.info("Finds label verified successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO VERIFY FINDS LABEL");
            LoggerManager.error("Failed to verify Finds label: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "finds label", "Failed to verify Finds label");
        }
    }
}
