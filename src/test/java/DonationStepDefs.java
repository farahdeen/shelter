import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DonationStepDefs extends Basement{

    Donation callmethod = new Donation();

    @Given("landing on shelter homepage")
    public void landing_on_shelter_homepage() {
        callmethod.shelter_home_page();

    }



    @When("click england")
    public void click_england() {

    }


    @Then("verify the page")
    public void verify_the_page() {

    }


    @When("i click donate")
    public void i_click_donate() {
callmethod.click_donate_method_in_homapage();
    }


    @Then("verify donation page")
    public void verify_donation_page() {
callmethod.verify_donation_page_method();
    }


    @Then("click donate once")
    public void click_donate_once() {
callmethod.click_donate_once_method();
    }


    @Then("click {int} pound")
    public void click_pound(Integer int1)  {
callmethod.click_amount_method();

    }


    @Then("click donate")
    public void click_donate() {
callmethod.donate_button_method_in_doantion_page();
    }


    @Then("verify the navigation of customer detail page")
    public void verify_the_navigation_of_customer_detail_page() {
callmethod.verify_customer_detail_page_method();
    }

    @Then("enter email address in the text box {string}")
    public void enter_email_address_in_the_text_box(String string) {
callmethod.enter_email_address_method();
    }

    @Then("select title mr")
    public void select_title_mr() {
callmethod.choose_title_method();
    }



    @Then("enter first name {string}")
    public void enter_first_name(String string) {

    }


    @Then("enter second name {string}")
    public void enter_second_name(String string) {

    }

    @Then("enter mobile number\"number\"")
    public void enter_mobile_number_number() {

    }


    @Then("enter 1st address {string}")
    public void enter_1st_address(String string) {

    }


    @Then("enter city {string}")
    public void enter_city(String string) {

    }


    @Then("enter postcode {string}")
    public void enter_postcode(String string) {

    }


    @Then("select united kingdom from drop box")
    public void select_united_kingdom_from_drop_box() {

    }


    @Then("select no in all option for updates")
    public void select_no_in_all_option_for_updates() {
callmethod.stay_touch_choice_method();
    }


    @Then("click gift aid option to reclaim tax")
    public void click_gift_aid_option_to_reclaim_tax() {

    }


    @Then("click paypal option for payments")
    public void click_paypal_option_for_payments() {

    }


    @Then("verify popup paypal redirect link")
    public void verify_popup_paypal_redirect_link() {

    }


    @Then("click paypal link")
    public void click_paypal_link() {

    }

}
