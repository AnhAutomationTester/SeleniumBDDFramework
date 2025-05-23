package com.web.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    private final By usernameInput = By.xpath("//input[@name=\"username\"]");
    private final By passwordInput = By.xpath("//input[@name=\"password\"]");
    private final By loginBtn = By.xpath("//button[@type=\"submit\"]");

    public void enterUsername(String user) {
        type(usernameInput, user);
    }

    public void enterPassword(String pass) {
        type(passwordInput, pass);
    }

    public void clickLogin() {
        click(loginBtn);
    }

}
