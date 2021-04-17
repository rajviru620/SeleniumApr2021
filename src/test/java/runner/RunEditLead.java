package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src/test/java/features/TC003_EditLead.feature",
glue ="steps",

monochrome = true,
dryRun=false,


publish = true
)
public class RunEditLead extends AbstractTestNGCucumberTests{

}
