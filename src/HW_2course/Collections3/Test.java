package HW_2course.Collections3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Grape");
        Collections.sort(fruits);
        System.out.println(fruits);
         //Collections.sort() отсортировал список строк в лексическом порядке. И это ничего не возвращает.
    }
}