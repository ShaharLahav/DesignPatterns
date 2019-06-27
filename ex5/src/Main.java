public class Main {

    public static void main(String[] args) {

        Handler h1 = new InfoLevel();
        Handler h2 = new ErrorLevel();
        Handler h3 = new FatalLevel();
        h1.SetSuccessor(h2);
        h2.SetSuccessor(h3);

        Level[] requests = {Level.Error, Level.Info, Level.Error, Level.Fatal, Level.Info, Level.Info, Level.Error};

        for (Level l : requests)
            h1.HandleRequest(l);


    }
}
