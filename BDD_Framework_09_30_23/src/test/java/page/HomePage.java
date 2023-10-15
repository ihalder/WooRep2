package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Shared;

public class HomePage {
	
	/*WebDriver dr;
	
	public HomePage(WebDriver dr) {
		
		this.dr = dr;
		PageFactory.initElements(dr, this);
		
	}
	
	@FindBy(xpath = "Xpath of User ID text Box")  WebElement userID;
	@FindBy(xpath = "Xpath of Password text Box")  WebElement passwordBox;
	@FindBy(xpath = "Xpath of Login Button")  WebElement click;
	 String s = "Woo";
	 String passWord = "!5`SamCurren";
	
	public void typeUserID() {
		
		Shared.type(userID, s);
	
	}
	public void typePassword() {
		
		Shared.type(passwordBox, passWord);
	}

	public ProfilePage clickButton() {
		
		Shared.click(click);
		
		return new ProfilePage(dr);
	}*/
	
	public void typeUserID(String myuserID) {
		
		Shared.type(userID, myuserID);
	
	}
	public void typePassword(String myPassword) {
		
		Shared.type(passwordBox, myPassword);
	}
	
}
