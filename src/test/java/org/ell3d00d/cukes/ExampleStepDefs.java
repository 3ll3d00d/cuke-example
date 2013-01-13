package org.ell3d00d.cukes;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.PendingException;

/** @author khanmat */
public class ExampleStepDefs {
    @Given("^I am testing gradle and cucumber.*$")
    public void I_am_testing_gradle_and_cucumber() throws Throwable {
        // do nothing!
    }

    @When("^I run this test$")
    public void I_run_this_test() throws Throwable {
        // still do nothing
    }

    @Then("^good thing happen$")
    public void good_thing_happen() throws Throwable {
        // and keep doing nothing!
    }

    @Then("^bad things happen$")
    public void bad_things_happen() throws Throwable {
        throw new PendingException("Oh noes!");
    }
}
