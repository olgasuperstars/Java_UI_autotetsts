package GB.lessons;

import GB.lessons.lesson4.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;


public class TriangleTest
{
    @Test
    @DisplayName("Рассчитать периметр: египетский треугольник (3, 4, 5)")
    void egyptTriangleTest() {
        Triangle triangle = new Triangle(3, 4, 5);
        int actualResult = triangle.calculatePerimeter();
        assertEquals(12, actualResult);
    }


    @Test
    @DisplayName("Рассчитать площадь: египетский треугольник (3, 4, 5)")
    void areaOfEgyptTriangleTest() {
        Triangle triangle = new Triangle(3, 4, 5);
        double actualResult = triangle.calcArea();
        assertEquals(6, actualResult);
    }
    @Test
    void catchExceptionByJunitTest() {
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 1, 50)
                .calculatePerimeter());
        assertEquals("The any two sides must be greater than other side", illegalArgumentException.getMessage());
    }
}
