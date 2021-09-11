package designPatterns1_FactoryDesignPattern;
import java.util.ArrayList;

public abstract class B3_Tray extends B1_Item {
    protected ArrayList tray = new ArrayList();
    public B3_Tray(String caption) {
        super(caption);
    }
    public void add(B1_Item item) {
        tray.add(item);
    }
}
