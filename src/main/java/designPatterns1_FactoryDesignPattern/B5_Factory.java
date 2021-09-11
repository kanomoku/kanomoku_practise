package designPatterns1_FactoryDesignPattern;

public abstract class B5_Factory {
    public static B5_Factory getFactory(String classname) {
        B5_Factory factory = null;
        try {
            factory = (B5_Factory)Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("没有找到 " + classname + "类。");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
    public abstract B2_Link createLink(String caption, String url);
    public abstract B3_Tray createTray(String caption);
    public abstract B4_Page createPage(String title, String author);
}
