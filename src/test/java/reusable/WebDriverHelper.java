package reusable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import uistore.Home2Ui;
import utility.BaseClass;

public class WebDriverHelper extends BaseClass{
	

private boolean String;

public void click(By popUp) {
	
		
		driver.findElement(popUp).click();
		
		
		
	}

	public void explicitWaitOfvisibilityOfElementLocated(By search, int i) {
	WebDriverWait wait=new WebDriverWait(driver,i);
	wait.until(ExpectedConditions.visibilityOfElementLocated(search));
		
	}

	public void sentText(By sendText, String string) {
		driver.findElement(sendText).sendKeys(string);
		
	}

	public void textContains(By getText, String string) {
		boolean str= driver.findElement(getText).getText().contains(string);
		if(str==true) {
			System.out.println("text is present"+string);
			 System.out.print(driver.getTitle());
		}
		else {
			System.out.println("text is not preasent");
		}
		
	}

	public void action(By hover) {
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(hover)).build().perform();
		
		
	}

	public void containsText(By text) {
		if(driver.getPageSource().contains("Gandor Wall Clock") ){
			System.out.println("true");
			
		}
		else {
			 System.out.println("false");
		}
		
	}

	public void getText(By text) {
		String price=driver.findElement(text).getText();
		System.out.println(price);
		
		
		
	}

	public void clickOnSearch(By search) {
		driver.findElement(search).click();
		//driver.findElement(search).sendKeys("big bed rooms");
		
	}

	public void clickEnter(By search) {
		
    
    		  driver.findElement(search).sendKeys(Keys.ENTER);
    	 
      
	}
		
		

	public void closePopup(By popup) {
		boolean tr=driver.findElement(popup).isDisplayed();
		if(true) {
			driver.findElement(popup).click();
		}
		
	}

	public void select(By quantity) {
		Select s=new Select(driver.findElement(quantity));
		s.selectByVisibleText("2");
		
		
	}

	public void sendText(By email, By fname, By lname, By phone, By pin, By address, By save, By error) {
		driver.findElement(email).sendKeys("anujashelke0499@gmail.com");
		driver.findElement(phone).sendKeys("9527620877");
		
		driver.findElement(pin).sendKeys("444108");
		driver.findElement(lname).sendKeys("shelke");
		driver.findElement(fname).sendKeys("anuja");
		driver.findElement(address).sendKeys("changalwadi");
		driver.findElement(save);
		if(driver.findElement(error).isDisplayed()) {
			System.out.println(driver.findElement(error).getText());
		}
		
	}

	public void select2(By month) {
		Iterator<WebElement> it=driver.findElements(month).iterator();
		while(it.hasNext()) {
		Select select=new Select(it.next());
		select.selectByIndex(3);
	}

}

	public void clickExecuter(By next) {
		WebElement confirm=driver.findElement(next);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", confirm);
		
		
	}


	public void ErrorMassage(By requiredField) {
		
		Iterator<WebElement>it=driver.findElements(requiredField).iterator();
		while(it.hasNext()) {
			System.out.print(it.next().getText());
		}
	}

	public void getTitle(String string) {
		String title=driver.getTitle();
		if(title.equals(string)) {
			 System.out.println("we are on right page");
		}
		
	}

	public void selectLink(By click) {
		driver.findElement(click).click();
		}

	public void CheckBox(By check) {
		
			driver.findElement(check).click();
		
		
		
	}

	public void clickExe(By doormat) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",doormat);
		
	}

	public void explicitWaitOfElementToBeClickable(By new1, int i) {
		WebDriverWait wait=new WebDriverWait(driver,i);
		wait.until(ExpectedConditions.elementToBeClickable(new1));
		
	}

	public void getPageSource( String string2) {
		if(driver.getPageSource().contains(string2)) {
			 System.out.println("text present"+string2);
		}
		
	}
		
	}

