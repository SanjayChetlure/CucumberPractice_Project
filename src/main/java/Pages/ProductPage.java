package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage 
{

	@FindBy(xpath = "//span[text()='Men']") private WebElement menLink;
	@FindBy(xpath = "//div[@class='page-title-wrapper']//span[text()='Men']") private WebElement menSection;
	@FindBy(xpath = "//div[@class='product-item-details']//a[@title='Hero Hoodie']") private WebElement HeroHoodie;
	@FindBy(xpath = "//span[text()='Add to Cart']") private WebElement addToCart;
	@FindBy(xpath = "//div[@index='2' and text()='M']") private WebElement size;
	@FindBy(xpath = "//div[@id='option-label-color-93-item-52']") private WebElement colour;
	@FindBy(xpath = "//*[@class='message-success success message']") private WebElement msg;
	WebDriver driver;
	
	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSection() 
	{
		menLink.click();
	}
	
	public boolean verifySection() 
	{
		return menSection.isDisplayed();
	}
	
	public void clickOnProduct()
	{
		HeroHoodie.click();
	}
	
	
	public boolean verifyProductPage()
	{
		return addToCart.isDisplayed();
	}
	
	
	public void selectSizeAndColour()
	{
		size.click();
		colour.click();
	}
	
	
	public void clickOnAddToCart() 
	{
		addToCart.click();
	}
	
	
	public String getMsg()
	{
		return msg.getText();
	}
	
	
}
