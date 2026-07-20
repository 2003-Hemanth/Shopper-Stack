package shopperstack;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shopper{ 

	public static void main(String[] args)  {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement  login= driver.findElement(By.id("loginBtn"));
		wait.until(ExpectedConditions.visibilityOf(login));
		login.click();
		
		
                //ADMIN LOGIN
		
		   /*WebElement Admin = driver.findElement(By.id("vertical-tab-2"));
			wait.until(ExpectedConditions.visibilityOf(Admin));
			Admin.click();
			WebElement e = driver.findElement(By.id("Email"));
			e.sendKeys("hemanthkc069@gmail.com");
			WebElement p = driver.findElement(By.id("Password"));
			p.sendKeys("Hemanth@2003");
			WebElement l = driver.findElement(By.xpath("//span[text()='Login']"));
			l.click();
			WebElement el = driver.findElement(By.xpath("//div[text()='H']"));
			el.click();
			driver.close();*/
			
		     // MERCHANT LOGIN
		
			/*WebElement m = driver.findElement(By.id("vertical-tab-1"));
			wait.until(ExpectedConditions.visibilityOf(m));
			m.click();
			WebElement em = driver.findElement(By.id("Email"));
			em.sendKeys("Sachin3456@gmail.com");
			WebElement pa = driver.findElement(By.id("Password"));
			pa.sendKeys("Sachin@89");
			WebElement la = driver.findElement(By.xpath("//span[text()='Login']"));
			la.click();*/
		
			// SHOPPER LOGIN
		
			WebElement sh = driver.findElement(By.id("Email"));	
			sh.sendKeys("manju45@gmail.com");
			WebElement ps1 = driver.findElement(By.id("Password"));
			 ps1.sendKeys("Manju@123");
			 WebElement sl = driver.findElement(By.xpath("//span[text()='Login']"));
			sl.click();
			 WebElement sm = driver.findElement(By.linkText("MEN"));
			 sm.click();
			 WebElement sp = driver.findElement(By.xpath("//img[@alt='nike shues']"));
			 sp.click();
			 //driver.navigate().back();
			 
			/* WebElement ac = driver.findElement(By.id("Add To Cart"));
			 ac.click();
			 WebElement cy = driver.findElement(By.xpath("//img[@alt='LEADER Gladiator']"));
			 cy.click();
			 WebElement adc = driver.findElement(By.id("Add To Cart"));
			 adc.click();*/
			 
			  WebElement b = driver.findElement(By.id("Buy Now"));
			  b.click();
			 WebElement radir = driver.findElement(By.id("177515"));
			  radir.click();
			 /* WebElement ad = driver.findElement(By.xpath("//span[text()='Add New Address']"));
			  ad.click();
			  WebElement na = driver.findElement(By.id("Name"));
			  na.sendKeys("Naksha");
			  WebElement ha = driver.findElement(By.id("House/Office Info"));
			  ha.sendKeys("500");
			  WebElement sa = driver.findElement(By.id("Street Info"));
			  sa.sendKeys("Choulrapalya");
			  WebElement la = driver.findElement(By.id("Landmark"));
			  la.sendKeys("Bangalore");
			  WebElement dp = driver.findElement(By.id("Country"));
			  Select s = new Select(dp);
			  s.selectByVisibleText("India");
			  WebElement sdp = driver.findElement(By.id("State"));
			  Select ss = new Select(sdp);
			  ss.selectByVisibleText("Karnataka");
			  WebElement cs = driver.findElement(By.id("City"));
			  Select cy = new Select(cs);
			  cy.selectByVisibleText("Bengaluru");
			  WebElement pin = driver.findElement(By.id("Pincode"));
			  pin.sendKeys("560010");
			  WebElement phone = driver.findElement(By.id("Phone Number"));
			  phone.sendKeys("8792991146");
			  WebElement add = driver.findElement(By.id("addAddress"));
			  add.click();
			  WebElement radio = driver.findElement(By.id("177511"));
			  radio.click();*/
			
			 WebElement pr = driver.findElement(By.xpath("//button[text()='Proceed']"));
			  pr.click();
			  WebElement cd = driver.findElement(By.xpath("//span[text()='Cash On Delivery (COD)']"));
			  cd.click();
			  WebElement fr = driver.findElement(By.xpath("//button[text()='Proceed']"));
			  fr.click();
			 // driver.close();
			  
			 
			  
			
	}
}
	


