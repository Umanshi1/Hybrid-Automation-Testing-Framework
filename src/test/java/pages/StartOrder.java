package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import uistore.StartOrderLocators;
import utils.Base;
import utils.WebDriverHelper;

public class StartOrder {
    static WebDriverHelper helper = new WebDriverHelper(Base.driver);

    /*
      Method name: clickOnPickUpAndDelivery();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the "Pick Up and Delivery" section.
     */
    public void clickOnPickUpAndDelivery(ExtentTest test) {
        helper.explicitWait(HomePageLocators.pickupAndDelivery, 6);
        helper.clickOnElement(HomePageLocators.pickupAndDelivery);
        test.log(Status.PASS, "TEST5");
    }

    /*
      Method name: clickOnSameDayDelivery();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Same Day Delivery section.
     */
    public void clickOnSameDayDelivery(ExtentTest test) {
        helper.explicitWait(HomePageLocators.samedayDelivery, 6);
        helper.clickOnElement(HomePageLocators.samedayDelivery);
        test.log(Status.PASS, "TEST5");
    }

    /*
      Method name: scrollAndclickonStartOrder();
      Author: Umanshi Sarkar
      Return type: void
      Description: Scrolls to and clicks on the Start Order button.
     */
    public void scrollAndclickonStartOrder(ExtentTest test) {
        helper.explicitWait(StartOrderLocators.startYourOrder, 6);
        helper.scrollToElement(StartOrderLocators.startYourOrder);
        helper.clickOnElement(StartOrderLocators.startYourOrder);
        test.log(Status.PASS, "TEST5");
    }

    /*
      Method name: clickTryAnotherAdress();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Try Another Address button.
     */
    public void clickTryAnotherAdress(ExtentTest test) {
        helper.explicitWait(StartOrderLocators.tryAnotherAddress, 6);
        helper.clickOnElement(StartOrderLocators.tryAnotherAddress);
        test.log(Status.PASS, "TEST5");
    }

    /*
      Method name: verifySameDayDelivery();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the Same Day Delivery URL.
     */
    public void verifySameDayDelivery(ExtentTest test) {
        helper.isURLContaining("same-day-delivery");
        test.log(Status.PASS, "TEST5");
    }

    /*
      Method name: clickOnsignIn();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Sign In button.
     */
    public void clickOnsignIn(ExtentTest test) {
        helper.explicitWait(StartOrderLocators.signIn, 6);
        helper.clickOnElement(StartOrderLocators.signIn);
        test.log(Status.PASS, "TEST5");
    }
}
