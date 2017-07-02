package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by User on 02/07/2017.
 */
public class LoginWithScenario {


    @Given("^I navigate to loin page$")
    public void iNavigateToLoinPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("----------");
    }

    @And("^I  enter correct ([^\"]*) and ([^\"]*)$")
    public void iEnterCorrectUsernameAndPassword(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user name is:  "+username);
        System.out.println("password is :  "+password);
    }
    @And("^I hit to login$")
    public void iHitToLogin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("----------");
    }
    @Then("^I should be able to login to the site$")
    public void iShouldBeAbleToLoginToTheSite() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("----------");
    }
}
