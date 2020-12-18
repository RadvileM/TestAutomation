package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import BaseTest.BaseTest;
import page.MainPage;

public class TestCart extends BaseTest {

	private MainPage mainPage = new MainPage(driver); //susikuriam mainPAge objekta, paveldim visus metodus is ten
	
	
	@Test
	public void testCart() {
	mainPage.clickLinkDesktops();
	mainPage.clickLinkAllDesktops();
	
	mainPage.clickAddToCard("iPhone");
	mainPage.clickAddToCard("MacBook");
	mainPage.clickAddToCard("Sony VAIO");
	
	
	//paimam teksta
	String actualCartText = mainPage.buttonCart.getText();
	String expectedCartText = "3 item(s)";
	assertTrue("The message is not as expected ", actualCartText.contains(expectedCartText));
	}

}
