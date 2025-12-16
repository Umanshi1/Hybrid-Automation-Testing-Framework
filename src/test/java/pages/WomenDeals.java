package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import uistore.WomenDealsLocators;
import utils.Base;
import utils.LoggerManager;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class WomenDeals {
    static WebDriverHelper helper = new WebDriverHelper(Base.driver);

    /*
      Method name: clickOnPickUpAndDelivery();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the "Pick Up and Delivery" section.
     */
    public void clickOnPickUpAndDelivery(ExtentTest test) {
        try {
            helper.explicitWait(HomePageLocators.pickupAndDelivery, 6);
            helper.clickOnElement(HomePageLocators.pickupAndDelivery);
            test.log(Status.PASS, "PICK UP AND DELIVERY CLICKED SUCCESSFULLY");
            LoggerManager.info("Pick Up and Delivery section clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK PICK UP AND DELIVERY");
            LoggerManager.error("Failed to click Pick Up and Delivery section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "pickup and delivery", "Failed to click Pick Up and Delivery section");
        }
    }

    /*
      Method name: clickOnshopOrderPickup();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Shop Order Pickup section.
     */
    public void clickOnshopOrderPickup(ExtentTest test) {
        try {
            helper.explicitWait(WomenDealsLocators.shopOrderPickup, 6);
            helper.clickOnElement(WomenDealsLocators.shopOrderPickup);
            test.log(Status.PASS, "SHOP ORDER PICKUP CLICKED SUCCESSFULLY");
            LoggerManager.info("Shop Order Pickup section clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK SHOP ORDER PICKUP");
            LoggerManager.error("Failed to click Shop Order Pickup section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "shop order pickup", "Failed to click Shop Order Pickup section");
        }
    }

    /*
      Method name: clickOnWomenClothingDeals();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Women Clothing Deals section.
     */
    public void clickOnWomenClothingDeals(ExtentTest test) {
        try {
            helper.explicitWait(WomenDealsLocators.womenCothingDeals, 6);
            helper.clickOnElement(WomenDealsLocators.womenCothingDeals);
            test.log(Status.PASS, "WOMEN CLOTHING DEALS CLICKED SUCCESSFULLY");
            LoggerManager.info("Women Clothing Deals section clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK WOMEN CLOTHING DEALS");
            LoggerManager.error("Failed to click Women Clothing Deals section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "women clothing deals", "Failed to click Women Clothing Deals section");
        }
    }

    /*
      Method name: clickOnSecondProduct();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the second product.
     */
    public void clickOnSecondProduct(ExtentTest test) {
        try {
            helper.explicitWait(WomenDealsLocators.secondProduct, 6);
            helper.scrollToElement(WomenDealsLocators.secondProduct);
            helper.clickOnElement(WomenDealsLocators.secondProduct);
            test.log(Status.PASS, "SECOND PRODUCT CLICKED SUCCESSFULLY");
            LoggerManager.info("Second product clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK SECOND PRODUCT");
            LoggerManager.error("Failed to click second product: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "second product", "Failed to click second product");
        }
    }

    /*
      Method name: clickOnSizeM();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Size M option.
     */
    public void clickOnSizeM(ExtentTest test) {
        try {
            helper.explicitWait(WomenDealsLocators.sizeM, 6);
            helper.clickOnElement(WomenDealsLocators.sizeM);
            test.log(Status.PASS, "SIZE M CLICKED SUCCESSFULLY");
            LoggerManager.info("Size M option clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK SIZE M");
            LoggerManager.error("Failed to click Size M option: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "size M", "Failed to click Size M option");
        }
    }

    /*
      Method name: clickOnQty();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the quantity option.
     */
    public void clickOnQty(ExtentTest test) {
        try {
            helper.explicitWait(WomenDealsLocators.qty, 6);
            helper.clickOnElement(WomenDealsLocators.qty);
            test.log(Status.PASS, "QUANTITY OPTION CLICKED SUCCESSFULLY");
            LoggerManager.info("Quantity option clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK QUANTITY OPTION");
            LoggerManager.error("Failed to click Quantity option: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "quantity option", "Failed to click Quantity option");
        }
    }

    /*
      Method name: verifyfindAlternative();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the "Find Alternative" section.
     */
    public void verifyfindAlternative(ExtentTest test) {
        try {
            helper.implicitWait();
            helper.assertion(WomenDealsLocators.findAlternative, "Find alternative");
            Screenshot.takeAScreenshot("Find_alternative");
            test.log(Status.PASS, "FIND ALTERNATIVE VERIFIED SUCCESSFULLY");
            LoggerManager.info("Find Alternative verified successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO VERIFY FIND ALTERNATIVE");
            LoggerManager.error("Failed to verify Find Alternative: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "find alternative", "Failed to verify Find Alternative");
        }
    }
}
