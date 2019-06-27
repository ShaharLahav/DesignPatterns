abstract public class Training {

    public abstract void changingSportswear();
    public abstract void drinkingWater();
    public abstract void exerciseFitness();
    public abstract void shower();

    public void TemplateMethod()
    {
        changingSportswear();
        drinkingWater();
        exerciseFitness();
        shower();
    }

}
