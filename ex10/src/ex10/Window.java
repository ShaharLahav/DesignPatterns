package ex10;

public interface Window {
    void assemble();
}

class BasicWindow implements Window {

    @Override
    public void assemble() {
        System.out.println("Assembled Window");
    }
}

class WindowDecorator implements Window {
    protected Window window;

    public WindowDecorator(Window window) {
        this.window = window;
    }

    @Override
    public void assemble() {
        this.window.assemble();
    }
}

class ThreeDimensionWindowDecorator extends WindowDecorator {

    public ThreeDimensionWindowDecorator(Window window) {
        super(window);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("with three dimention light");
    }
}

class ColourfulBorderWindowDecorator extends WindowDecorator {

    public ColourfulBorderWindowDecorator(Window window) {
        super(window);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("with colourful border");
    }
}

class PartialTransperentWindowDecorator extends WindowDecorator {

    public PartialTransperentWindowDecorator(Window window) {
        super(window);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("with partial transperent");
    }
}

class ShadowingWindowDecorator extends WindowDecorator {

    public ShadowingWindowDecorator(Window window) {
        super(window);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("with Shadowing");
    }
}

class BlinkingBackgroundWindowDecorator extends WindowDecorator {

    public BlinkingBackgroundWindowDecorator(Window window) {
        super(window);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("with blinking background");
    }
}