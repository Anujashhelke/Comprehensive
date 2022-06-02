package pageobject;

import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uistore.Home3Ui;
import utility.ExtentReport;
import utility.Logs;

public class HomePage3 {
	public static WebDriverHelper helper;
	public static WebDriver driver;
	public Logs logUtil;
	public Logger log;
		
		public ExtentReport extent;
	
		public HomePage3(WebDriver driver) {
			 helper=new WebDriverHelper();
			 this.driver=driver;
			 logUtil=new Logs();
				log=logUtil.createLog();
			 extent=new ExtentReport();
			 
		}





	public void clickOnLink() {
		helper.click(Home3Ui.link);
		log.debug("clicked successfully");
		
		
	}



	public void textContain(String string) {
		helper.textContains(Home3Ui.heading,string);
		log.debug("verified text");
		
	}





	public void stories() {
		helper.click(Home3Ui.stories);
		log.debug("clicked on customer stories");
		
		
	}





	public void getUserResponse() {
		System.out.println("\n this is customer response:");
		helper.getText(Home3Ui.storyUser);
		log.debug("successfully got customer response");
		
	}
	

}
