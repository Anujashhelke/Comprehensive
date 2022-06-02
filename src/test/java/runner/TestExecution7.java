package runner;


	import java.io.IOException;

import org.openqa.selenium.WebDriver;
	import org.testng.annotations.AfterClass;
    import org.testng.annotations.Test;

import pageobject.ProductDetailsPageObject;
import pageobject.StoresPageObject;
	import reusable.WebDriverHelper;
		import utility.BaseClass;
		import utility.ConfigRead;
		import utility.ExtentReport;
		import utility.Snapshot;


			public class TestExecution7 extends BaseClass {
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
					ProductDetailsPageObject h=new ProductDetailsPageObject (driver);
			      extent.createReport();
					extent.createTest(getClass().getSimpleName());
					snap=new Snapshot();
					extent.logPass("successfully launched browser");
					h.hoverOndecor();
					extent.logPass("successfully hovered on decor");
					//Thread.sleep(3000);
					h.clickOnDoormat();
					extent.logPass("clicked on Doormat");
					h.closePopup();
					h.hoverOnRecommended();
					extent.logPass("successfully hovered on recommended");
					//Thread.sleep(3000);
					//h.clickOnArrival();
					Thread.sleep(3000);
					h.clickOnProduct();
					extent.logPass("successfully clicked on product");
					Thread.sleep(2000);
					h.textContains("Kyra Door Mat");
					extent.logPass("successfully verified");
					Thread.sleep(3000);
					

		}	
			
			@AfterClass
			public void close() {
				driver.close();
				extent.endReport();
			}	
		


}
