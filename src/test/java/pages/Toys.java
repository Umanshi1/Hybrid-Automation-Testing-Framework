package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import uistore.ToysLocators;
import uistore.WomenDealsLocators;
import utils.Base;
import utils.LoggerManager;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class Toys {
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
      Method name: clickOnInstorePickUp();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the In-store Pick Up section.
     */
    public void clickOnInstorePickUp(ExtentTest test) {
        try {
            helper.explicitWait(ToysLocators.inStorePickUp, 6);
            helper.clickOnElement(ToysLocators.inStorePickUp);
            test.log(Status.PASS, "IN-STORE PICK UP CLICKED SUCCESSFULLY");
            LoggerManager.info("In-store Pick Up section clicked successfully");
        } catch (Exception e) {
            test.log(Status.PASS, "IN-STORE PICK UP CLICKED SUCCESSFULLY");
            LoggerManager.error("Failed to click In-store Pick Up section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "in-store pick up", "Failed to click In-store Pick Up section");
        }
    }

    /*
      Method name: enterToys();
      Author: Umanshi Sarkar
      Return type: void
      Description: Enters "Toys" in the input field and presses enter.
     */
    public void enterToys(ExtentTest test) {
        try {
            helper.inputData(ToysLocators.inStorePickUp, "Toys");
            helper.pressEnter(ToysLocators.inStorePickUp);
            test.log(Status.PASS, "TOYS ENTERED AND SEARCHED SUCCESSFULLY");
            LoggerManager.info("Toys entered and searched successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO ENTER AND SEARCH TOYS");
            LoggerManager.error("Failed to enter and search Toys: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "enter toys", "Failed to enter and search Toys");
        }
    }

    /*
      Method name: clickOnCheckStores();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Check Stores button.
     */
    public void clickOnCheckStores(ExtentTest test) {
        try {
            helper.explicitWait(ToysLocators.checkStores, 6);
            helper.clickOnElement(ToysLocators.checkStores);
            test.log(Status.PASS, "CHECK STORES CLICKED SUCCESSFULLY");
            LoggerManager.info("Check Stores button clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK CHECK STORES");
            LoggerManager.error("Failed to click Check Stores button: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "check stores", "Failed to click Check Stores button");
        }
    }

    /*
      Method name: checkStoresLabel();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the Check Stores label.
     */
    public void checkStoresLabel(ExtentTest test) {
        try {
            helper.implicitWait();
            helper.assertion(ToysLocators.checkStoresLabel, "Check Stores");
            Screenshot.takeAScreenshot("CheckStores");
            test.log(Status.PASS, "CHECK STORES LABEL VERIFIED SUCCESSFULLY");
            LoggerManager.info("Check Stores label verified successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO VERIFY CHECK STORES LABEL");
            LoggerManager.error("Failed to verify Check Stores label: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "check stores label", "Failed to verify Check Stores label");
        }
    }
}
