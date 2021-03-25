package ru.powertech.ylukomoria.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.powertech.ylukomoria.utils.EnvironmentInfo;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public abstract class BaseWebTest {

    public static final String HTTPS_YLUKOMORIA_RU = "https://ylukomoria.ru";
    public WebDriver driver;
    public WebDriverWait wait15second;

    @BeforeEach
    public void baseTestBeforeAll() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--whitelisted-ips 0.0.0.0")
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        options.addArguments("--window-size=800,600");
        driver = new ChromeDriver(options);
        EnvironmentInfo.setAllureEnvironment(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        wait15second = new WebDriverWait(driver, 15);
        driver.get(HTTPS_YLUKOMORIA_RU+"/o-nas.html");
    }


    @AfterEach
    public void baseTestAfterAll() {driver.quit();}


}
