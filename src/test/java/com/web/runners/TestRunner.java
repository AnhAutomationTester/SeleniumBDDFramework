package com.web.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/web/stepdefinitions",
        plugin = {"pretty",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        }
)
public class TestRunner {
}

/*
# 1. Tạo báo cáo từ kết quả
allure generate allure-results -o allure-report --clean

# 2. Mở báo cáo
allure open allure-report
 */
