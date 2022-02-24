package Action_class;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class draganddrop extends base_class {
	
	
	
		@Test
		public void text() {
			
			//URL
			driver.get("http://172.16.0.60:7500/");
			driver.manage().window().maximize();
			
			//GetTitle
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "ASIS - Asset And Services Information System";
			Assert.assertEquals(ActualTitle, ExpectedTitle);
			System.out.println("Title is verified");
			
			//Get Image1 && Image1 text
			WebElement Image1 = driver.findElement(By.xpath("//div[@class=\"logo\"]//img[@src=\"../images/MOHLion-login.png\"]"));
			if (Image1.isDisplayed()) {
				//Image
				System.out.println("Image1 is displayed");
				//Image Text
				System.out.println("The image1 text is "+Image1.getAttribute("Alt"));
			}
			else {
				System.out.println("Image1 is not displayed");
			}
			
			//Image1 && Image text
			WebElement Image2 = driver.findElement(By.xpath("//div[@class=\"logo\"]//img[@src=\"../images/logo-login.png\"]"));
			if (Image2.isDisplayed()) {
				//Image
				System.out.println("Image2 is displayed");
				//Image Text
				System.out.println("The image2 text is "+Image2.getAttribute("Alt"));
			}
			else {
				System.out.println("Image2 is not displayed");
			}
			
			//TEXT PRESENT IN THE LOGIN PAGE
			WebElement Text1 = driver.findElement(By.xpath("//div[@class=\"logo\"]//h1"));
			if(Text1.isDisplayed()) {
				System.out.println("text is displayed");
			}
			
				String Actualtext1 = Text1.getText();
				String Expectedtext1 = "ASIS";
				if(Actualtext1.equals(Expectedtext1)) {
				
				System.out.println("text displayed as"+Expectedtext1);
			}
				else {
					System.out.println("text is not verified");
				}
				//TEXT PRESENT IN THE LOGIN PAGE
				WebElement Text2 = driver.findElement(By.xpath("//div[@class=\"logo\"]//p"));
				if(Text2.isDisplayed()) {
					System.out.println("text is displayed");
				}
				
					String Actualtext2 = Text2.getText();
					String Expectedtext2 = "Asset and Services Information System";
					if(Actualtext2.equals(Expectedtext2)) {
					
					System.out.println("text displayed as"+Expectedtext2);
				}
					else {
						System.out.println("text is not verified");
					}	
				
				
}
}