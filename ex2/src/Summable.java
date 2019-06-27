public interface Summable {
    int getSum();
    default boolean isEvem() {return getSum()%2 == 0;}
}
