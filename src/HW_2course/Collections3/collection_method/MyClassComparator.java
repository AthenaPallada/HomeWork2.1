package HW_2course.Collections3.collection_method;

import java.util.Comparator;

public class MyClassComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        return o1.toString().compareTo(o2.toString());
    }
}
