package ksuryawa.pages;


import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

/**
 * @author Kapil Suryawanshi
 * 23/07/2022
 */
public class SwagLabsHomePage extends UIInteractionSteps {

	private static final By pageTitle = By.xpath("//*[@class='title']");

	@Step("I am on the SwagLabs home page")
	public String getPageTitle() {
		return $(pageTitle).getText();
	}
}