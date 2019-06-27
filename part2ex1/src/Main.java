import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 11, 1, 6, 14, 14, 11};
        System.out.println(Arrays.stream(arr).reduce(0, (left, right) -> left ^ right));
    }
}
