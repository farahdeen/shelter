import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,features = ".", tags = {"@testing-donation"},plugin= {"pretty","html:test-out"})
public class Runtest {
}
