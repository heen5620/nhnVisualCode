import java.util.*;

public class Department<E extends Comparable<E>> implements Iterable<E> {
    private int departmentNo;
    private String departmentName;

    List<E> list = new ArrayList<>();

    public Department(int no, String name) {
        this.departmentNo = no;
        this.departmentName = name;
    }

    public void add(E s) {
        list.add(s);
    }

    public int getDepartmetnNo() {
        return this.departmentNo;
    }

    public String getName() {
        return this.departmentName;
    }

    public Iterator<E> iterator() {
        return this.list.iterator();
    }

    public List<E> getList() {
        return list;
    }

    public void sort() {
        Collections.sort(this.list);
    }

    public void sort(Comparator<E> compare) {
        Collections.sort(this.list, compare);
    }

}
