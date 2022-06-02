package runner;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pageobject.HomePage2;
import pageobject.Homepage;
import reusable.WebDriverHelper;
import utility.BaseClass;
import utility.ConfigRead;
import utility.ExtentReport;
import utility.Snapshot;


	public class TestExecution2 extends BaseClass {
		public ConfigRead read;
		public static ExtentReport extent;
		
		Snapshot snap;
		String path;
		public WebDriverHelper helper;
	@Test
		public void basePageNavigation() throws InterruptedException, IOException {
			read=new ConfigRead();
			extent =new ExtentReport();
			driver=setUp();
			driver.get(read.getUrl());
			HomePage2 h=new HomePage2(driver);
			snap=new Snapshot();
		
	       extent.createReport();
			extent.createTest(getClass().getSimpleName());
		
			extent.logPass("successfully launched");
			h.hover();
			extent.logPass("successfully hovered");
			Thread.sleep(3000);
			h.clickOnLaptop();
			extent.logPass("successfully clicked on product");
			Thread.sleep(3000);
			h.closePopup();
			extent.logPass("successfully close popup");
			Thread.sleep(3000);
			h.hoverOnProduct();
			extent.logPass("successfully hovered");
			Thread.sleep(3000);
			h.clickOnAdd();
			extent.logPass("successfully clicked");
			Thread.sleep(3000);
			h.addToCart();
			extent.logPass("successfully added to cart");
			Thread.sleep(3000);
			h.quantity();
			extent.logPass("successfully added quantity");
			Thread.sleep(3000);
			h.Price();
			extent.logPass("successfully got the price");
			Thread.sleep(3000);
			h.checkout();
			extent.logPass("successfully checkout ");
			Thread.sleep(3000);
			h.addDetails();
			extent.logPass("successfully added details");
			snap.takeSnapshot(driver);
			Thread.sleep(3000);
			
			extent.logPass(path);
			
			

}
	@AfterClass
	public void close() {
		driver.close();
		extent.endReport();
	}
	
	}

