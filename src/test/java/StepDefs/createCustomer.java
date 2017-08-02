package StepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by shanekelly on 01/08/2017.
 */
public class createCustomer {
    @Given("^I am creating a customer$")
    public void iAmCreatingACustomer() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I use name \"([^\"]*)\" surname \"([^\"]*)\" email \"([^\"]*)\\$")
    public void iUseFirstnameLastnameEmail(String firstname, String lastname, String email) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^new customer is created$")
    public void newCustoemrIsCreated() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I use a <CurrentCustomer>$")
    public void iUseACurrentCustomer() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^an error is received$")
    public void anErrorIsReceived() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I use name <firstname> lastname <lastname> email <email>$")
    public void iUseNameFirstnameLastnameLastnameEmailEmail() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
