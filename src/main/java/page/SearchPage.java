package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchPage extends AbstractPage{

	@FindBy (css = "#content > div:nth-child(8) > div > div > div:nth-child(2) > div.caption > h4 > a")
	private WebElement linkFirstItem;
	
	public SearchPage(WebDriver driver) {
		super(driver);
	
	}
	
	//metodas grazinantis stringa teksto reiksme
public String getTextFromLinkFirstItem() {
	return 	linkFirstItem.getText();
}
}
