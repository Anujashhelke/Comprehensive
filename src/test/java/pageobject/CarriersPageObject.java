package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import reusable.WebDriverHelper;
import uistore.CarriersUi;
import uistore.GiftCollectionUi;
import utility.ExtentReport;
import utility.Logs;


public class CarriersPageObject{
	
		public static WebDriverHelper helper;
		public static WebDriver driver;
		Logs logUtil;
		 Logger log;
			
			public ExtentReport extent;
      public CarriersPageObject(WebDriver driver) {
			 helper=new WebDriverHelper();
			 this.driver=driver;
			 logUtil=new Logs();
				log=logUtil.createLog();
			 extent=new ExtentReport();
			
		}

	

	public void clickOnTvUnit() {
		helper.click(CarriersUi.tvSet);
		log.info("successfully clicked");
		
	}

	public void hoverOnMaterial() {
		helper.action(CarriersUi.hover);
		log.info("successfully hovered");
	}

	public void clickOnCheckBox() {
		helper.CheckBox(CarriersUi.check);
		log.info("successfully checked");
		
	}

	public void getText() {
		helper.getText(CarriersUi.head);
		log.info("successfully got");
		
	}



	public void closePopup() {
		helper.closePopup(CarriersUi.popup);
		log.info("successfully closed");
		
	}



	public void clickOnUnit() {
		helper.click(CarriersUi.unit);
		log.info("successfully clicked");
		
	}



	public void getTextList(String string) {
		helper.getText(CarriersUi.text);
		log.info("successfully got");
	}



	public void entermail(String string) {
		helper.sentText(CarriersUi.email, string);
		log.info("successfully entered");
	}



	public void subscribe() {
		helper.click(CarriersUi.subscribe);
		log.info("successfully clicked");
		
	}

}
