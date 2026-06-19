package Steps;

import LibraryFiles.DriverFactory;
import PageClasses.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SwagLabProductsSteps {

    SwagLabHomePage home = new SwagLabHomePage(DriverFactory.driver);
    SwagLabYourCartPage yourCart = new SwagLabYourCartPage(DriverFactory.driver);
    SwagLabCheckoutYourInfoPage yourInfo = new SwagLabCheckoutYourInfoPage(DriverFactory.driver);
    SwagLabCheckoutOverviewPage checkoutOverview = new SwagLabCheckoutOverviewPage(DriverFactory.driver);
    SwagLabCheckoutCompletePage  checkoutComplete = new SwagLabCheckoutCompletePage(DriverFactory.driver);

    @When("wait for {int} seconds")
    public void wait_for_seconds(Integer timeInSec) throws InterruptedException {
        Thread.sleep(timeInSec*1000);

    }

    @Then("user can see {int} products on home page")
    public void user_can_see_products_on_home_page(Integer expProductCount) {

        int actProductCount = home.getProductCount();
        Assert.assertEquals(actProductCount,expProductCount, "Product count missmatch");
    }

    @Then("price of the SauceLabBackPack product should {double}")
    public void price_of_the_sauce_lab_back_pack_product_should(Double expProductPrice)
    {
        double actProductPrice = home.getBackPackProductPrice();
        Assert.assertEquals(actProductPrice,expProductPrice,"act & exp Product price mismatch");
    }

    @Then("total price of the products should {double}")
    public void total_price_of_the_products_should(Double expTotalPrice)
    {
        double actTotalPrice = home.getAllProductsTotalPrice();
        Assert.assertEquals(actTotalPrice,expTotalPrice,"Total price mismatch");
    }

    @When("user click on backpack products add to cart btn")
    public void user_click_on_backpack_products_add_to_cart_btn()
    {
        home.clickOnBackPackProductsAddToCartBtn();
    }

    @When("user click on cartlink")
    public void user_click_on_cartlink()
    {
        home.clickOnCartLink();
    }

    @When("user click on checkout button")
    public void user_click_on_checkout_button()
    {
        yourCart.clickOnCheckoutButton();
    }

    @When("user enter FN as {string}")
    public void user_enter_fn_as(String firstname)
    {
        yourInfo.enterFN(firstname);
    }

    @When("user enter LN as {string}")
    public void user_enter_ln_as(String lastname)
    {
        yourInfo.enterLN(lastname);
    }

    @When("user enter zip code as {string}")
    public void user_enter_zip_code_as(String zipcode)
    {
        yourInfo.enterZipCode(zipcode);
    }

    @When("user click on continue button")
    public void user_click_on_continue_button()
    {
        yourInfo.clickOnContinueBtn();
    }

    @When("user click on Finish button")
    public void user_click_on_finish_button()
    {
        checkoutOverview.clickOnFinishButton();
    }

    @Then("order success message should be visible with message {string}")
    public void order_success_message_should_be_visible_with_message(String expMsg)
    {
        String actMsg = checkoutComplete.getOrderPlaceMsg();
        Assert.assertEquals(actMsg, expMsg, "order place msg mismatched");
    }

}
