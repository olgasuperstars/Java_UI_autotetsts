package GB.lessons;

import GB.lessons.lesson4.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TriangleTest
{
    @Test
    void egyptTriangleThenSuccessPerimeterTest() {
        Triangle triangle = new Triangle(3, 4, 5);
        int actualResult = triangle.calculatePerimeter();
        assertEquals(12, actualResult);
    }
}
