package Steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Inventory;
import pom.LoginVendor;
import utils.Utilities;

import java.util.List;

public class StepsInventorySection {
    LoginVendor objLogin = new LoginVendor();
    Inventory objInventory = new Inventory();
    @And("the user login into the vendor with Admin credentials")
    public void theUserLoginIntoTheVendorWithAdminCredentials(DataTable table) {
        List<List<String>> data = table.asLists(String.class);
        System.out.print(data.get(1).get(0));
        System.out.print(data.get(1).get(1));
        objLogin.fillLogin(data.get(1).get(0), data.get(1).get(1));
        objLogin.btnlogInVendor();
    }

    @When("the user clicks on the inventory icon")
    public void theUserClicksOnTheInventoryIcon() {
        objInventory.btnInventory();
    }

    @Then("the user has access to the inventory section")
    public void theUserHasAccessToTheInventorySection() {
        objInventory.chckMessage("Inventory");
    }

    @When("the user clicks on the ADD PRODUCT button")
    public void theUserClicksOnTheADDPRODUCTButton() {
        objInventory.btnAddProduct();
    }

    @Then("the Add Product form is displayed")
    public void theAddProductFormIsDisplayed() {
    }

    @When("the user clicks on the ADD BRAND button")
    public void theUserClicksOnTheADDBRANDButton() {
        objInventory.btnAddBrand();
    }

    @Then("the Add Brand form is displayed")
    public void theAddBrandFormIsDisplayed() {
    }

    @After
    public void afterScenario() {
        Utilities.closeExplorer(); Utilities.closeProcess();
    }

    @And("click on the Submit button")
    public void clickOnTheSubmitButton() {objInventory.btnAddProductSubmit();
    }
}
