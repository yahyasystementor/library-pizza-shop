package test.tdd.calc;

import main.tdd.calc.Calc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {

    /*
        add()
        subtract()
        divide()
        multiply()

     */


    @Test
    void addShouldReturnTheSumOfTwoNumbers(){
        // AAA
        // Arrange
        Calc calc = new Calc();

        // Act
        int result = calc.add(2,2);

        // Assert
        assertEquals(4,result);
    }

    @Test
    void subtractShouldReturnTheSumOfTwoSubtractedNumbersTogether(){
        Calc calc = new Calc();

        int result = calc.subtract(3,1);

        assertEquals(2,result);
    }

    @Test
    void multiplyShouldReturnTheSumOfTwoMultipliedNumbersTogether(){
        Calc calc = new Calc();


        int result = calc.multiply(2,3);

        assertEquals(6,result);
    }


}
