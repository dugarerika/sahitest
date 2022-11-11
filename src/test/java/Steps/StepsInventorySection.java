package Steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import pom.LoginVendor;
import java.util.List;

public class StepsInventorySection {
    LoginVendor objLogin = new LoginVendor();
    @Given("the user login into the vendor with Admin credentials")
    public void theUserLoginIntoTheVendorWithAdminCredentials(DataTable table) {
        List<List<String>> data = table.asLists(String.class);
        System.out.print(data.get(1).get(0));
        System.out.print(data.get(1).get(1));
        if(data.get(1).get(0) == null) objLogin.fillLogin("", data.get(1).get(1));
        else if (data.get(1).get(1) == null)  objLogin.fillLogin(data.get(1).get(0), "");
        else objLogin.fillLogin(data.get(1).get(0), data.get(1).get(1));
    }

}
