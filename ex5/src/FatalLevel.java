public class FatalLevel extends Handler {

    @Override
    public void HandleRequest(Level level) {
        if (level == Level.Fatal)
            System.out.println("SMS");
        else if (successor != null)
            successor.HandleRequest(level);
    }
}
