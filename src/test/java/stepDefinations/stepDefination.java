package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.pageHomePage;
import resources.base;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination extends base{

	@Given("^Initialize the browser$")
	public void initialize_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver =initializeDriver();
	    
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@Given("^Click on Login link on home page to land on secure sign in page$")
	public void click_on_Login_link_on_home_page_to_land_on_secure_sign_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l=new LandingPage(driver);
		if (l.getPopupSize()>0)
		{
			l.getPopup().click();
		}
		LoginPage lp=l.getLogin(); //driver.findElement(By.css()
	}
	
	 @When("^User enters (.+) and (.+) and logs in$")
	    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		 LoginPage lp= new LoginPage(driver);
			lp.getEmail().sendKeys(username);
			lp.getPassword().sendKeys(password);

			
			
			lp.getLogin().click();
	    }



	@Then("^Verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pageHomePage p = new pageHomePage(driver);
		Assert.assertTrue(p.getSearchBox().isDisplayed());
		
		
	    
	}
	@And("^Close all browsers$")
    public void close_all_browsers() throws Throwable {
        driver.close();
    }


}