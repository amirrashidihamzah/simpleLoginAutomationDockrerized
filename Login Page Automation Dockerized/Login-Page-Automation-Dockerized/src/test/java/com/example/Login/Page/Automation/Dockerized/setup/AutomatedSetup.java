package com.example.Login.Page.Automation.Dockerized.setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Configuration;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

@Configuration
@Data
public class AutomatedSetup {

    private WebDriver driver;
    private WebDriverWait wait;

    // Factory method to create a driver based on browser type
    public void setupDriver(String browserType) {
        String gridUrl = "http://localhost:4444/wd/hub";
        try {
            switch (browserType.toLowerCase()) {
                case "chrome":
                    driver = new RemoteWebDriver(new URL(gridUrl), new ChromeOptions());
                    break;
                case "firefox":
                    driver = new RemoteWebDriver(new URL(gridUrl), new FirefoxOptions());
                    break;
                case "edge":
                    driver = new RemoteWebDriver(new URL(gridUrl), new EdgeOptions());
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported browser type: " + browserType);
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException("Invalid Selenium Grid URL", e);
        }
        Options();
    }

    private void Options(){
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
}
