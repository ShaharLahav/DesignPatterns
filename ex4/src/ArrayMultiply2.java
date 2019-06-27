import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayMultiply2 extends ArrayStrategy {

    @Override
    public void mathInterface() {

        ArrayList<Integer> objects = new ArrayList<Integer>();
        for (Integer integer : this.arr) {
            int i = integer * 2;
            objects.add(i);
        }
        this.arr = (ArrayList<Integer>) objects;
    }
}
