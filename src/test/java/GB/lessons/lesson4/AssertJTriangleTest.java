package GB.lessons.lesson4;

import GB.lessons.lesson4.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AssertJTriangleTest
{
    @Test
    void egyptTriangleThenSuccessPerimeterTest() {
        Triangle triangle = new Triangle(3, 4, 5);
        int actualResult = triangle.calculatePerimeter();
        assertEquals(12, actualResult);
    }
}
