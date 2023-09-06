public class Test {
    public static void main(String[] args) {

        Department<Student> department = new Department<>(1, "computer");
        Department<Professor> proepartment = new Department<>(2, "computer");

        department.add(new Student(3, "json", 22));
        department.add(new Student(1, "Celine", 21));
        department.add(new Student(2, "Jame", 23));
        department.add(new Student(4, "Hyun", 25));

        proepartment.add(new Professor(4, "김영심", 67));
        proepartment.add(new Professor(1, "김영식", 60));
        proepartment.add(new Professor(3, "이범식", 47));
        proepartment.add(new Professor(2, "신영숙", 52));

        department.sort();
        printStudentInformation(department);
        System.out.println();
        proepartment.sort();
        printproInformation(proepartment);
    }

    public static void printStudentInformation(Department<Student> department) {
        for (Student s : department) {
            System.out.println(s);
        }
    }

    public static void printproInformation(Department<Professor> proepartment) {
        for (Professor f : proepartment) {
            System.out.println(f);
        }
    }

}
