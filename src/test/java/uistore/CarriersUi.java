package uistore;

import org.openqa.selenium.By;

public class CarriersUi {
	
	public static By tvSet=By.xpath("//div[@class='personalized-component']//div[@class='categories row'][1]//a[4]");
	public static By popup=By.xpath("//div[@class='vert-container'] //a[contains(text(),'Close')]");
	public static By unit=By.xpath("//div[@class='text-center expanded-filters']//descendant::div[5]//a");
	public static By head=By.xpath("//div[@class='header-section']/descendant::h1");
	public static By hover=By.xpath("//div[@class='filters-list-wrapper']/descendant::li[7]");
	public static By check=By.xpath("//div[@class='dropdown-wrapper']//ul[@class='clearfix options']//input[@value='Dark']");
	public static By text=By.xpath("//div[@class='selected-options']//li");
    public static By email=By.xpath("//form[@id='nl-subscribe-footer']/descendant::input[@id='email_id']");
    public static By subscribe=By.xpath("//form[@id='nl-subscribe-footer']/descendant::input[@value='SUBSCRIBE']");
}
