package runner;


	import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.AfterClass;
	import org.testng.annotations.Test;

import pageobject.CarriersPageObject;

	
		import reusable.WebDriverHelper;
				import utility.BaseClass;
				import utility.ConfigRead;
		import utility.ExcelRead;
		import utility.ExtentReport;
				import utility.Snapshot;


					public class TextExecution9 extends BaseClass {
						public ConfigRead read;
						public static ExtentReport extent;
						public ExcelRead excel;
						
						Snapshot snap;
						String path;
						public WebDriverHelper helper;
					@Test
						public void basePageNavigation() throws InterruptedException, IOException {
							read=new ConfigRead();
							extent =new ExtentReport();
							excel=new ExcelRead();
							ArrayList<String> data=excel.excelTest(read.getExcelPath());
							driver=setUp();
							driver.get(read.getUrl());
							CarriersPageObject l=new CarriersPageObject(driver);
							extent.createReport();
							extent.createTest(getClass().getSimpleName());
							snap=new Snapshot();
							extent.logPass("successfully launched");
							l.clickOnTvUnit();
						     Thread.sleep(3000);
						     extent.logPass("successfully clicked on tv unit");
						     l.closePopup();
						     extent.logPass("closed popup");
						     l.clickOnUnit();
						     extent.logPass("successfully clicked on wall unit");
						     l.getText();
						     l.hoverOnMaterial();
						     extent.logPass("successfully hover on material");
						     Thread.sleep(2000);
						     l.clickOnCheckBox();
						     Thread.sleep(2000);
						     extent.logPass("successfully checked the box");
						     l.getTextList("Dark");
						     Thread.sleep(2000);
						     l.entermail(data.get(0));
						     Thread.sleep(2000);
						     extent.logPass("successfully entered email");
						     l.subscribe();
						     extent.logPass("successfully suscribe");
						     
							


					}
					@AfterClass
					public void close() {
						driver.close();
						 extent.endReport();
					}
				 
					




}
