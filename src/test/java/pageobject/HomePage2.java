package pageobject;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import reusable.WebDriverHelper;
import uistore.Home2Ui;
import utility.ExtentReport;
import utility.Logs;

public class HomePage2 {
	public static WebDriverHelper helper;
	public static WebDriver driver;
	Logs logUtil;
	 Logger log;
		
		public ExtentReport extent;
	
		public HomePage2(WebDriver driver) {
			 helper=new WebDriverHelper();
			 this.driver=driver;
			 logUtil=new Logs();
				log=logUtil.createLog();
			 extent=new ExtentReport();
		}
	

     public void hover() {
		helper.action(Home2Ui.hover);
		log.info("hover successfully");
		
	}


    public void clickOnLaptop() {
		helper.click(Home2Ui.text);
		log.info("clicked successfully");
		
	}
	public void closePopup() {
		helper.closePopup(Home2Ui.popup);
		log.info("closed successfully");
	}


   public void hoverOnProduct() {
	helper.action(Home2Ui.product);
	log.info("hovered successfully");
		
	}
	public void addToCart() {
		helper.click(Home2Ui.addCart);
		log.info("added successfully");
	}

    public void clickOnAdd() {
		helper.clickExecuter(Home2Ui.add);
		log.info("addedd on cart successfully");
		
	}


   public void quantity() {
		helper.select(Home2Ui.quantity);
		log.info("quantity selected successfully");
		
	}


   public void Price() {
		helper.getText(Home2Ui.price);
		log.info("text got successfully");
		
	}

   public void checkout() {
		helper.clickExecuter(Home2Ui.checkout);
		log.info("checkout successfully");
		
	}

   public void addDetails() {
		helper.sendText(Home2Ui.email,Home2Ui.fname,Home2Ui.lname,Home2Ui.phone,Home2Ui.pin,Home2Ui.address,Home2Ui.save,Home2Ui.error);
		log.info("details added successfully");
	}

}
