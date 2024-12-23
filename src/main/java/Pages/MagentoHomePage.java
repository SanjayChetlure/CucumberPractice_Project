package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class MagentoHomePage 
{
	@FindBy(xpath="//li[@class='authorization-link']//child::a") private WebElement signInLink;
	@FindBy(xpath="//input[@id='search']") private WebElement searchText;
	@FindBy(xpath="//button[@type='submit'][1]") private WebElement searchIcon;
	@FindBy(xpath="//a[@class='product-item-link']") private List<WebElement> productList;

	
	
	WebDriver driver;
	public MagentoHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public boolean isLinkDisplayed()
	{
		return signInLink.isDisplayed();
	}
	
	public void searchText(String text)
	{
		searchText.sendKeys(text);
	}
	
	public void clickSearchIcon()
	{
		searchIcon.click();
	}
	
	public int getProductList()
	{
		return productList.size();
	}

}
