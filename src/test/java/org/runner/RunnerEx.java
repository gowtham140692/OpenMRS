package org.runner;

import org.junit.runner.RunWith;

import com.OpenMrs.Base_Class1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\open_mrs.feature",glue = "com.stepdef",monochrome = true,dryRun = false)
public class RunnerEx extends Base_Class1 {

}
