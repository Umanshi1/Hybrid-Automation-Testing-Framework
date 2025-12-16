package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.GroceryLocators;
import uistore.HomePageLocators;

import utils.Base;
import utils.LoggerManager;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class GroceryPage {
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
        } catch(Exception e) {
            test.log(Status.FAIL, "new and featured not clicked");
            LoggerManager.error("new and featured not clicked" + e.getMessage());
            Reporter.attachScreenshotToReport(test, "new and featured", "new and featured not clicked");
        }
    }

    /*
      Method name: clickOnWomenOwned();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Women Owned Brands section.
     */
    public void clickOnWomenOwned(ExtentTest test) {
        try {
            helper.explicitWait(HomePageLocators.womenOwnedBrands, 6);
            helper.clickOnElement(HomePageLocators.womenOwnedBrands);
            test.log(Status.PASS, "WOMEN OWNED BRANDS CLICK");
            LoggerManager.info("Women owned brands clicked");
        } catch(Exception e) {
            test.log(Status.FAIL, "women owned brands not clicked");
            LoggerManager.error("women owned brands not clicked" + e.getMessage());
            Reporter.attachScreenshotToReport(test, "women owned brands", "women owned brands not clicked");
        }
    }

    /*
      Method name: verifyWomenOwnedUrl();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the URL of Women Owned Brands section.
     */
    public void verifyWomenOwnedUrl(ExtentTest test) {
        try {
            if(helper.isURLContaining("women-owned")) {
                Screenshot.takeAScreenshot("women_owned_url");
                test.log(Status.PASS, "WOMEN OWNED URL VERIFIED");
                LoggerManager.info("Women owned URL verified");
            } else {
                throw new Exception("URL does not contain 'women-owned'");
            }
        } catch(Exception e) {
            test.log(Status.FAIL, "women owned URL not verified");
            LoggerManager.error("women owned URL not verified" + e.getMessage());
            Reporter.attachScreenshotToReport(test, "women owned URL", "women owned URL not verified");
        }
    }

    /*
      Method name: clickOnGrocery();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Grocery section.
     */
    public void clickOnGrocery(ExtentTest test) {
        try {
            helper.explicitWait(GroceryLocators.grocery, 6);
            helper.clickOnElement(GroceryLocators.grocery);
            test.log(Status.PASS, "GROCERY CLICK");
            LoggerManager.info("Grocery clicked");
        } catch(Exception e) {
            test.log(Status.FAIL, "grocery not clicked");
            LoggerManager.error("grocery not clicked" + e.getMessage());
            Reporter.attachScreenshotToReport(test, "grocery", "grocery not clicked");
        }
    }

    /*
      Method name: verifyResultsLabel();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the Results label.
     */
    public void verifyResultsLabel(ExtentTest test) {
        try {
            if(helper.getText(GroceryLocators.resultsLabel).contains("results")) {
                Screenshot.takeAScreenshot("results_label");
                test.log(Status.PASS, "RESULTS LABEL VERIFIED");
                LoggerManager.info("Results label verified");
            } else {
                throw new Exception("Label does not contain 'results'");
            }
        } catch(Exception e) {
            test.log(Status.FAIL, "results label not verified");
            LoggerManager.error("results label not verified" + e.getMessage());
            Reporter.attachScreenshotToReport(test, "results label", "results label not verified");
        }
    }

    /*
      Method name: clickOnPrice();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Price section.
     */
    public void clickOnPrice(ExtentTest test) {
        try {
            helper.explicitWait(GroceryLocators.price, 6);
            helper.clickOnElement(GroceryLocators.price);
            test.log(Status.PASS, "PRICE CLICK");
            LoggerManager.info("Price clicked");
        } catch(Exception e) {
            test.log(Status.FAIL, "price not clicked");
            LoggerManager.error("price not clicked" + e.getMessage());
            Reporter.attachScreenshotToReport(test, "price", "price not clicked");
        }
    }

    /*
      Method name: verifyPriceLabel();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the Price label.
     */
    public void verifyPriceLabel(ExtentTest test) {
        try {
            helper.assertion(GroceryLocators.priceLabel, "Price");
            Screenshot.takeAScreenshot("price_label");
            test.log(Status.PASS, "PRICE LABEL VERIFIED");
            LoggerManager.info("Price label verified");
        } catch(Exception e) {
            test.log(Status.FAIL, "price label not verified");
            LoggerManager.error("price label not verified" + e.getMessage());
            Reporter.attachScreenshotToReport(test, "price label", "price label not verified");
        }
    }
}
