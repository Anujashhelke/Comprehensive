package pageobject;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import reusable.WebDriverHelper;
import uistore.HelpCentre;
import utility.ExtentReport;
import utility.Logs;

public class HelpCenter {
	public static WebDriverHelper helper;
	public static WebDriver driver;
	Logs logUtil;
	Logger log;
	
		public ExtentReport extent;
	
	public HelpCenter(WebDriver driver) {
				 helper=new WebDriverHelper();
				 this.driver=driver;
				 logUtil=new Logs();
					log=logUtil.createLog();
				 extent=new ExtentReport();
			}
		
	

	public void clickOnHelp() {
		
		helper.click(HelpCentre.help);
		log.info( "clicked successfully");
	}



	public void clickOnLink() {
		helper.selectLink(HelpCentre.click);
		log.debug("clicked  successfully");
		
	}



	public void getText(String string) {
		helper.getText(HelpCentre.text);
		log.info("successfully got text");
	}

}