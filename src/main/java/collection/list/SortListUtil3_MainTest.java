package collection.list;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SortListUtil3_MainTest {
    public static void main(String[] args) throws ParseException {
        List<SortListUtil2_Student_No_Implements_Comparable> userInfos = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        SortListUtil2_Student_No_Implements_Comparable userInfo = new SortListUtil2_Student_No_Implements_Comparable();
        userInfo.setUserId(2L);
        userInfo.setUserName("b");
        userInfo.setAge(10);
        userInfo.setBirthday(format.parse("2000-10-01"));
        userInfos.add(userInfo);

        userInfo = new SortListUtil2_Student_No_Implements_Comparable();
        userInfo.setUserId(1L);
        userInfo.setUserName("c");
        userInfo.setAge(30);
        userInfo.setBirthday(format.parse("1980-10-01"));
        userInfos.add(userInfo);

        userInfo = new SortListUtil2_Student_No_Implements_Comparable();
        userInfo.setUserId(3L);
        userInfo.setUserName("a");
        userInfo.setAge(20);
        userInfo.setBirthday(format.parse("1990-10-01"));
        userInfos.add(userInfo);

        SortListUtil1<SortListUtil2_Student_No_Implements_Comparable> sortListUtil = new SortListUtil1<SortListUtil2_Student_No_Implements_Comparable>();

        System.out.println("==========原来的顺序==========");
        for (Iterator<SortListUtil2_Student_No_Implements_Comparable> iterator = userInfos.iterator(); iterator.hasNext(); ) {
            SortListUtil2_Student_No_Implements_Comparable userInfo1 = iterator.next();
            System.out.println(userInfo1);
        }

        System.out.println("==========按照userId排序==========");
        sortListUtil.Sort(userInfos, "getUserId", null);
        for (Iterator<SortListUtil2_Student_No_Implements_Comparable> iterator = userInfos.iterator(); iterator.hasNext(); ) {
            SortListUtil2_Student_No_Implements_Comparable userInfo1 = iterator.next();
            System.out.println(userInfo1);
        }

        System.out.println("==========按照userName倒序排序==========");
        sortListUtil.Sort(userInfos, "getUserName", "desc");
        for (Iterator<SortListUtil2_Student_No_Implements_Comparable> iterator = userInfos.iterator(); iterator.hasNext(); ) {
            SortListUtil2_Student_No_Implements_Comparable userInfo1 = iterator.next();
            System.out.println(userInfo1);
        }

        //这里按照日期排序是默认按照星期进行排序，因此我们需要对返回的日期格式进行手动格式化成yyyy-MM-dd类型
        System.out.println("==========按照birthday排序==========");
        sortListUtil.Sort(userInfos, "getBirthday", null);
        for (Iterator<SortListUtil2_Student_No_Implements_Comparable> iterator = userInfos.iterator(); iterator.hasNext(); ) {
            SortListUtil2_Student_No_Implements_Comparable userInfo1 = iterator.next();
            System.out.println(userInfo1);
        }

        System.out.println("==========按照birthdayStr排序==========");
        sortListUtil.Sort(userInfos, "getBirthdayStr", null);
        for (SortListUtil2_Student_No_Implements_Comparable userInfo1 : userInfos) {
            System.out.println(userInfo1);
        }

    }

}
