package uistore;

import org.openqa.selenium.By;

public class Home3Ui {
	
	public static By link=By.xpath("//div[@id='footer-links']//a[contains(text(),'Shipping & Delivery')]");
	public static By heading=By.id("page_content");
	
	public static By stories=By.xpath("//div[@class='center testimonial-module']//a[contains(text(),'View all Customer Stories')]");
	public static By storyUser=By.xpath("//div[@class='columns sixteen']/descendant::div[14]");

}
