package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverFactory;

import java.net.MalformedURLException;

public class Hooks {
    DriverFactory df = new DriverFactory();
    @Before
    public void BeforeSteps() throws MalformedURLException {

        df.getSetup_android();
    }
    @After
    public void AfterSteps() throws Exception {
        df.tearDown();

    }
}
