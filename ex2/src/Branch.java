import java.util.ArrayList;
import java.util.List;

public class Branch implements Summable {
    private int value;
    private List<Summable> summables;

    public Branch(int value) {
        this.value = value;
        summables = new ArrayList<Summable>();
    }

    public Branch(int value, List<Summable> summables) {
        this.value = value;
        this.summables = summables;
    }

    public List<Summable> getSummables() {
        return summables;
    }

    public void setSummables(List<Summable> summables) {
        this.summables = summables;
    }

    public int getValue() {
       return this.value;
    }

    public void addSummable(Summable l) {
        summables.add(l);
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int getSum() {
        int sum = this.value;
        for (Summable summable: summables
        ) {
            sum += summable.getSum();
        }

        return sum;
    }
}

