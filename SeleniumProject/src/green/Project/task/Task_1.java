package green.Project.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseClass.org.Baseclass1;

public class Task_1 extends Baseclass1  {
	
	public static void main(String[] args) throws InterruptedException {
		
		getbrowser("chrome");
		geturl("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
	//	driver.findElement(By.xpath("(//img[@id='user-id-goahead'])[2]")).click();
		
		
		WebElement id = driver.findElement(By.xpath("//input[@title='Login using User ID and password']"));
		//id.click();
		Thread.sleep(2000);
		id.sendKeys("8870128207");
	//	id.submit();
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("(//input[@type='password'])[4]")).sendKeys("12345678");
		
		
		
	}
	

}
