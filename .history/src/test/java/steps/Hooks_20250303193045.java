package steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import pages.BasePage;

public class Hooks extends BasePage {

    public Hooks() {
        super(driver);
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.log("Scenario failing, please refer to the image attached to this report");
        }
    }

}
