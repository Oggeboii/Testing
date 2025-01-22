package org.example.triangle;

import org.example.triangle.Triangle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {
    static Stream<Arguments> pointProvider() {
        return Stream.of(
                Arguments.of(new Point(0,0), new Point(0,3), new Point(4,0)));
    }

    @Test
    @DisplayName("testTriangleDouble")
    void testTriangleDouble() {
        Triangle t = new Triangle(3,4,5);
        assertThat(t.sides).containsExactly(3.0, 4.0, 5.0);
    }
    @Test
    @DisplayName("testTriangleDoubleArray")
    void testTriangleDoubleArray() {
        double d1 = 3.0;
        double d2 = 4.0;
        double d3 = 5.0;
        double[] doubles = {d1,d2,d3};
        Triangle t = new Triangle(doubles);
        assertThat(t.sides).containsExactly(3.0, 4.0, 5.0);
    }
    @ParameterizedTest
    @MethodSource ("pointProvider")
    @DisplayName("testTrianglePoints")
    void testTrianglePoints(Point p1, Point p2, Point p3) {
        Triangle t = new Triangle(p1,p2,p3);
        assertThat(t.sides).containsExactly(3.0, 4.0, 5.0 );
    }
    @ParameterizedTest
    @MethodSource ("pointProvider")
    @DisplayName("testTrianglePointsArray")
    void testTrianglePointsArray(Point p1, Point p2, Point p3) {
        Point[] points = {p1,p2,p3};
        Triangle t = new Triangle(points);
        assertThat(t.sides).containsExactly(3.0, 4.0, 5.0 );
    }


    @Test
    @DisplayName("isEquilateral")
    void isEquilateralReturnsTrue() {
        Triangle t = new Triangle(3,3,3);
        boolean result = t.isEquilateral();
        assertThat(result).isEqualTo(true);
    }
    @Test
    @DisplayName("isNotEquilateral")
    void isEquilateralReturnsFalse() {
        Triangle t = new Triangle(1,2,3);
        boolean result = t.isEquilateral();
        assertThat(result).isEqualTo(false);
    }
    @Test
    @DisplayName("isScalene")
    void isScaleneReturnsTrue() {
        Triangle t = new Triangle(1,2,3);
        boolean result = t.isScalene();
        assertThat(result).isEqualTo(true);
    }
    @Test
    @DisplayName("isNotScalene")
    void isScaleneReturnsFalse() {
        Triangle t = new Triangle(3,3,3);
        boolean result = t.isScalene();
        assertThat(result).isEqualTo(false);
    }
    @Test
    @DisplayName("isIsosceles")
    void isIsoscelesReturnsTrue() {
        Triangle t = new Triangle(1,2,2);
        boolean result = t.isIsosceles();
        assertThat(result).isEqualTo(true);
    }
    @Test
    @DisplayName("isNotIsosceles")
    void isIsoscelesReturnsFalse() {
        Triangle t = new Triangle(1,2,3);
        boolean result = t.isIsosceles();
        assertThat(result).isEqualTo(false);
    }

}
