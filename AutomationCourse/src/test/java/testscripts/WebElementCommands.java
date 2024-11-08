package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
public void locators()
{
	
	WebElement showMessageButton=driver.findElement(By.id("button-one"));
	WebElement classSample =driver.findElement(By.className("clearfix"));
	WebElement tagSample=driver.findElement(By.tagName("section"));
	WebElement linkText=driver.findElement(By.linkText("Checkbox Demo"));
	WebElement partialLinkText =driver.findElement(By.partialLinkText("Checkbox"));
	WebElement name=driver.findElement(By.name("viewport"));
	driver.findElement(By.xpath("//button[@id='button-one']"));
	driver.findElement(By.xpath("//input[@id='value-a']"));
	driver.findElement(By.xpath("//input[contains(@id,'-a')]"));//lengthy names,dynamic elements
	driver.findElement(By.xpath("//button[text()='Show Message']"));
	driver.findElement(By.xpath("//button[starts-with(text(),'Show ')]"));
	driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
	driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));
	driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]/..")); //to find parent
	driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));
	driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
	driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
	driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));
	driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
	driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
	driver.findElement(By.xpath("//label[@for='inputEmail4']//following-sibling::input"));
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebElementCommands webelementcommands =new WebElementCommands();
webelementcommands.intialiseBrowser();
webelementcommands.locators();
webelementcommands.driverQuit();
	}

}














