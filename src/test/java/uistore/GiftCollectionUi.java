package uistore;

import org.openqa.selenium.By;

public class GiftCollectionUi {
	
	public static By gift=By.xpath("//ul[@class='featuredLinksBar__linkContainer']/descendant::li[3]");
	public static By hover=By.xpath("//ul[@class='_2sedU']/descendant::li[3]");
	public static By button=By.xpath("//ul[@class='_2sedU']/descendant::li[3]//button");
	public static By text=By.xpath("//section[2][@class='HfdNS']");
	public static By account=By.cssSelector("input[type='number']");
	public static By month=By.xpath("//div[@class='_3PNvG']//select");
	public static By next=By.xpath("//button[contains(text(),'Next')]");
	public static By receipntName=By.xpath("//input[@name='recipient_name']");
	public static By customerName=By.xpath("//input[@name='customer_name']");
	public static By receiprntmail=By.xpath("//input[@name='recipient_email']");
	public static By customerMail=By.xpath("//input[@name='customer_email']");
	public static By phone=By.xpath("//input[@name='customer_mobile_number']");
	public static By confirm=By.xpath("//section[@class='_14QEd _2X0VN']//button");
	


}
