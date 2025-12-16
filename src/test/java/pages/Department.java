package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import uistore.DepartmentLocators;
import utils.Base;
import utils.LoggerManager;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class Department {
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
      Method name: clickOnTargetNewArrivals();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Target New Arrivals section.
     */
    public void clickOnTargetNewArrivals(ExtentTest test) {
        try {
            helper.explicitWait(HomePageLocators.newArrivals, 6);
            helper.clickOnElement(HomePageLocators.newArrivals);
            test.log(Status.PASS, "TARGET NEW ARRIVALS CLICKED SUCCESSFULLY");
            LoggerManager.info("Target New Arrivals section clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK TARGET NEW ARRIVALS");
            LoggerManager.error("Failed to click Target New Arrivals section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "target new arrivals", "Failed to click Target New Arrivals section");
        }
    }

    /*
      Method name: clickOnNewBirds();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the New Birds section.
     */
    public void clickOnNewBirds(ExtentTest test) {
        try {
            helper.explicitWait(DepartmentLocators.goBirds, 6);
            helper.clickOnElement(DepartmentLocators.goBirds);
            test.log(Status.PASS, "NEW BIRDS CLICKED SUCCESSFULLY");
            LoggerManager.info("New Birds section clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK NEW BIRDS");
            LoggerManager.error("Failed to click New Birds section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "new birds", "Failed to click New Birds section");
        }
    }

    /*
      Method name: verifyNewBirdsUrl();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the URL of New Birds section.
     */
    public void verifyNewBirdsUrl(ExtentTest test) {
        try {
            if (helper.isURLContaining("fan-shop")) {
                Screenshot.takeAScreenshot("NewBirds");
                test.log(Status.PASS, "NEW BIRDS URL VERIFIED SUCCESSFULLY");
                LoggerManager.info("New Birds URL verified successfully");
            } 
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO VERIFY NEW BIRDS URL");
            LoggerManager.error("Failed to verify New Birds URL: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "new birds", "Failed to verify New Birds URL");
        }
    }

    /*
      Method name: clickOnDepartment();
      Author: Umanshi Sarkar
      Return type: void
      Description: Clicks on the Department section.
     */
    public void clickOnDepartment(ExtentTest test) {
        try {
            helper.explicitWait(DepartmentLocators.departement, 6);
            helper.clickOnElement(DepartmentLocators.departement);
            test.log(Status.PASS, "DEPARTMENT CLICKED SUCCESSFULLY");
            LoggerManager.info("Department section clicked successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO CLICK DEPARTMENT");
            LoggerManager.error("Failed to click Department section: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "department", "Failed to click Department section");
        }
    }

    /*
      Method name: verifyDepartmentLabel();
      Author: Umanshi Sarkar
      Return type: void
      Description: Verifies the Department label.
     */
    public void verifyDepartmentLabel(ExtentTest test) {
        try {
            helper.assertion(DepartmentLocators.departement, "Department");
            Screenshot.takeAScreenshot("Department");
            test.log(Status.PASS, "DEPARTMENT LABEL VERIFIED SUCCESSFULLY");
            LoggerManager.info("Department label verified successfully");
        } catch (Exception e) {
            test.log(Status.FAIL, "FAILED TO VERIFY DEPARTMENT LABEL");
            LoggerManager.error("Failed to verify Department label: " + e.getMessage());
            Reporter.attachScreenshotToReport(test, "department label", "Failed to verify Department label");
        }
    }
}
