package com.voya.sample;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.voya.studtestcases.StudentTest;
import com.voya.testcases.CalculatorTest;



@RunWith(JUnitPlatform.class) //junit4
//@RunWith(Suite.class)
@SuiteClasses({CalculatorTest.class,StudentTest.class})
@SelectPackages({"com.voya.testcases"})
//@SelectClasses({CalculatorTest.class})
//@IncludePackages({"com.voya.testcases.trial"})
//@ExcludePackages({"com.voya.testcases.greet"})
//@IncludeTags({"first","simple","negative"})
//@ExcludeTags({"first"})
public class AllTests {

}
