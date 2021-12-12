package GB.lessons.lesson4;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Triangle {

    private int a;
    private int b;
    private int c;
    private Colour colour = Colour.WHITE;


    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int calculatePerimeter() {
        checkSidesArePositive();
        checkValid();
        return a + b + c;

    }

    private void checkSidesArePositive() {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("The sides must be positive");
        }
    }

    private void checkValid() {
        long max = Math.max(Math.max(a, b), c);
        if (max >= (a + b + c - max)) {
            throw new IllegalArgumentException("The any two sides must be greater than other side");
        }
    }

    public double calcArea() {
        double halfPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(halfPerimeter*(halfPerimeter-a)*(halfPerimeter-b)*(halfPerimeter-c));

    }

}
