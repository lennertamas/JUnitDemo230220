import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.*;

public class CalculatorTest {

    Calculator calc = null;

    @BeforeEach
    public void Init()
    {
        calc = new Calculator();
    }

    @Test
    @Tag("Calculator test")
    @DisplayName("Sum test with positive values")
    @Severity(SeverityLevel.BLOCKER)
    public void testSum()
    {
        int actualResult = calc.Sum(4, 5);
        int expectedResult = 9;

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Severity(SeverityLevel.CRITICAL)
    @Tag("Calculator test")
    @Test
    public void testSumWithNegativeValues(){
        int actualResult = calc.Sum(-2, -3);
        int expectedResult = -4;

        Assertions.assertEquals(expectedResult, actualResult);

    }

}
