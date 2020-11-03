package Q4;


import java.awt.*;

public class Person {
    private String name;
    private Point point;
    private String householdName;

    private static Person[] people = new Person[100];
    private static int peopleCount = 0;
    
    public Person(String name, Point location, String householdName) {
        this.name = name;
        this.point = location;
        this.householdName = householdName;

        if (peopleCount < 100) {
            people[peopleCount++] = this;
        }
    }

    private double distanceTo(Point point) {
        return Math.sqrt(((this.point.x - point.x) *
                (this.point.x - point.x)) -
                ((this.point.y - point.y) *
                (this.point.y - point.y)));
    }

    private double distanceToPerson(Person person) {
        return Math.sqrt((this.point.x - person.point.x) * (this.point.x - person.point.x)
                + (this.point.y - person.point.y) * (this.point.y - person.point.y));
    }

    public Person[] peopleCloserThan(double distance) {
        int numCloser = 0;
        // Count how many people are close
        for (int i = 0; i < peopleCount; ++i) {
            if (distanceToPerson(people[i]) < distance) {
                ++numCloser;
            }
        }

        // Create an appropriately-sized array, and then fill it
        Person[] result = new Person[numCloser];
        int count = 0;
        for (int i = 0; i < peopleCount; ++i) {
            if (distanceToPerson(people[i]) < distance) {
                result[count++] = people[i];
            }
        }

        return result;
    }

    public int numCloseOutsideHousehold(double distance) {
        Person[] people = peopleCloserThan(distance);
        int count = 0;
        for (int i = 0; i < people.length; ++i) {
            // If they are not from this person's household, increment counter
            if (!people[i].householdName.equals(householdName)) {
                ++count;
            }
        }
        return count;
    }
}
