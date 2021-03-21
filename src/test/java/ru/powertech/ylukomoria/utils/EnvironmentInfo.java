package ru.powertech.ylukomoria.utils;

import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import ru.powertech.ylukomoria.base.BaseWebTest;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class EnvironmentInfo {

    public static final String STAND = "QA";

  public static void setAllureEnvironment(WebDriver driver) {

       Properties allureProperties=new Properties();
       Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
        allureProperties.put("Browser", cap.getBrowserName());
        allureProperties.put("Browser.Version", cap.getVersion());
        allureProperties.put("URL", BaseWebTest.HTTPS_YLUKOMORIA_RU);
        allureProperties.put("Stand", STAND);
      try {
          allureProperties.store(new FileOutputStream
                  ("target/allure-results/environment.properties")
                  ,"Current environment");
      } catch (IOException e) {
          e.printStackTrace();
      }

  }
}
