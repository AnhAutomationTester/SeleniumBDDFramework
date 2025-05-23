package com.web.stepdefinitions;

import com.web.pages.LoginPage;
import com.web.core.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    LoginPage loginPage;
    @Given("I open the application")
    public void I_open_the_application(){
        DriverManager.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage = new LoginPage();
    }

    @When("I login with username {string} and password {string}")
    public void i_login_with_credentials(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @Then("I click on the login button")
    public void I_click_on_the_login_button(){
        loginPage.clickLogin();
    }
}
