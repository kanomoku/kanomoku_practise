package designPatterns1_FactoryDesignPattern;

public class B7_ListLink extends B2_Link {
    public B7_ListLink(String caption, String url) {
        super(caption, url);
    }
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
