package practice.GeometryTest.cubeSurfaceTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import practice.Geometry.cubeSurfaceArea.box;

public class boxTest {

    @Test
    @DisplayName("boxtest")
    void test(int input) {
        box a = new box(4);

        Assertions.assertEquals(4, a.getLength());
    }
}
