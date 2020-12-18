package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.WaitUtils;

public class MainPage extends AbstractPage{
	
	//links
	@FindBy(linkText = "Desktops") //iesko elemento pagal teksta
	private WebElement linkDesktop;
	
	@FindBy(linkText = "Show All Desktops") 
	private WebElement linkAllDesktop;
	
	//button
	@FindBy(xpath = "//*[@id=\"cart-total\"]")
	public WebElement buttonCart;
	
	//input
	@FindBy(name = "search")
	public WebElement inputSearch;	
	
	//button
	@FindBy(css = "#search > span > button")
	public WebElement buttonSearch;
	

	public MainPage(WebDriver driver) {
		super(driver);
	}

	public void clickLinkDesktops() {
		linkDesktop.click();
	}
	
	public void clickLinkAllDesktops() {
		linkAllDesktop.click();
	}
	
	//universalus metodas, clickina ieskodamas pagal productname ir ideda i krepseli
	public void clickAddToCard(String productName) {
		driver.findElement(By.xpath("//div[contains(@class, 'product-layout') "
				+ "and .//a[text()='" + productName +"']]//button[.//span[text()='Add to Cart']]")).click();
		
		WaitUtils.waitForJS(driver);
	}


public void writeInputSearch (String itemName) { //i search laukeli irasys reiskme
	inputSearch.sendKeys(itemName);
}

public void clickButtonSearch () {
	buttonSearch.click();
}
}
