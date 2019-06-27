public class Leaf implements Summable {
    private int value;

    public Leaf(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @java.lang.Override
    public int getSum() {
        return value;
    }
}

