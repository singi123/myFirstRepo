package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addition {
	
	@Given("I have a calculator")
	public void i_have_a_calculator() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("i am having calculatior");
	   
	}

	@When("I add {int} and {int}")
	public void i_add_and(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
		int total;
		total = int1+int2;
	   
	}

	@Then("the result should be {int}")
	public void the_result_should_be(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
