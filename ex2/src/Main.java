public class Main {
    public static void main(String[] argv) {
        Branch mainBranch = new Branch(1);
        Branch secondBranch = new Branch(2);
        Leaf l3 = new Leaf(3);
        Leaf l4 = new Leaf(4);
        Leaf l5 = new Leaf(5);

        mainBranch.addSummable(l3);
        secondBranch.addSummable(l4);
        secondBranch.addSummable(l5);
        mainBranch.addSummable(secondBranch);
        System.out.println(isEven(mainBranch));
        System.out.println(isEven(secondBranch));
        System.out.println(isEven(l4));

        System.out.println(mainBranch.getSum());
    }

    static boolean isEven(Summable s) {
        return s instanceof Branch ?
                ((Branch) s).getSummables().stream().map((Main::isEven)).reduce(true, (sum1, sum2) -> sum1 && sum2) :
                s.getSum() % 2 == 0;
    }
}