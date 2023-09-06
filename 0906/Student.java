public class Student implements Comparable<Student> {
    private int studentNo;
    private String name;
    private int age;

    public Student(int studentNo, String name, int age) {
        this.studentNo = studentNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student student) {
        return student.getStudentNo() - getStudentNo();
    }

    public int getStudentNo() {
        return this.studentNo;
    }

    public int getAge() {
        return this.age;
    }

    public void setStudentNo(int value) {
        this.studentNo = value;
    }

    @Override
    public String toString() {
        return this.studentNo + "," + this.name + "," + this.age;
    }
}