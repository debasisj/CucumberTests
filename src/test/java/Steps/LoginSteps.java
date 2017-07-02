package Steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.Arrays;

/**
 * Created by User on 01/07/2017.
 */
public class LoginSteps extends BaseUtil {

    private BaseUtil base;

    public LoginSteps(BaseUtil base) {
        this.base = base;
    }

    @Given("^I have navigated to loin page$")
    public void iHaveNavigatedToLoinPage() throws Throwable {
        System.out.println("*************************");
        System.out.println(base.stepInfo);
        System.out.println("*************************");
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Navigated\n" );
    }

/*    @And("^I have entered user as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iHaveEnteredUserAsAndPasswordAs(String user, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User  Name as " + user + "Paassord as: " + password);
    }*/

    @And("^I have entered user and password$")
    public void iHaveEnteredUserAndPassword(DataTable table) throws Throwable {
        System.out.println(table.raw().get(1).get(0));
        System.out.println(table.raw().get(1).get(1));
    }

    @And("^I hit login$")
    public void iHitLogin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hit login\n");
    }

    @Then("^I should be able to login$")
    public void iShouldBeAbleToLogin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Loged in");
    }

}
