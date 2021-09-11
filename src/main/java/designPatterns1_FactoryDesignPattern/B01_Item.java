package designPatterns1_FactoryDesignPattern;

public abstract class B01_Item {
    protected String caption;
    public B01_Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHTML();
}
