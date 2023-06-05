import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @org.junit.jupiter.api.Test
    void add_withValidInput_providesValidOutput() {
        //given
        int a = 1;
        int b = 2;

        //when
        int result = calculator.add(a, b);

        //then
        assertEquals(3, result);
    }

    @org.junit.jupiter.api.Test
    void add_withNullBInput_providesValidOutput() {
        //given
        int a = 1;
        Integer b = null;

        //when
        int result = calculator.add(a, b);

        //then
        assertEquals(1, result);
    }

    @org.junit.jupiter.api.Test
    void add_withNullAInput_providesValidOutput() {
        //given
        int b = 1;
        Integer a = null;

        //when
        int result = calculator.add(a, b);

        //then
        assertEquals(1, result);
    }

    @org.junit.jupiter.api.Test
    void multiply_withValidInput_providesValidOutput() {
        //given
        int a = 2;
        int b = 3;

        //when
        int result = calculator.multiply(a, b);

        //then
        assertEquals(6, result);
    }

    @org.junit.jupiter.api.Test
    void multiply_withNullAInput_providesValidOutput() {
        //given
        Integer a = null;
        int b = 3;

        //when
        int result = calculator.multiply(a, b);

        //then
        assertEquals(0, result);
    }

    @org.junit.jupiter.api.Test
    void multiply_withNullBInput_providesValidOutput() {
        //given
        int a = 2;
        Integer b = null;

        //when
        int result = calculator.multiply(a, b);

        //then
        assertEquals(0, result);
    }

    @org.junit.jupiter.api.Test
    void divide_withValidInput_providesValidOutput() {
        //given
        int a = 9;
        int b = 3;

        //when
        int result = calculator.divide(a, b);

        //then
        assertEquals(3, result);
    }

    @org.junit.jupiter.api.Test
    void divide_withBBeingZeroInput_throwsCustomException() {
        //given
        int a = 9;
        int b = 0;

        //when
        //then
        assertThrows(CustomException.class, () -> calculator.divide(a, b));
    }
}