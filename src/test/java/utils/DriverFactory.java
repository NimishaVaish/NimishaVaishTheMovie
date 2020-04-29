package utils;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


    public  class DriverFactory {
        public static AppiumDriver driver = null;
        public static WebDriverWait driverWait = null;


        public void getSetup_android() throws MalformedURLException {
            URL serverAddress = new URL("http://127.0.0.1:4723/wd/hub");

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "8.1");
            capabilities.setCapability("deviceName", "Samsung Galaxy S8");
            capabilities.setCapability("automationName", "Appium");
            capabilities.setCapability("appPackage","com.skydoves.themovies");
            capabilities.setCapability("appActivity","com.skydoves.themovies.view.ui.main.MainActivity");

            String userDir = System.getProperty("user.dir");
            capabilities.setCapability("app", userDir+"/src/test/java/Apps/app-release.apk");

            driver = new AndroidDriver(serverAddress, capabilities);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            System.out.println("Movie app is launched");
        }

        public void tearDown() throws Exception {
            if (driver != null)
                driver.quit();
        }
    }

