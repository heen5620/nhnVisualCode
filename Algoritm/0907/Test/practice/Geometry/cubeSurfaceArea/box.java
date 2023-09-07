package practice.Geometry.cubeSurfaceArea;

/*
 * 직육면체 겉넓이 함수 구현
 */

public class box {

    int length;

    public box(int length) {
        if (length <= 0)
            throw new IllegalArgumentException("0 이상의 수가 와야합니다.");
        this.length = length;
    }

    public int box(int length) {
        return (length * length) * 6;
    }

    public int getLength() {
        return length;
    }

}