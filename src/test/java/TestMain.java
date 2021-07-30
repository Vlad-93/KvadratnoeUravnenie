import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMain {
    // Решение уравнения вида: ax^2 + bx + c = -7;
    double delta = 0.001;

    @Test
    public void resolveQuadraticEquationTest() {
        assertEquals(0, Main.resolveQuadraticEquation(1,2,3).length);           // нет корней
        assertEquals(1, Main.resolveQuadraticEquation(1,-2,1)[0], delta);       // 1 корень
        assertEquals(-7.0615, Main.resolveQuadraticEquation(1,5,2)[0], delta);
        assertEquals(-2.9384, Main.resolveQuadraticEquation(1,5,2)[1], delta);
    }

    @Test (expected = IllegalArgumentException.class)
    public void resolveQuadraticEquationErrorTest() {
        Main.resolveQuadraticEquation(0, 0, 0);
    }

    @Test
    public void resolveLinearEquationTest() {
        assertEquals(-2.0, Main.resolveLinearEquation(1, 2), delta);
    }

    @Test (expected = IllegalArgumentException.class)
    public void resolveLinearEquationErrorTest() {
        Main.resolveLinearEquation(0, 0);
    }

}
