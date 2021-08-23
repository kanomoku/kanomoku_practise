package collection_list;

import java.util.*;

public class List_Set_Map_Basic {


    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<String>();
        List<String> linkedList = new LinkedList<String>();
        Vector<String> vector = new Vector<String>();
        for (String data : Arrays.asList("S1", "S3", "S4", "S5", "S2", "S2")) {
            arrayList.add(data);
            linkedList.add(data);
            vector.add(data);
        }
        System.out.println("原始值 :" + arrayList);
        System.out.println("Ordering in arrayList :" + arrayList);
        System.out.println("Ordering in linkedList :" + linkedList);
        System.out.println("Ordering in vector :" + vector);
        System.out.println("···························");

        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
        for (String data : Arrays.asList("1", "E", "D", "C", "A")) {
            hashSet.add(data);
            linkedHashSet.add(data);
            treeSet.add(data);
        }
        System.out.println("原始值:" + Arrays.asList("1", "E", "D", "C", "A"));
        // 不保证有序
        System.out.println("Ordering in HashSet :" + hashSet);
        // FIFO保证安装插入顺序排序
        System.out.println("Order of element in LinkedHashSet :" + linkedHashSet);
        // 内部实现排序
        System.out.println("Order of objects in TreeSet :" + treeSet);

        Set<String> hashSet1 = new HashSet<String>();
        Set<String> linkedHashSet1 = new LinkedHashSet<String>();
        Set<String> treeSet1 = new TreeSet<String>();
        for (String data : Arrays.asList("S1", "S3", "S4", "S5", "S2", "S2")) {
            hashSet1.add(data);
            linkedHashSet1.add(data);
            treeSet1.add(data);
        }
        System.out.println("原始值:" + Arrays.asList("S1", "S3", "S4", "S5", "S2", "S2"));
        System.out.println("HashSet:" + hashSet1);
        System.out.println("LinkedHashSet:" + linkedHashSet1);
        System.out.println("TreeSet:" + treeSet1);
        System.out.println("···························");

        Hashtable ht = new Hashtable();
        ht.put(null, null);
        Map<String, String> map2 = new HashMap<String, String>();
        map2.put(null, null);

    }
}
