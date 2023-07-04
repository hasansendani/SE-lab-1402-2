package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;

    private String op;
    private int result;

    private float result2;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }


    @When("^I add the two values$")
    public void iAddTheTwoValues() {
        result = calculator.add(value1, value2);
        System.out.print(result);
    }

    @Then("^I expect the result (\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);

    }
    @Given("^Two input values , (-?\\d+) and (-?[a-z]+)$")
    public void twoInputValuesAndNew(int arg0, String arg1) {
        value1 = arg0;
        op = String.valueOf(arg1);
    }


    @When("^I op the two values$")
    public void iAddTheTwoValuesNew() {
        result2 = calculator.calculate(op, value1);
        System.out.print(result2);
    }


    @Then("^I expect this result (-?\\d*.\\d*)$")
    public void iExpectThisResultNew(float arg0) {
        System.out.print(arg0);
        Assert.assertEquals(arg0, result2, 0);

    }
}