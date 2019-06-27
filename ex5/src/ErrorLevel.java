public class ErrorLevel extends Handler {

    @Override
    public void HandleRequest(Level level) {
        if (level == Level.Error)
            System.out.println("Print + file");
        else if (successor != null)
            successor.HandleRequest(level);
    }

}
