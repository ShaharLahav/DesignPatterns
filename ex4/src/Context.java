public class Context {

    private ArrayStrategy arr;

    public Context(ArrayStrategy arr) {
        this.arr = arr;
    }

    public void add(int a) {
        arr.add(a);
    }

    public void print() {
        this.arr.print();
    }

    public void mathInterface() {
        this.arr.mathInterface();
    }
}