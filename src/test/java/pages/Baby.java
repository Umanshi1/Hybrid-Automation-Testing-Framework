package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import uistore.BabyLocators;
import utils.Base;
import utils.LoggerManager;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class Baby {
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
      Method name: clickOnMasQue();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Más Que section.
     */
    public void clickOnMasQue(ExtentTest test) {
        try {
            helper.explicitWait(HomePageLocators.masQue, 6);
            helper.clickOnElement(HomePageLocators.masQue);
            test.log(Status.PASS, "MÁS QUE CLICKED SUCCESSFULLY");
            LoggerManager.info("Más Que section clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK MÁS QUE");
            LoggerManager.error("Failed to click Más Que section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "mas que", "Failed to click Más Que section");
        }
    }

    /*
      Method name: verifyMasQueHeader();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the Más Que header.
     */
    public void verifyMasQueHeader(ExtentTest test) {
        try {
            helper.assertion(BabyLocators.masQueLabel, "Más Que");
            Screenshot.takeAScreenshot("Más Que");
            test.log(Status.PASS, "MÁS QUE HEADER VERIFIED SUCCESSFULLY");
            LoggerManager.info("Más Que header verified successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO VERIFY MÁS QUE HEADER");
            LoggerManager.error("Failed to verify Más Que header: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "mas que header", "Failed to verify Más Que header");
        }
    }

    /*
      Method name: clickOnBaby();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Baby section.
     */
    public void clickOnBaby(ExtentTest test) {
        try {
            helper.explicitWait(BabyLocators.baby, 6);
            helper.clickOnElement(BabyLocators.baby);
            test.log(Status.PASS, "BABY SECTION CLICKED SUCCESSFULLY");
            LoggerManager.info("Baby section clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK BABY SECTION");
            LoggerManager.error("Failed to click Baby section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "baby section", "Failed to click Baby section");
        }
    }

    /*
      Method name: verifyBabyPageUrl();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the URL of Baby section.
     */
    public void verifyBabyPageUrl(ExtentTest test) {
        try {
        	helper.implicitWait();
            if (helper.isURLContaining("baby")) {
                Screenshot.takeAScreenshot("babypage");
                test.log(Status.PASS, "BABY PAGE URL VERIFIED SUCCESSFULLY");
                LoggerManager.info("Baby page URL verified successfully");
            } else {
                throw new Exception("URL does not contain 'baby'");
            }
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO VERIFY BABY PAGE URL");
            LoggerManager.error("Failed to verify Baby page URL: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "baby page", "Failed to verify Baby page URL");
        }
    }

    /*
      Method name: clickOnGetItfast();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Get It Fast option.
     */
    public void clickOnGetItfast(ExtentTest test) {
        try {
            helper.explicitWait(BabyLocators.getItFast, 6);
            helper.clickOnElement(BabyLocators.getItFast);
            test.log(Status.PASS, "GET IT FAST CLICKED SUCCESSFULLY");
            LoggerManager.info("Get It Fast option clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK GET IT FAST");
            LoggerManager.error("Failed to click Get It Fast option: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "get it fast", "Failed to click Get It Fast option");
        }
    }

    /*
      Method name: verifyGetItFast();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the Get It Fast label.
     */
    public void verifyGetItFast(ExtentTest test) {
        try {
        	helper.implicitWait();
            helper.assertion(BabyLocators.getItFastFilter, "Get it fast");
            Screenshot.takeAScreenshot("get_it_fast");
            test.log(Status.PASS, "GET IT FAST LABEL VERIFIED SUCCESSFULLY");
            LoggerManager.info("Get It Fast label verified successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO VERIFY GET IT FAST LABEL");
            LoggerManager.error("Failed to verify Get It Fast label: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "get it fast label", "Failed to verify Get It Fast label");
        }
    }
}
