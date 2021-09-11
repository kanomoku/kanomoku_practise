package designPatterns1_FactoryDesignPattern;

public class B10_TableFactory extends B5_Factory {
    public B2_Link createLink(String caption, String url) {
        return new B11_TableLink(caption, url);
    }
    public B3_Tray createTray(String caption) {
        return new B12_TableTray(caption);
    }
    public B4_Page createPage(String title, String author) {
        return new B13_TablePage(title, author);
    }
}
