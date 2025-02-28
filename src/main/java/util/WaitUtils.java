package util;

import java.util.function.Function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
	
	//metodas kuris tikrina ar viskas uzsiloadine page'e, issikvieciam main klaseje
	
	public static void waitForJS(WebDriver driver) {
		new WebDriverWait(driver, 5).until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
	return ((Long)((JavascriptExecutor)driver).executeScript("return jQuery.active") == 0);
}
});
	}
}