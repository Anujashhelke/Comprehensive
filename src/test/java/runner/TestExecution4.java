package runner;


	import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pageobject.GiftCollectionPageObject;

	import reusable.WebDriverHelper;
	import utility.BaseClass;
	import utility.ConfigRead;
	import utility.ExtentReport;
	import utility.Snapshot;


		public class TestExecution4 extends BaseClass {
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
				GiftCollectionPageObject gift=new GiftCollectionPageObject(driver);
		       extent.createReport();
				extent.createTest(getClass().getSimpleName());
				snap=new Snapshot();
				extent.logPass("successfully launched the browser");
				gift.clickOnGift();
				Thread.sleep(3000);
				extent.logPass("successfully clicked on gift");
				gift.hover();
				Thread.sleep(3000);
				extent.logPass("successfully hovered on gift");
				gift.clickOnChoose();
				extent.logPass("successfully clicked on choose gift");
				Thread.sleep(3000);
				gift.getText();
				Thread.sleep(3000);
				extent.logPass("successfully get text like price range");
				gift.insertAccount();
				Thread.sleep(3000);
				extent.logPass("successfully inserted amount");
				gift.insertDate();
				Thread.sleep(3000);
				extent.logPass("successfully inserted date");
				gift.clickNext();
				snap.takeSnapshot(driver);
				Thread.sleep(3000);
				gift.sendText("anuja","avni","avni@gmail.com","anuja@gmail.com","657657");
				Thread.sleep(3000);
				extent.logPass("successfully added details");
				gift.clickConfirm();
				
     }
		@AfterClass
		public void close() {
			driver.close();
			extent.endReport();
		}
		
		}
