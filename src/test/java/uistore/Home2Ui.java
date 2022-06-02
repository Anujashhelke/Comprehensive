package uistore;

import org.openqa.selenium.By;

public class Home2Ui {
	//public static By popUp=By.xpath("//*[@id='popupmsgID']/tbody/tr/td[1]/a");
	//public static By hover=By.xpath("//div[@class='taxonNavigation']//ul/child::li[7]");
	public static By hover=By.xpath("//li[@class='topnav_item studyunit']//span[contains(text(),'Study')]");
	public static By text=By.xpath("//ul[@class='inline-list left']//li[@class='subnav_item 1782']//a");
	public static By popup=By.xpath("//div[@class='vert-container'] //a[contains(text(),'Close')]");		
	public static By product=By.xpath("//div[@class='category_section laptop_tables page-module']//ul[@class='productlist withdivider clearfix laptop_tables productgrid']/descendant::li[2]");
    public static By add=By.xpath("//div[@class='category_section laptop_tables page-module']//ul[@class='productlist withdivider clearfix laptop_tables productgrid']/descendant::li[2]//a[2]");
    public static By addCart=By.xpath("//div[@class='add-to-cart text-center'] //button[@name='button']");
    public static By quantity=By.xpath("//select[@id='select_0_quantity']");
    public static By price=By.xpath("//div[@class='row cart-line-item']//div[4]");
    public static By checkout=By.xpath("//div[@class='action-links clearfix']//div[3]//button[@name='checkout']");
    public static By email=By.xpath("//input[@name='order[email]']");
    public static By pin=By.xpath("//input[@name='order[ship_address_attributes][zipcode]']");
    public static By address=By.xpath("//textarea[@name='order[ship_address_attributes][address1]']");
    public static By fname=By.xpath("//input[@name='order[ship_address_attributes][firstname]']");
   public static By lname=By.xpath("//input[@name='order[ship_address_attributes][lastname]']");
   public static By phone=By.xpath("//input[@name='order[ship_address_attributes][phone]']");
   public static By save=By.xpath("//input[@value='Save and Continue']");
   public static By error=By.xpath("//label[@class='error']");
}
