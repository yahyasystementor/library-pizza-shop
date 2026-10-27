package test;
import org.junit.jupiter.api.*;
import main.unittest.Calculator;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }


    @AfterEach
    void tearDown(){
        // tex rensa filer efter varje test case
    }




    @Disabled
    @Test
    @DisplayName("3 + 2 should return 5")
    void addShouldReturnTheSumValueOfTwoNumbers() {
        /// AAA
        // Arrange = Förberedelse
       //  Calculator calc = new Calculator();
        // Act = Själva anropet
        int result = calc.add(3,2);
        // Assert = Kontrollen
        assertEquals(5,result);

        /*
        assertTrue();
        assertFalse();
        assertNull();
        assertNotNull();

        // We dont have a user class thats why its red
        assertAll(
                () ->assertEquals("name", user.getName()),
                () -> assertEquals(25, user.getAge())
        );
  */

    }

    @Test
    @DisplayName("-3 + -2 should return -5")
    void negativeNumbersShouldBeAdded(){
        /// AAA
        // Arrange = Förberedelse
        // Calculator calc = new Calculator();
        // Act = Själva anropet
        int result = calc.add(-3,-2);
        // Assert = Kontrollen
        assertEquals(-5,result);
    }







}
