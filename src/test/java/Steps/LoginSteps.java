package Steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("open browser")
    public void open_browser() {
        System.out.println("browser opened");
    }

    @When("user enter username")
    public void user_enter_username() {
        System.out.println("username entered");
    }

    @When("user enter password")
    public void user_enter_password() {
        System.out.println("password entered");
    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        System.out.println("clicked on login button");
    }

    @Then("homepage should be visible")
    public void homepage_should_be_visible() {
        System.out.println("homepage is open");
    }

    @When("user enter wrong password")
    public void user_enter_wrong_password() {
        System.out.println("wrong password entered");
    }

    @Then("error msg should be visible")
    public void error_msg_should_be_visible() {
        System.out.println("error msg is visible");
    }

    @When("user enter username as {string}")
    public void user_enter_username_as(String un) {
        System.out.println("username entered: " + un);
    }

    @When("user enter password as {string}")
    public void user_enter_password_as(String string) {
        System.out.println("password entered: " + string);
    }

    @Then("homepage should be visible as {string} logo text")
    public void homepage_should_be_visible_as_logo_text(String string) {
        System.out.println("homepage is visible " + string);
    }

//    @Given("open browser")
//    public void m1(){
//        System.out.println("code to open browser");
//    }
//
//    @When("user enter username")
//    public void m2(){
//        System.out.println("enter username");
//    }

}
