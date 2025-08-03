package SortingDemo;

public class Studentj implements Comparable<Studentj> {

    int id;
    String name;

    public Studentj(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Studentj o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return "Studentj{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
