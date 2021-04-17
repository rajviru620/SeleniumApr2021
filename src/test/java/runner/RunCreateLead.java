package runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src/test/java/features/TC002_CreateLead.feature",
glue ="steps",

monochrome = true,
dryRun=false,

plugin= {"pretty","html:target/MyReports/report.html",
		"json:target/MyReports/report.json",
		"junit:target/MyReports/report.xml"},
publish = true
)

public class RunCreateLead extends AbstractTestNGCucumberTests {

}
