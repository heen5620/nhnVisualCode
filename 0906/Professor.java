public class Professor implements Comparable<Professor> {
    private int professorNo;
    private String name;
    private int age;

    public Professor(int professorNo, String name, int age) {
        this.professorNo = professorNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Professor student) {
        return student.getprofessorNo() - getprofessorNo();
    }

    public int getprofessorNo() {
        return this.professorNo;
    }

    public int getAge() {
        return this.age;
    }

    public void setprofessorNo(int value) {
        this.professorNo = value;
    }

    @Override
    public String toString() {
        return this.professorNo + "," + this.name + "," + this.age;
    }
}