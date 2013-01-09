package org.ell3d00d.cukes;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format={"pretty", "html:target/cucumber"}, features = "classpath:", glue = "classpath:")
public class Runner {

}
