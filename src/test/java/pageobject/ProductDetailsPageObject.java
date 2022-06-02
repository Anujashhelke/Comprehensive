package pageobject;

import org.openqa.selenium.WebDriver;



	
		import org.apache.logging.log4j.Logger;
		import org.openqa.selenium.WebDriver;

		import reusable.WebDriverHelper;
import uistore.DecorUi;
import uistore.HomeUi;
import uistore.StoresUi;
		import utility.ExtentReport;
		import utility.Logs;

		public class ProductDetailsPageObject {

			
				public static WebDriverHelper helper;
				public static WebDriver driver;
				Logs logUtil;
				Logger log;
				
					public ExtentReport extent;
				
					public ProductDetailsPageObject(WebDriver driver) {
						 helper=new WebDriverHelper();
						 this.driver=driver;
						 logUtil=new Logs();
							log=logUtil.createLog();
						 extent=new ExtentReport();
					}

				

					public void hoverOndecor() {
						helper.action(DecorUi.decor);
						log.info("successfully hover");
						
					}



					public void clickOnDoormat() {
						helper.click(DecorUi.doormat);
						log.info("successfully clicked");
						
					}
                    
					public void closePopup() {
						helper.closePopup(DecorUi.popup);
						log.debug("popup closed successfully");
						
					}


					public void hoverOnRecommended() {
						//helper.explicitWaitOfvisibilityOfElementLocated(DecorUi.recommended, 50);
						helper.action(DecorUi.recommended);
						log.info("successfully hovered");
						
					}



					//public void clickOnArrival() {
						//helper.explicitWaitOfElementToBeClickable(DecorUi.New, 30);
					//	helper.click(DecorUi.New);
						
					//}



					public void getdimension(String string) {
						helper.explicitWaitOfvisibilityOfElementLocated(DecorUi.dimensions, 50);
					helper.getText(DecorUi.dimensions);
					log.info("successfully got");
						
					}



					public void clickOnProduct() {
					helper.click(DecorUi.mat);
					log.info("successfully clicked");
						
					}



					public void textContains(String string) {
						helper.getPageSource(string);
						log.info("successfully verified text");
						
					}
					
	}


