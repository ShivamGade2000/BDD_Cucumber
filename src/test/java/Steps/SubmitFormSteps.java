package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubmitFormSteps {

    @Given("user in at signup pager")
    public void user_in_at_signup_pager() {
        System.out.println("user at signup page ");
    }

    @When("user enters {string} inside form")
    public void user_enters_inside_form(String name) {
        System.out.println("Enter name " + name);
    }

    @When("user enters age as {int}")
    public void user_enters_age_as(Integer age) {
        System.out.println("Enter age " + age);
    }

    @When("user confirms gender as {string}")
    public void user_confirms_gender_as(String gender) {
        System.out.println("Enter gender " + gender);
    }

    @Then("user gets created")
    public void user_gets_created() {
        System.out.println("user created");
    }
}
