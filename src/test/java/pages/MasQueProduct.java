package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import uistore.MasQueProductLocators;
import utils.Base;
import utils.LoggerManager;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class MasQueProduct {
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
            test.log(Status.PASS, "NEW AND FEATURED CLICK");
            LoggerManager.info("New and featured clicked");
        } catch (Exception e) {
            test.log(Status.FAIL, "new and featured not clicked");
            LoggerManager.error("new and featured not clicked" + e.getMessage());
            Reporter.attachScreenshotToReport(test, "new and featured", "new and featured not clicked");
        }
    }

    /*
      Method name: verifyNewAndFeaturedLabel();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the "New and Featured" label.
     */
    public void verifyNewAndFeaturedLabel(ExtentTest test) {
        try {
            helper.assertion(HomePageLocators.newAndFeatured, "New & featured");
            Screenshot.takeAScreenshot("New & featured");
            test.log(Status.PASS, "NEW AND FEATURED label verified");
            LoggerManager.info("New and featured label verified");
        } catch (Exception e) {
            test.log(Status.FAIL, "new and featured label not verified");
            LoggerManager.error("new and featured label not verified" + e.getMessage());
            Reporter.attachScreenshotToReport(test, "new and featured label", "new and featured label not verified");
        }
    }

    /*
      Method name: clickOnMasQue();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the "Mas Que" section.
     */
    public void clickOnMasQue(ExtentTest test) {
        try {
            helper.explicitWait(HomePageLocators.masQue, 6);
            helper.clickOnElement(HomePageLocators.masQue);
            test.log(Status.PASS, "masQue clicked");
            LoggerManager.info("masQue clicked");
        } catch (Exception e) {
            test.log(Status.FAIL, "masQue not clicked");
            LoggerManager.error("masQue not clicked" + e.getMessage());
            Reporter.attachScreenshotToReport(test, "masQue", "masQue not clicked");
        }
    }

    /*
      Method name: verifyMasQueUrl();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the URL of the "Mas Que" section.
     */
    public void verifyMasQueUrl(ExtentTest test) {
        try {
            if (helper.isURLContaining("mas-que")) {
                Screenshot.takeAScreenshot("mas_que_url");
                test.log(Status.PASS, "masQue url verified");
                LoggerManager.info("masQue url verified");
            }
        } catch (Exception e) {
            test.log(Status.FAIL, "masQue url not verified");
            LoggerManager.error("masQue url not verified" + e.getMessage());
            Reporter.attachScreenshotToReport(test, "masQue", "masQue url not verified");
        }
    }

    /*
      Method name: clickOnWays();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the "Ways to Shop" section.
     */
    public void clickOnWays(ExtentTest test) {
        try {
            helper.explicitWait(MasQueProductLocators.waysToShop, 6);
            helper.clickOnElement(MasQueProductLocators.waysToShop);
            test.log(Status.PASS, "waysToShop clicked");
            LoggerManager.info("waysToShop clicked");
        } catch (Exception e) {
            test.log(Status.FAIL, "waysToShop not clicked");
            LoggerManager.error("waysToShop not clicked" + e.getMessage());
            Reporter.attachScreenshotToReport(test, "masQue", "waysToShop not clicked");
        }
    }

    /*
      Method name: clickOnGrade();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the "Grade" button.
     */
    public void clickOnGrade(ExtentTest test) {
        try {
            helper.explicitWait(MasQueProductLocators.button911grade, 6);
            helper.clickOnElement(MasQueProductLocators.button911grade);
            test.log(Status.PASS, "button911grade clicked");
            LoggerManager.info("button911grade clicked");
        } catch (Exception e) {
            test.log(Status.FAIL, "button911grade not clicked");
            LoggerManager.error("button911grade not clicked" + e.getMessage());
            Reporter.attachScreenshotToReport(test, "button911grade", "button911grade not clicked");
        }
    }

    /*
      Method name: clickOnFirstProduct();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the first product.
     */
    public void clickOnFirstProduct(ExtentTest test) {
        try {
            helper.explicitWait(MasQueProductLocators.firstProduct, 6);
            helper.clickOnElement(MasQueProductLocators.firstProduct);
            test.log(Status.PASS, "firstProduct clicked");
            LoggerManager.info("firstProduct clicked");
        } catch (Exception e) {
            test.log(Status.FAIL, "firstProduct not clicked");
            LoggerManager.error("firstProduct not clicked" + e.getMessage());
            Reporter.attachScreenshotToReport(test, "firstProduct", "firstProduct not clicked");
        }
    }
}
