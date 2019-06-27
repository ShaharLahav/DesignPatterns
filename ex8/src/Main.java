public class Main {

    public static void main(String [] args)
    {
        Training train1 = new WaterTraining();
        train1.TemplateMethod();
        System.out.println();

        Training train2 = new StrengthTraining();
        train2.TemplateMethod();
        System.out.println();

        Training train3 = new FoodTraining();
        train3.TemplateMethod();
        System.out.println();

    }

}
