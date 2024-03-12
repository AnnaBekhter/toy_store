package org.example;

public class Toy implements Comparable<Toy> {
    private final String id;
    private final String name;
    private int frequency;

    public Toy(String id, String name) {
        this.id = id;
        this.name = name;
        this.frequency = Randomizer.getNumber(6);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public int compareTo(Toy other) {
        return Integer.compare(this.frequency, other.frequency);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}
