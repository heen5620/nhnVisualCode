public interface Person extends Comparable<Person> {
    int getDepartmetnNo();

    String getName();

    int getAge();

    default int compareTo(Person person) {
        
    }

}
