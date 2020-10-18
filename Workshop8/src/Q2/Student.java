package Q2;

import java.util.Arrays;

public class Student implements Comparable <Student> {
    public final String name;
    public final int number;

    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public int compareTo (Student other) {
        int result = this.name.compareTo(other.name);
        if (result != 0) {
            return result;
        }
        return this.number - other.number;
    }

    public String toString() {
        return String.format("(%s, %d)", name, number);
    }

    public static void main(String[] args) {
        Student[] students = new Student[] {
                new Student("Alice", 753285),
                new Student("Charlie", 913571),
                new Student("Bob", 832572),
                new Student("Bob", 632564)
        };
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }

}
