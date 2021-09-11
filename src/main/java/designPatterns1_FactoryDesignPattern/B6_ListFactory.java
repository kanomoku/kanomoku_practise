package designPatterns1_FactoryDesignPattern;

public class B6_ListFactory extends B5_Factory {
    public B2_Link createLink(String caption, String url) {
        return new B7_ListLink(caption, url);
    }
    public B3_Tray createTray(String caption) {
        return new B8_ListTray(caption);
    }
    public B4_Page createPage(String title, String author) {
        return new B9_ListPage(title, author);
    }
}
