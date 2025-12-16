package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import uistore.OrderHistoryVerificationLocators;
import utils.Base;
import utils.LoggerManager;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class OrderHistoryVerification {

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
      Method name: verifySameDayDeliveryUrl();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the URL of Same Day Delivery section.
     */
    public void verifySameDayDeliveryUrl(ExtentTest test) {
        try {
            if (helper.isURLContaining("same-day-delivery")) {
                Screenshot.takeAScreenshot("same-day-deliveryurl");
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
      Method name: verifySameDayDeliveryHeader();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the Same Day Delivery header.
     */
    public void verifySameDayDeliveryHeader(ExtentTest test) {
        try {
            helper.implicitWait();
            helper.assertion(OrderHistoryVerificationLocators.sameDaylabel, "Same Day Delivery");
            Screenshot.takeAScreenshot("same_day");
            test.log(Status.PASS, "SAME DAY DELIVERY HEADER VERIFIED SUCCESSFULLY");
            LoggerManager.info("Same Day Delivery header verified successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO VERIFY SAME DAY DELIVERY HEADER");
            LoggerManager.error("Failed to verify Same Day Delivery header: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "same day header", "Failed to verify Same Day Delivery header");
        }
    }

    /*
      Method name: clickOn4000();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the 4000 section.
     */
    public void clickOn4000(ExtentTest test) {
        try {
            helper.explicitWait(OrderHistoryVerificationLocators.fourThousand, 6);
            helper.clickOnElement(OrderHistoryVerificationLocators.fourThousand);
            test.log(Status.PASS, "4000 CLICKED SUCCESSFULLY");
            LoggerManager.info("4000 section clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK 4000");
            LoggerManager.error("Failed to click 4000 section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "4000", "Failed to click 4000 section");
        }
    }

    /*
      Method name: verifyOrderHistoryLabel();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the Order History label.
     */
    public void verifyOrderHistoryLabel(ExtentTest test) {
        try {
            helper.implicitWait();
            helper.assertion(OrderHistoryVerificationLocators.orederHistory, "Order history");
            Screenshot.takeAScreenshot("Order_history");
            test.log(Status.PASS, "ORDER HISTORY LABEL VERIFIED SUCCESSFULLY");
            LoggerManager.info("Order History label verified successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO VERIFY ORDER HISTORY LABEL");
            LoggerManager.error("Failed to verify Order History label: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "order history", "Failed to verify Order History label");
        }
    }
}
