package Q2;

public class ZooAnimal implements Comparable <ZooAnimal> {
    public final String name;
    public final String species;

    public ZooAnimal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public int compareTo (ZooAnimal other) {
        int result = this.name.compareTo(other.name);
        if (result != 0) {
            return result;
        }
        return this.species.compareTo(other.species);
    }
}
