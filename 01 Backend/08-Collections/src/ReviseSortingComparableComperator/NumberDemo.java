package ReviseSortingComparableComperator;

import java.nio.file.CopyOption;

public class NumberDemo implements Comparable<NumberDemo> {
    int value;

    public NumberDemo(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(NumberDemo o) {
        return this.value - o.value;
    }

    @Override
    public String toString() {
        return "NumberDemo{" +
                "value=" + value +
                '}';
    }
}
