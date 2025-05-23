package com.web.stepdefinitions;

import com.web.core.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
    @Before
    public void beforeScenario() {

    }

    @After
    public void afterScenario() {
        DriverManager.quitDriver();  // Đóng browser sau mỗi scenario
    }
}
