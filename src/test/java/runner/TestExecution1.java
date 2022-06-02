package runner;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import pageobject.Homepage;
import reusable.WebDriverHelper;
import utility.BaseClass;
import utility.ConfigRead;
import utility.ExtentReport;
import utility.Snapshot;



public class TestExecution1 extends BaseClass {
	public ConfigRead read;
	public static ExtentReport extent;
	public ExtentTest test;
	Snapshot snap;
	String path;
	public WebDriverHelper helper;
	@Test
	public void basePageNavigation() throws InterruptedException, IOException {
		read=new ConfigRead();
		extent =new ExtentReport();
		driver=setUp();
		driver.get(read.getUrl());
		Homepage h=new Homepage(driver);
		 extent.createReport();
		extent.createTest(getClass().getSimpleName());
		snap=new Snapshot();
		
		path=snap.takeSnapshot(driver);
		extent.logPass("successfully launched");
		
		Thread.sleep(3000);
		//h.closePopUp();
		Thread.sleep(3000);
		h.clickOnSearch();
		extent.logPass("successfully launched");
		Thread.sleep(3000);
		h.sendText();
		extent.logPass("successfully sent text");
		Thread.sleep(3000);
		h.clickOnEnter();
		extent.logPass("successfully clicked on enter");
		Thread.sleep(3000);
		h.closePopup();
		extent.logPass("successfully closed popup");
		Thread.sleep(3000);
		h.verifyProduct();
		extent.logPass("successfully product is verified");
		path=snap.takeSnapshot(driver);
		extent.logPass(path);
		//h.textContain();
		
		
	}
	@AfterClass
	public void close() {
		driver.close();
		extent.endReport();
	}
	
	
	}


