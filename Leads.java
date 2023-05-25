package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Leads {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("https://demo.vtiger.com/vtigercrm/");
      Thread.sleep(2000);
      d.findElement(By.xpath("//button[text()='Sign in']")).click();
      Thread.sleep(2000);
      d.findElement(By.xpath("(//div[@class='row app-navigator'])[1]")).click();
    WebElement ele = d.findElement(By.xpath("//div[@id='MARKETING_modules_dropdownMenu']"));
    Actions action=new Actions(d);
    Thread.sleep(2000);
	action.moveToElement(ele).perform();
	 Thread.sleep(2000);
	 d.findElement(By.id("select2-drop-mask")).click();
	 WebElement ele1 = d.findElement(By.id("s2id_autogen2_search"));
	 d.findElement(By.id("s2id_autogen2_search")).sendKeys("Mr.");
	  ele1.sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
	d.findElement(By.xpath("//span[text()=' Leads']")).click();
	 Thread.sleep(2000);
	d.findElement(By.xpath("//button[@id='Leads_listView_basicAction_LBL_ADD_RECORD']")).click();
	 Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='Leads_editView_fieldName_firstname']")).sendKeys("Parag");
	 Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='Leads_editView_fieldName_lastname']")).sendKeys("chaudhari");
	 Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='Leads_editView_fieldName_phone']")).sendKeys("8530518681");
	 Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='Leads_editView_fieldName_company']")).sendKeys("infosys");
	 Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='Leads_editView_fieldName_mobile']")).sendKeys("8530518681");
	 Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='Leads_editView_fieldName_designation']")).sendKeys("system engineer");
	 Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='Leads_editView_fieldName_fax']")).sendKeys("201-345778");
	 Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='Leads_editView_fieldName_email']")).sendKeys("chaudhariparag612@gmail.com");
	 Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='Leads_editView_fieldName_website']")).sendKeys("www.infosys.com");
	 Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='Leads_editView_fieldName_website']")).sendKeys("3000");
	 Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='Leads_editView_fieldName_noofemployees']")).sendKeys("2000");
	 Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='Leads_editView_fieldName_secondaryemail']")).sendKeys("chaudhariparag612@gmail.com");
	 Thread.sleep(2000);
	d.findElement(By.xpath("//textarea[@id='Leads_editView_fieldName_lane']")).sendKeys("Near Mahatma gandhi statue");
	 Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='Leads_editView_fieldName_pobox']")).sendKeys("pune");
	 Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='Leads_editView_fieldName_code']")).sendKeys("42550");
	 Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='Leads_editView_fieldName_city']")).sendKeys("Pune");
	 Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='Leads_editView_fieldName_country']")).sendKeys("India");
	 Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='Leads_editView_fieldName_state']")).sendKeys("Maharashtara");
	 Thread.sleep(2000);
	d.findElement(By.xpath("//textarea[@id='Leads_editView_fieldName_description']")).sendKeys("NA");
	 Thread.sleep(2000);
	d.findElement(By.xpath("//button[text()='Save']")).click();
	 Thread.sleep(2000);
	d.findElement(By.xpath("//span[@class='fa fa-user']")).click();
	 Thread.sleep(2000);
	
	d.findElement(By.linkText("Sign Out")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
