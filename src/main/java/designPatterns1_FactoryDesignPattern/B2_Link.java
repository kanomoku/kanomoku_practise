package designPatterns1_FactoryDesignPattern;

public abstract class B2_Link extends B1_Item {
    protected String url;
    public B2_Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
