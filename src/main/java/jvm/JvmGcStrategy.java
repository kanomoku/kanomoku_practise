package jvm;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.List;

public class JvmGcStrategy {
    public JvmGcStrategy() {}

    public static void main(String[] args) {
        List<GarbageCollectorMXBean> l = ManagementFactory.getGarbageCollectorMXBeans();
        Iterator var3 = l.iterator();
        while (var3.hasNext()) {
            GarbageCollectorMXBean b = (GarbageCollectorMXBean)var3.next();
            System.out.println(b.getName());
        }
    }
}
