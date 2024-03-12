package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(tags = "@jobCircularSelection or @vacancy or @apply or  @basicInfo or @address or @education or " +
        "@jobExperience or @certificate or @declaration", features = {
        "src/test/resources/Feature/TC_01_CircularList.feature",
        "src/test/resources/Feature/TC_02_PostVacancy.feature",
        "src/test/resources/Feature/TC_03_ApplyAVacancyWithoutLogin.feature",
        "src/test/resources/Feature/TC_04_BasicInfo.feature",
        "src/test/resources/Feature/TC_05_Address.feature",
        "src/test/resources/Feature/TC_06_Education.feature",
        "src/test/resources/Feature/TC_07_JobExperience.feature",
        "src/test/resources/Feature/TC_08_Certificate.feature",
        "src/test/resources/Feature/TC_09_Declaration.feature"},
        glue = {"StepDefinition"}, monochrome = true,
        dryRun = false,
        plugin = {
                "pretty", "html:build/reports/featureReport.html"
        })
@Test
public class CucumberRunner extends AbstractTestNGCucumberTests {
}