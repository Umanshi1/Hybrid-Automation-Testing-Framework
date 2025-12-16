package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import uistore.SameDayDeliveryLocators;
import uistore.StartOrderLocators;
import utils.Base;
import utils.LoggerManager;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class SameDayDelivery {
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
      Method name: clickOnSameDayDelivery();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Same Day Delivery section.
     */
    public void clickOnSameDayDelivery(ExtentTest test) {
        try {
            helper.explicitWait(HomePageLocators.samedayDelivery, 6);
            helper.clickOnElement(HomePageLocators.samedayDelivery);
            test.log(Status.PASS, "SAME DAY DELIVERY CLICKED SUCCESSFULLY");
            LoggerManager.info("Same Day Delivery section clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK SAME DAY DELIVERY");
            LoggerManager.error("Failed to click Same Day Delivery section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "same day delivery", "Failed to click Same Day Delivery section");
        }
    }

    /*
      Method name: scrollAndclickonStartOrder();
      Author: Umanshi Sarkar
      Return type: void
      Description: Scrolls to and clicks on the Start Order button.
     */
    public void scrollAndclickonStartOrder(ExtentTest test) {
        try {
            helper.explicitWait(StartOrderLocators.startYourOrder, 6);
            helper.scrollToElement(StartOrderLocators.startYourOrder);
            helper.clickOnElement(StartOrderLocators.startYourOrder);
            test.log(Status.PASS, "START ORDER CLICKED SUCCESSFULLY");
            LoggerManager.info("Start Order button clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK START ORDER");
            LoggerManager.error("Failed to click Start Order button: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "start order", "Failed to click Start Order button");
        }
    }

    /*
      Method name: verifySameDayDelivery();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the Same Day Delivery URL.
     */
    public void verifySameDayDelivery(ExtentTest test) {
        try {
            helper.implicitWait();
            if (helper.isURLContaining("same-day-delivery")) {
                Screenshot.takeAScreenshot("same_day");
                test.log(Status.PASS, "SAME DAY DELIVERY URL VERIFIED SUCCESSFULLY");
                LoggerManager.info("Same Day Delivery URL verified successfully");
            } else {
                throw new Exception("URL does not contain 'same-day-delivery'");
            }
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO VERIFY SAME DAY DELIVERY URL");
            LoggerManager.error("Failed to verify Same Day Delivery URL: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "same day delivery", "Failed to verify Same Day Delivery URL");
        }
    }

    /*
      Method name: clickOnShopOrderPickup();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Shop Order Pickup section.
     */
    public void clickOnShopOrderPickup(ExtentTest test) {
        try {
            helper.explicitWait(SameDayDeliveryLocators.ShopOrderPickup, 6);
            helper.scrollToElement(SameDayDeliveryLocators.ShopOrderPickup);
            helper.clickOnElement(SameDayDeliveryLocators.ShopOrderPickup);
            test.log(Status.PASS, "SHOP ORDER PICKUP CLICKED SUCCESSFULLY");
            LoggerManager.info("Shop Order Pickup section clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK SHOP ORDER PICKUP");
            LoggerManager.error("Failed to click Shop Order Pickup section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "shop order pickup", "Failed to click Shop Order Pickup section");
        }
    }

    /*
      Method name: verifyShopOrderUrl();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the URL of Shop Order Pickup section.
     */
    public void verifyShopOrderUrl(ExtentTest test) {
        try {
            helper.implicitWait();
            if (helper.isURLContaining("order-pickup")) {
                Screenshot.takeAScreenshot("orderpickup");
                test.log(Status.PASS, "SHOP ORDER PICKUP URL VERIFIED SUCCESSFULLY");
                LoggerManager.info("Shop Order Pickup URL verified successfully");
            } else {
                throw new Exception("URL does not contain 'order-pickup'");
            }
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO VERIFY SHOP ORDER PICKUP URL");
            LoggerManager.error("Failed to verify Shop Order Pickup URL: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "shop order pickup", "Failed to verify Shop Order Pickup URL");
        }
    }
}
