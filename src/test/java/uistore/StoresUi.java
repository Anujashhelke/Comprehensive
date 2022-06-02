package uistore;

import org.openqa.selenium.By;

public class StoresUi {
	
	public static By store=By.xpath("//ul[@class='featuredLinksBar__linkContainer']/descendant::li[1]");
	public static By heading=By.xpath("//div[@id='app-container']//h1");
	public static By viewDetails=By.xpath("//section[@class='_39Cex']//a[6]/descendant::div[2]//button");
    public static By click=By.xpath("//div[@class='info-section']//a[contains(text(),'View on Google Maps')]");
   
    
}
