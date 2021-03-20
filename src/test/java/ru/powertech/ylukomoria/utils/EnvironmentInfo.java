package ru.powertech.ylukomoria.utils;

import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;

public class EnvironmentInfo {
   public static void setAllureEnvironment(WebDriver driver) {
       Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
       allureEnvironmentWriter(
                ImmutableMap.<String, String>builder()
                        .put("Browser", cap.getBrowserName())
                        .put("Browser.Version", cap.getVersion())
                        .put("URL", driver.getCurrentUrl())
                        .build());
    }
}
