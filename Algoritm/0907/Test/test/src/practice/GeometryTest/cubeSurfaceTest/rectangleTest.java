package practice.GeometryTest.cubeSurfaceTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import practice.Geometry.cubeSurfaceArea.Main;

public class rectangleTest {

    @Test
    @DisplayName("인자값 음수면 던지는 테스트")
    void test2() {

        try {
            new Main(-1.0, -2.0);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Main(-1.0, -2.0));
    }

    @Test
    @DisplayName("넓이 예상값 테스트")
    void test3() {
        Main main = new Main(4.0, 2.0);
        Assertions.assertEquals(8.0, main.areaRectengle(4.0, 2.0));
    }
}
