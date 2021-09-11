package designPatterns1_FactoryDesignPattern;
import java.io.*;
import java.util.ArrayList;

public abstract class B4_Page {
    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();
    public B4_Page(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void add(B1_Item item) {
        content.add(item);
    }
    public void output() {
        try {
            String filename = title + ".html";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + " 编写完成。");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public abstract String makeHTML();
}
