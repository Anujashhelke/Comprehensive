package runner;


	import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


import pageobject.LoginPage;
import reusable.WebDriverHelper;
		import utility.BaseClass;
		import utility.ConfigRead;
import utility.ExcelRead;
import utility.ExtentReport;
		import utility.Snapshot;


			public class LoginTestExecution5 extends BaseClass {
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
					
					driver=setUp();
					driver.get(read.getUrl());
					LoginPage l=new LoginPage(driver);
					ArrayList<String> data=excel.excelTest(read.getExcelPath());
			       extent.createReport();
					extent.createTest(getClass().getSimpleName());
					snap=new Snapshot();
					extent.logPass("successfully launched");
					l.hover();
					extent.logPass("successfully hovered");
					l.login();
					extent.logPass("successfully clicked");
					l.enterEmail(data.get(0));
					l.enterPass(data.get(1));
					extent.logPass("successfully entered");
					l.submit();
					extent.logPass("successfully submit");
					Thread.sleep(2000);
					l.errorGet();
					extent.logPass("successfully got error");
					//Thread.sleep(2000);
					l.submit();
					extent.logPass("successfully try to submit");
					l.requiredField();
					extent.logPass("successfully get error massage");
					
					


			}
			@AfterClass
			public void close() {
				extent.endReport();
				driver.close();
			}
			}
