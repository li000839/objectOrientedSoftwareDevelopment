public abstract class Person implements Comparable <Person> {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        int result = name.compareTo(other.name);
        if (result != 0) {
            return result;
        } else {
            return this.age - other.age;
        }
    }
}
