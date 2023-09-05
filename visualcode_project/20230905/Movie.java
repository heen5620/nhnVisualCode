public class Movie {
    static int script; // script는 기본적으로 class에 속한다. 객체에 속하지 않고, 클래스에 속함. static을 사용했으니.
    // int acting; // 인스턴스 변수에 속한다.
    // int direction;

    static int wscript = 6;
    static int wacting = 13;
    static int wdirection = 11;

    public int movieRating(int s, int a, int d) {
        return wscript * s + wacting * wdirection + 11 * d;
    }
}
