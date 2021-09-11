package designPatterns1_FactoryDesignPattern;

public abstract class B1_Item {
    protected String caption;
    public B1_Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHTML();
}
