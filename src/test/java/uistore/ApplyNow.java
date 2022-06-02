package uistore;

import org.openqa.selenium.By;

public class ApplyNow {
	
	public static By family=By.xpath("//div[@class='slick-track']//ul[@class='product-list slick-slide slick-active']/descendant::li[3]");
    public static By carriers=By.xpath("//div[@id='footer-links']//ul[@class='col-md-6 no-padding bodytext']//a[contains(text(),'Careers')]");
    public static By apply=By.xpath("//dl[@class='tabs']//dd[@class='tab-title']//a[contains(text(),'Apply Now!')]");
    public static By apply2=By.xpath("//div[@id='associate-manager']//a[contains(text(),'Apply Now')]");
    public static By back=By.xpath("//span[contains(text(),'go back to jobs')]");

}
