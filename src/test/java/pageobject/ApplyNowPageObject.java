package pageobject;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;

import reusable.WebDriverHelper;
import uistore.ApplyNow;
import utility.ExtentReport;
import utility.Logs;

public class ApplyNowPageObject {
	public static WebDriverHelper helper;
	public static WebDriver driver;
	Logs logUtil;
	Logger log;
	
		public ExtentReport extent;

	public ApplyNowPageObject(WebDriver driver) {
		 helper=new WebDriverHelper();
		 this.driver=driver;
		 logUtil=new Logs();
			log=logUtil.createLog();
		 extent=new ExtentReport();
	}

	public void clickOnCarriers() {
		helper.click(ApplyNow.carriers);
		log.info("successfully clicked on carriers");
		
	}

	public void clickOnApply() {
		helper.click(ApplyNow.apply);
		log.info("successfully clicked on apply");
	}

	public void clickOnApply2() {
		helper.click(ApplyNow.apply2);
		log.info("successfully clicked on apply");
		
	}

	
	
}
