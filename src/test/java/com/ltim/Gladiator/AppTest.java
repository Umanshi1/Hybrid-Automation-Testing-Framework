package com.ltim.Gladiator;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.Reporter;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.Baby;
import pages.BlackOwned;
import pages.Department;
import pages.FableBeauty;
import pages.GroceryPage;
import pages.MasQueProduct;
import pages.OrderHistoryVerification;
import pages.StartOrder;
import pages.StoreFront;
import pages.TargetFinds;
import pages.TargetStyle;
import pages.TopSellers;
import pages.Toys;
import pages.WomenClothing;
import pages.WomenDeals;
import pages.BlackOwned;
import pages.SameDayDelivery;
import utils.Base;
import utils.Email;
import utils.Reporter;
import utils.Screenshot;

public class AppTest extends Base{

	
	GroceryPage groceryPage;
	MasQueProduct masQueProduct;
	TargetFinds targetFinds;
	WomenDeals womenDeals;
	StartOrder startOrder;
	FableBeauty fableBeauty;
	Department department;
	Baby baby;
	TargetStyle targetStyle;
	OrderHistoryVerification orderHistoryVerification;
	Toys toys;
	TopSellers topSellers;
	StoreFront storeFront;
	BlackOwned blackOwned;
	WomenClothing womenClothing;
	SameDayDelivery sameDayDelivery;
	static ExtentReports report;
    static ExtentTest test;
    //invocation count
	@BeforeClass
	public  void generateReport(){
        report = Reporter.createReport("TARGET_Report");
    }
    
	@BeforeMethod
    public void startBrowser() {
    	openBrowser();
    }
	
    @Test(enabled =true)
    public void Test1() {
    	test=report.createTest("test1");
    	masQueProduct=new MasQueProduct();
    	masQueProduct.clickOnNewAndFeatured(test);
    	masQueProduct.verifyNewAndFeaturedLabel(test);
    	masQueProduct.clickOnMasQue(test);
    	masQueProduct.verifyMasQueUrl(test);
    	masQueProduct.clickOnWays(test);
    	masQueProduct.clickOnGrade(test);
    	Reporter.sendReportEmail("sarkar.umanshi456@gmail.com", "this is a report for Mas que");
    	
  	
    }
    @Test(enabled = false)
    public void groceryPage() {
    	groceryPage= new GroceryPage();
    	test=report.createTest("groceryPage");
    	groceryPage.clickOnNewAndFeatured(test);
    	groceryPage.clickOnWomenOwned(test);
    	groceryPage.verifyWomenOwnedUrl(test);
    	groceryPage.clickOnGrocery(test);
    	groceryPage.verifyResultsLabel(test);
    	groceryPage.clickOnPrice(test);
    	groceryPage.verifyPriceLabel(test);
    }
    @Test(enabled=false)
    public void targetFinds() throws InterruptedException {
    	targetFinds=new TargetFinds();
    	test=report.createTest("targetFinds");
    	targetFinds.clickOnNewAndFeatured(test);
    	targetFinds.clickOnTargetFinds(test);
    	targetFinds.clickAndVerifyIdeas(test);
    	targetFinds.clickOnShow26More(test);
    	targetFinds.clickOnAnimals(test);
    	targetFinds.verifyAnimalsPage(test);
    	
    	
    }
    @Test(enabled=false) 
    public void womenDeals() {
    	womenDeals=new WomenDeals();
    	test=report.createTest("womenDeals");
    	womenDeals.clickOnPickUpAndDelivery(test);
    	womenDeals.clickOnshopOrderPickup(test);
    	womenDeals.clickOnWomenClothingDeals(test);;
    	womenDeals.clickOnSecondProduct(test);
    	womenDeals.clickOnSizeM(test);
    	womenDeals.clickOnQty(test);
    	womenDeals.verifyfindAlternative(test);
    	
    }
    @Test(enabled=false)
    public void startOrder() {
    	startOrder=new StartOrder();
    	test=report.createTest("startOrder");
    	startOrder.clickOnPickUpAndDelivery(test);
    	startOrder.clickOnSameDayDelivery(test);
    	startOrder.scrollAndclickonStartOrder(test);
    	startOrder.clickTryAnotherAdress(test);
    	startOrder.verifySameDayDelivery(test);
    	startOrder.clickOnsignIn(test);
    }
    @Test(enabled=false) 
    public void fableBeauty() {
    	fableBeauty =new FableBeauty();
        test=report.createTest("fableBeauty");
    	fableBeauty.clickOnNewAndFeatured(test);
    	fableBeauty.clickOnTargetNewArrivals(test);
    	fableBeauty.verifyTargetNewArivals(test);
    	fableBeauty.scrollAndClickFableBeauty(test);
	  	fableBeauty.clickOnFilter(test);
	  	fableBeauty.clickOnType(test);
	  	fableBeauty.verifyTypeLabel(test);
    }
    
    @Test (enabled=false) 
    public void department() {
    	department=new Department();
    	test=report.createTest("department");
    	department.clickOnNewAndFeatured(test);
    	department.clickOnTargetNewArrivals(test);
    	department.clickOnNewBirds(test);
    	department.verifyNewBirdsUrl(test);
    	department.clickOnDepartment(test);
    	department.verifyDepartmentLabel(test);
    }
    @Test(enabled=false) 
    public void baby() {
    	test=report.createTest("baby");
    	baby=new Baby();
    	baby.clickOnNewAndFeatured(test);
    	baby.clickOnMasQue(test);
    	baby.verifyMasQueHeader(test);
    	baby.clickOnBaby(test);
    	baby.verifyBabyPageUrl(test);
    	baby.clickOnGetItfast(test);
    	baby.verifyGetItFast(test);
    }
	@Test(enabled=false) 
	public void targetStyle() throws InterruptedException {
		targetStyle=new TargetStyle();
		test=report.createTest("targetStyle");
		targetStyle.clickOnNewAndFeatured(test);
		targetStyle.clickOnNewAndFeatured(test);
		targetStyle.clickOnTargetStyle(test);
		targetStyle.verifyTargetStyleUrl(test);
		targetStyle.verifyStyloeHeader(test);
		targetStyle.clickOnFinds(test);
		targetStyle.verifyFinds(test);
	}
	@Test(enabled=false) 
	public void orderHistoryVerification() {
		orderHistoryVerification= new OrderHistoryVerification();
		test=report.createTest("orderHistoryVerification");
		orderHistoryVerification.clickOnPickUpAndDelivery(test);
		orderHistoryVerification.clickOnSameDayDelivery(test);
		orderHistoryVerification.verifySameDayDeliveryUrl(test);
		orderHistoryVerification.verifySameDayDeliveryHeader(test);
		orderHistoryVerification.clickOn4000(test);
		orderHistoryVerification.verifyOrderHistoryLabel(test);
	}
	
	@Test(enabled=false)
	public void toys() throws InterruptedException {
		toys=new Toys();
		test=report.createTest("toys");
		toys.clickOnPickUpAndDelivery(test);
		toys.clickOnshopOrderPickup(test);
		Thread.sleep(3000);
		toys.clickOnInstorePickUp(test);
		toys.enterToys(test);
		toys.clickOnCheckStores(test);
		toys.checkStoresLabel(test);
	}
	@Test(enabled=false)
	public void SameDayDelivery() {
		sameDayDelivery=new SameDayDelivery();
		test=report.createTest("SameDayDelivery");
		sameDayDelivery.clickOnPickUpAndDelivery(test);
		sameDayDelivery.clickOnSameDayDelivery(test);
		sameDayDelivery.scrollAndclickonStartOrder(test);
		sameDayDelivery.verifySameDayDelivery(test);
		sameDayDelivery.clickOnShopOrderPickup(test);
		sameDayDelivery.verifyShopOrderUrl(test);
	}
	@Test(enabled=false)
	public void womenClothing() {
		test=report.createTest("womenClothing");
		womenClothing=new WomenClothing();
    	womenClothing.clickOnPickUpAndDelivery(test);
    	womenClothing.clickOnshopOrderPickup(test);
    	womenClothing.clickOnWomenClothingDeals(test);
    	womenClothing.clickOnSecondProduct(test);
    	womenClothing.clickOnSizeM(test);
    	womenClothing.clickOnQty(test);
    	womenClothing.verifyWomenDeals(test);
	}
	@Test(enabled=false)
	public void blackOwned() throws InterruptedException {
		blackOwned=new BlackOwned();
		test=report.createTest("blackOwned");
		blackOwned.clickOnNewAndFeatured(test);
		blackOwned.clickOnBlackBeyond(test);
		blackOwned.verifyBlackOwned(test);
		blackOwned.clickOnApparell(test);
		blackOwned.verifyApparall(test);

	}
	@Test (enabled=false)
	public void storeFront() {
		storeFront=new StoreFront();
		test=report.createTest("storeFront");
		storeFront.clickOnNewAndFeatured(test);
		storeFront.clickOnTargetFinds(test);
		storeFront.verifyTargetUrl(test);
		storeFront.clickOnChantelGrey(test);
		storeFront.verifyChantelGrayLabel(test);
		storeFront.clickOnStoreFront(test);
			
	}
	@Test(enabled=false)
	public void topSellers() {
		topSellers= new TopSellers();
		test=report.createTest("topSellers");
		topSellers.clickOnPickUpAndDelivery(test);
		topSellers.clickOnshopOrderPickup(test);
		topSellers.clickOnYouMayAlsoLike(test);
		topSellers.clickOnTopSellers(test);
		topSellers.clickOnDresses(test);
		topSellers.verifyDressesLabel(test);
		topSellers.clickOnFirstProduct(test);
		topSellers.verifyColour(test);
	}
    @AfterMethod
    public  void endBrowser() {
    	driver.quit();
    }
    @AfterClass
    public void SaveReport(){
        report.flush();
        
        
    }
    
}
