package org.ell3d00d.cukes;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "classpath:", glue = "classpath:")
public class CukeRunner {

}
