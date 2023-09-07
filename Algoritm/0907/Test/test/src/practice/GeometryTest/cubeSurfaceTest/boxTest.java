package practice.GeometryTest.cubeSurfaceTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import practice.Geometry.cubeSurfaceArea.Main;
import practice.Geometry.cubeSurfaceArea.box;

public class boxTest {

    /*
     * 1. 인자값 잘 들어오는지 테스트
     * 2. 인자값 음수면 throw던지는 테스트
     * 3. 겉넓이, 넓이 예상값, 실제값 같은지 테스트
     */

    @Test
    @DisplayName("테스트 인자값 확인")
    void test() {
        Main a = new Main(4.0);
        // a.areaBox(4.0);
        Assertions.assertEquals(4.0, a.getLength());

        // box a = new box(4.0);

        // Assertions.assertEquals(4.0, a.getLength());
    }

    @Test
    @DisplayName("인자값 음수면 던지는 테스트")
    void test2() {

        try {
            new Main(-1);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Main(-1));
    }

    @Test
    @DisplayName("넓이 예상값 테스트")
    void test3() {
        Main main = new Main(4.0);
        Assertions.assertEquals(96.0, main.areaBox(4.0));
    }

}
