package com.example.Login.Page.Automation.Dockerized.tests;

import com.example.Login.Page.Automation.Dockerized.pageObjectMethod.LoginPageMethod;
import com.example.Login.Page.Automation.Dockerized.setup.AutomatedSetup;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LoginPageTests {

    @Autowired
    private AutomatedSetup automatedSetup;

    private static final String URL = "https://www.saucedemo.com/";

    @ParameterizedTest
    @ValueSource(strings = {"chrome", "firefox", "edge"})
    void givenDifferentBrowser_whenValidUserNamePassword_thenHomePageDisplay(String browserType) {
        automatedSetup.setupDriver(browserType);

        // Retrieve the driver and wait instances
        WebDriver driver = automatedSetup.getDriver();
        WebDriverWait wait = automatedSetup.getWait();

        driver.get(URL);
        LoginPageMethod loginPage = new LoginPageMethod(driver, wait);
        loginPage.validUserNamePassword("standard_user", "secret_sauce");

        // Keep the page open for 30 seconds to record interactions
        try {
            Thread.sleep(30000); // 30 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
