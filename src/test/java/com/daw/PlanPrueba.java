package com.daw;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({SumaTest.class, MultiplicacionTest.class, DivisionTest.class, RestaTest.class})
public class PlanPrueba {

}
