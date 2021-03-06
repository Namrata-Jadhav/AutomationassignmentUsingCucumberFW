package StepDefs;

import Utils.TestContext;
import io.cucumber.java.*;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

@Log4j2
public class HooksDefs{
    Scenario scenario;
    TestContext testContext;

    public HooksDefs(TestContext testContext){
        this.testContext=testContext;
    }

    @Before
    public void setUp(Scenario scenario) {

        this.scenario = scenario;
    }

   @After
    public void cleanUp() {
        if (!(testContext.getDriver() == null)) {
          testContext.getDriver().quit();
            log.debug("browser quited");
       }
    }

    @BeforeStep
    public void beforeEachStep() {

        scenario.log("Executed before step");
    }

    @AfterStep
    public void afterEachStep() {
        if (!(testContext.getDriver() == null)) {
            TakesScreenshot scrnShot = (TakesScreenshot) testContext.getDriver();
            byte[] data = scrnShot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", "Failed step names:" + scenario.getName());
            scenario.log("Executed after step");
        }
        scenario.log("Executed after step");
        log.debug("Each step hook is executed, screen shot is taken");
    }

}
