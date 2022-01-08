package ir.omidashouri.app;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    public Calculator calculator;

    @BeforeEach
    public void setup() {

    }

    @Test
    public void testMultiply(){
        calculator = new Calculator();
        assertEquals(20, calculator.multiply(4,5));
    }
}