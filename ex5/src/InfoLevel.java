public class InfoLevel extends Handler {

    @Override
    public void HandleRequest(Level level) {
        if (level == Level.Info)
            System.out.println("print");
        else if (successor != null)
            successor.HandleRequest(level);
    }

}
