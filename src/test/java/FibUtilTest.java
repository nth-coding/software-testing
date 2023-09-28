import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibUtilTest {
    @Test
    void test_tc_001() {
        assertEquals(2, Fibonacci.fibonacci(3));
    }

    @Test
    void test_tc_002() {
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    void test_tc_003() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1));
    }

    @Test
    void test_tc_004() {
        assertEquals(5, Fibonacci.fibonacci(5));
    }

    @Test
    void test_tc_005() {
        assertEquals(55, Fibonacci.fibonacci(10));
    }

    @Test
    void test_tc_006() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-2));
    }

    @Test
    void test_tc_007() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    void test_tc_008() {
        assertEquals(8, Fibonacci.fibonacci(6));
    }

    @Test
    void test_tc_009() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-6));
    }

    @Test
    void test_tc_010() {
        assertEquals(610, Fibonacci.fibonacci(15));
    }
}
