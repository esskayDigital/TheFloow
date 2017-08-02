import gherkin.lexer.Fi;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.MobileCapabilityType.APP;
import static io.appium.java_client.remote.MobileCapabilityType.DEVICE_NAME;
import static io.appium.java_client.remote.MobileCapabilityType.PLATFORM_NAME;

/**
 * Created by shanekelly on 01/08/2017.
 */
public class AppiumDriverFactory {

    public static AndroidDriver getAndroidDriver(AppiumDriverLocalService service) {
        File appDir = new File("src/test/resources/FloowApp/");
        File app = new File(appDir, "929da60273.apk");
        DesiredCapabilities desiredCapabilities = DesiredCapabilities.android();
        desiredCapabilities.setCapability(DEVICE_NAME, "Android Emulator");
        desiredCapabilities.setCapability(PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(APP, app.getAbsolutePath());
        desiredCapabilities.setCapability("avd", "test");
        desiredCapabilities.setCapability("automationName", "UIAutomator2");
        desiredCapabilities.setCapability("bundleId", "com.thefloow.enterprise.ownbrand");
        AndroidDriver androidDriver = new AndroidDriver(service.getUrl(), desiredCapabilities);
        androidDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return androidDriver;
    }

    public static AppiumDriverLocalService appiumDriverLocalService () {
        AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
        service.start();
        return service;
    }
}
