package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class OrderSteps {

    @Given("user should get logged in")
    public void user_should_get_logged_in() {
        System.out.println("logged in");
    }

    @When("user should be at orders page")
    public void user_should_be_at_orders_page() {
        System.out.println("at orders page");
    }

    @When("user click on current orders")
    public void user_click_on_current_orders() {
        System.out.println("click on current orders");
    }

    @Then("user should see currently placed orders")
    public void user_should_see_currently_placed_orders() {
        System.out.println("see currently placed orders");
    }

    @When("user click on previous orders")
    public void user_click_on_previous_orders() {
        System.out.println("click on previous orders");
    }

    @Then("user should see previously placed orders")
    public void user_should_see_previously_placed_orders() {
        System.out.println("see previously placed orders");
    }

    @Given("used should get logged in")
    public void used_should_get_logged_in() {
        System.out.println("logged in");
    }

    @When("user should be atg orders page")
    public void user_should_be_atg_orders_page() {
        System.out.println("at orders page");
    }

    @When("user click on cancel orders")
    public void user_click_on_cancel_orders() {
        System.out.println("click on cancel orders");
    }

    @Then("user should see canceled orders info")
    public void user_should_see_canceled_orders_info() {
        System.out.println("canceled orders visible");

        String actResult = "Hi";
        String expResult = "hello";
        Assert.assertEquals(actResult, expResult);     //classname.methodname(actgResult, expResult)
    }

}
