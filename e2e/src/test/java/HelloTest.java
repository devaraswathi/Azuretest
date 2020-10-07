import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("e2e-environment.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class HelloTest {

  @Test
  @Scenario("GET-hello-WHEN-we-hello-world-endpoint-is-called-EXPECT-success-AND-flag-true.yaml")
  public void checkHelloWorldTest() { }

  @Test
  @Scenario("GET-hello-WHEN-we-hello-endpoint-is-called-EXPECT-success-AND-flag-false.yaml")
  public void checkHelloExampleTest() { }

}
