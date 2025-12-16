package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import uistore.TopSellersLocators;
import uistore.WomenDealsLocators;
import utils.Base;
import utils.LoggerManager;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class TopSellers {
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
      Method name: clickOnYouMayAlsoLike();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the You May Also Like button.
     */
    public void clickOnYouMayAlsoLike(ExtentTest test) {
        try {
            helper.explicitWait(TopSellersLocators.youMayAlsoLikeButton, 6);
            helper.clickOnElement(TopSellersLocators.youMayAlsoLikeButton);
            test.log(Status.PASS, "YOU MAY ALSO LIKE CLICKED SUCCESSFULLY");
            LoggerManager.info("You May Also Like button clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK YOU MAY ALSO LIKE");
            LoggerManager.error("Failed to click You May Also Like button: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "you may also like", "Failed to click You May Also Like button");
        }
    }

    /*
      Method name: clickOnTopSellers();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Top Sellers section.
     */
    public void clickOnTopSellers(ExtentTest test) {
        try {
            helper.explicitWait(TopSellersLocators.topSellers, 6);
            helper.clickOnElement(TopSellersLocators.topSellers);
            test.log(Status.PASS, "TOP SELLERS CLICKED SUCCESSFULLY");
            LoggerManager.info("Top Sellers section clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK TOP SELLERS");
            LoggerManager.error("Failed to click Top Sellers section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "top sellers", "Failed to click Top Sellers section");
        }
    }

    /*
      Method name: clickOnDresses();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Dresses section.
     */
    public void clickOnDresses(ExtentTest test) {
        try {
            helper.explicitWait(TopSellersLocators.dresses, 6);
            helper.scrollToElement(TopSellersLocators.dresses);
            helper.clickOnElement(TopSellersLocators.dresses);
            test.log(Status.PASS, "DRESSES CLICKED SUCCESSFULLY");
            LoggerManager.info("Dresses section clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK DRESSES");
            LoggerManager.error("Failed to click Dresses section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "dresses", "Failed to click Dresses section");
        }
    }

    /*
      Method name: verifyDressesLabel();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the Dresses label.
     */
    public void verifyDressesLabel(ExtentTest test) {
        try {
            helper.implicitWait();
            helper.assertion(TopSellersLocators.dressesLabel, "Dresses");
            test.log(Status.PASS, "DRESSES LABEL VERIFIED SUCCESSFULLY");
            LoggerManager.info("Dresses label verified successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO VERIFY DRESSES LABEL");
            LoggerManager.error("Failed to verify Dresses label: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "dresses label", "Failed to verify Dresses label");
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
            helper.explicitWait(TopSellersLocators.firstProduct, 6);
            helper.clickOnElement(TopSellersLocators.firstProduct);
            test.log(Status.PASS, "FIRST PRODUCT CLICKED SUCCESSFULLY");
            LoggerManager.info("First product clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK FIRST PRODUCT");
            LoggerManager.error("Failed to click first product: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "first product", "Failed to click first product");
        }
    }

    /*
      Method name: verifyColour();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the Colour label.
     */
    public void verifyColour(ExtentTest test) {
        try {
            helper.implicitWait();
            helper.assertion(TopSellersLocators.colourLabel, "Color");
            test.log(Status.PASS, "COLOUR LABEL VERIFIED SUCCESSFULLY");
            LoggerManager.info("Colour label verified successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO VERIFY COLOUR LABEL");
            LoggerManager.error("Failed to verify Colour label: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "colour label", "Failed to verify Colour label");
        }
    }
}
