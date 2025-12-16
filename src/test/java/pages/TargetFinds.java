package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.HomePageLocators;
import uistore.GroceryLocators;
import utils.Base;
import utils.LoggerManager;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class TargetFinds {
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
      Method name: clickOnTargetFinds();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Target Finds section.
     */
    public void clickOnTargetFinds(ExtentTest test) {
        try {
            helper.explicitWait(HomePageLocators.targetFinds, 6);
            helper.clickOnElement(HomePageLocators.targetFinds);
            test.log(Status.PASS, "TARGET FINDS CLICK");
            LoggerManager.info("Target finds clicked");
        } catch (Exception e) {
            test.log(Status.FAIL, "target finds not clicked");
            LoggerManager.error("target finds not clicked" + e.getMessage());
            Reporter.attachScreenshotToReport(test, "target finds", "target finds not clicked");
        }
    }

    /*
      Method name: clickAndVerifyIdeas();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Ideas section and verifies the URL.
     */
    public void clickAndVerifyIdeas(ExtentTest test) {
        try {
            helper.explicitWait(GroceryLocators.ideas, 6);
            helper.clickOnElement(GroceryLocators.ideas);
            if (helper.isURLContaining("ideas")) {
                Screenshot.takeAScreenshot("ideas");
                test.log(Status.PASS, "IDEAS URL VERIFIED");
                LoggerManager.info("Ideas URL verified");
            }
        } catch (Exception e) {
            test.log(Status.FAIL, "ideas URL not verified");
            LoggerManager.error("ideas URL not verified" + e.getMessage());
            Reporter.attachScreenshotToReport(test, "ideas", "ideas URL not verified");
        }
    }

    /*
      Method name: clickOnShow26More();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Show 26 More section.
     */
    public void clickOnShow26More(ExtentTest test) {
        try {
            helper.explicitWait(GroceryLocators.twentySixMore, 6);
            helper.clickOnElement(GroceryLocators.twentySixMore);
            test.log(Status.PASS, "SHOW 26 MORE CLICK");
            LoggerManager.info("Show 26 more clicked");
        } catch (Exception e) {
            test.log(Status.FAIL, "show 26 more not clicked");
            LoggerManager.error("show 26 more not clicked" + e.getMessage());
            Reporter.attachScreenshotToReport(test, "show 26 more", "show 26 more not clicked");
        }
    }

    /*
      Method name: clickOnAnimals();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Animals section.
     */
    public void clickOnAnimals(ExtentTest test) {
        try {
            helper.explicitWait(GroceryLocators.animals, 6);
            helper.clickOnElement(GroceryLocators.animals);
            test.log(Status.PASS, "ANIMALS CLICK");
            LoggerManager.info("Animals clicked");
        } catch (Exception e) {
            test.log(Status.FAIL, "animals not clicked");
            LoggerManager.error("animals not clicked" + e.getMessage());
            Reporter.attachScreenshotToReport(test, "animals", "animals not clicked");
        }
    }

    /*
      Method name: verifyAnimalsPage();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the Animals page URL.
     */
    public void verifyAnimalsPage(ExtentTest test) {
        try {
            if (helper.isURLContaining("animals")) {
                Screenshot.takeAScreenshot("animals");
                test.log(Status.PASS, "ANIMALS PAGE VERIFIED");
                LoggerManager.info("Animals page verified");
            }
        } catch (Exception e) {
            test.log(Status.FAIL, "animals page not verified");
            LoggerManager.error("animals page not verified" + e.getMessage());
            Reporter.attachScreenshotToReport(test, "animals page", "animals page not verified");
        }
    }
}
