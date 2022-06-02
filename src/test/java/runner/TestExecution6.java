package runner;


	import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.Test;



import pageobject.StoresPageObject;
import reusable.WebDriverHelper;
	import utility.BaseClass;
	import utility.ConfigRead;
	import utility.ExtentReport;
	import utility.Snapshot;


		public class TestExecution6 extends BaseClass {
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
				StoresPageObject h=new StoresPageObject(driver);
		      extent.createReport();
				extent.createTest(getClass().getSimpleName());
				snap=new Snapshot();
				extent.logPass("successfully launched the browser");
				Thread.sleep(3000);
				h.clickOnStores();
				Thread.sleep(3000);
				extent.logPass("successfully clicked on stores");
				h.textContain("Stores");
				Thread.sleep(3000);
				extent.logPass("successfully verified if we are on correct page");
				h.clickOnviewDetails();
				Thread.sleep(3000);
				extent.logPass("successfully clicked on view details");
				//h.getLocation();
				h.clickOnLocation();
				Thread.sleep(2000);
				extent.logPass("successfully clicked on location");
				h.getTitle("Urban Ladder");
				Thread.sleep(3000);
				extent.logPass("successfullygot title of store URBAN LADDER");
				snap.takeSnapshot(driver);
				

	}	
		@AfterClass
		public void close() {
			driver.close();
			extent.endReport();
		}
		
		
	

}
