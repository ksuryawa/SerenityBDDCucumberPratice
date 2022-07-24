package ksuryawa.pages;


import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

/**
 * @author Kapil Suryawanshi
 * 23/07/2022
 */
public class SwagLabsLoginPage extends UIInteractionSteps {

	private static final By inputUserName = By.id("user-name");
	private static final By inputPassword = By.id("password");
	private static final By buttonLogin = By.id("login-button");


	private void enterUserName(String userName)
	{
		$(inputUserName).sendKeys(userName);
	}


	private void enterPassword(String password)
	{
		$(inputPassword).sendKeys(password);
	}

	private void clickOnLoginButton()
	{
		$(buttonLogin).click();
	}

	@Step("Login to HRM with username {0} and password {1}")
	public void loginToHRM(String userName,String password)
	{
		enterUserName(userName);
		enterPassword(password);
		clickOnLoginButton();
	}

}