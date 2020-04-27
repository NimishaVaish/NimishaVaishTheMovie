package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MovieP {
    WebDriver driver;
    String path;
    @Given("^The application is launched on the mobile device$")
    public void theApplicationIsLaunchedOnTheMobileDevice() throws MalformedURLException {

            path=System.getProperty("user.dir");
            DesiredCapabilities cap= new DesiredCapabilities();
            //cap.setCapability("udid","null");
            cap.setCapability("platformName","Android");
            cap.setCapability("platformVersion","8.1");
            cap.setCapability("deviceName","Samsung Galaxy S8");
            cap.setCapability("app",path+"//Apps//app-release.apk");
            //cap.setCapability("appPackage","");
            //cap.setCapability("appActivity","");
            driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            System.out.println("App is launched");
    }
        @When("^user clicks on any Movie$")
        public void clickOnMovie(){
            driver.findElement(By.xpath("//*[@text='Cars']")).click();
            System.out.println("Movie is clicked");
        }

        @Then("^verify that summary page is opened$")
        public void verifySummaryPage(){
            String summary = driver.findElement(By.xpath("//*[@text='Summary']")).getText();
            Assert.assertEquals(summary,"Summary");
            System.out.println("Summary of the Movie is displayed");
        }
}
