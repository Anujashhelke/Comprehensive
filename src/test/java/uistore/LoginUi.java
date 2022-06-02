package uistore;

import org.openqa.selenium.By;

public class LoginUi {
	
	public static By hover=By.xpath("//section[@class='header__topBar_sectionRight']//li[2]");
     public static By login=By.xpath("//a[contains(text(),'Log In')]");
    public static By email=By.xpath("//input[1][@name='spree_user[email]']");
    public static By pass=By.xpath("//input[@class='required input_authentication']");
    public static By submit=By.xpath("//input[@value='Log In']");
    public static By error =By.xpath("//div[@class='columns sixteen']/descendant::div[1]");
    public static By requiredField=By.xpath("//label[@class='error']");
}
