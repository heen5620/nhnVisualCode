import java.util.Comparator;

public class Compare<E> implements Comparator<Student> {

    // public interface Compare<E> extends Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getAge() - o1.getAge();
    }

    // @Override
    // public int compare(Student s1, Student s2);
}


