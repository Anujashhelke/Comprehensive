package uistore;

import org.openqa.selenium.By;

public class HelpCentre {
	
	public static By help=By.xpath("//section[@class='featuredLinksBar']//ul[@class='featuredLinksBar__contact-links']//li[1]");
	public static By click=By.xpath("//ul[@class='topics']/descendant::li//a[contains(text(),'Cancellations and Returns')]");
    public static By text=By.xpath("//div[@class='section-title-container']//span[@class='entries-title']");
}
