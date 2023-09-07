package practice.GeometryTest.cubeSurfaceTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import practice.Geometry.cubeSurfaceArea.Main;

public class cubeTest {
    @Test
    @DisplayName("인자값 음수면 던지는 테스트")
    void test2() {

        try {
            new Main(-1.0, -2.1, -2.3);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Main(-1.0, -2.1, -2.3));
    }

    @Test
    @DisplayName("넓이 예상값 테스트")
    void test3() {
        Main main = new Main(4.0, 2.0, 3.0);
        Assertions.assertEquals(52.0, main.areaCube(4.0, 2.0, 3.0));
    }

}
