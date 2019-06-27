import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Context context;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1 or 2");
        System.out.println("1 - sort");
        System.out.println("2 - multiply2");
        char c = scan.next().charAt(0);


        if (c == '1')
            context = new Context(new ArraySorter());
        else if (c == '2')
            context = new Context(new ArrayMultiply2());
        else
            return;

        for (int i = 0; i < 20; i++)
            context.add((int)(Math.random() * 50 + 1));

        System.out.println("before");
        context.print();
        context.mathInterface();
        System.out.println("after");
        context.print();

    }
}
