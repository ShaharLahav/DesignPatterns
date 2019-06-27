import java.util.ArrayList;
import java.util.List;

abstract public class ArrayStrategy {

    protected ArrayList<Integer> arr;
    protected int countPositive;
    protected int countNegative;

    public ArrayStrategy() {
        this.arr = new ArrayList<Integer>();
    }

    public abstract void mathInterface();

    public void add(int a) {
        arr.add(a);
        if (a > 0)
            countPositive++;
        else
            countNegative++;
    }

    public void clear() {
        this.arr.clear();
        this.countNegative = 0;
        this.countPositive = 0;
    }

    public int getSize() {
        return this.arr.size();
    }

    public int getPositive() {
            return this.arr.size();
    }

    public int getNegative() {
        return this.arr.size();
    }

    public int getAverage() {
        return this.arr.stream().mapToInt(value -> value).sum() / this.arr.size();
    }

    public void print() {
        for (int number : this.arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

}