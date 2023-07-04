package calculator;

import cucumber.deps.com.thoughtworks.xstream.mapper.Mapper;

import static java.lang.Float.NaN;
import static java.lang.Math.sqrt;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public float reverse(int i) {
        return (float) 1 / i;
    }

    public float square_root(int i) {
        return (float) sqrt(i);
    }

    public float calculate(String op, int i) {
        if (op.equals("rvs")) {
            return this.reverse(i);
        } else if (op.equals("sqr")) {
            return this.square_root(i);
        } else return NaN;
    }
}