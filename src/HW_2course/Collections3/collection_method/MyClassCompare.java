package HW_2course.Collections3.collection_method;

public class MyClassCompare implements Comparable<MyClassCompare> {
    private String name;

    public MyClassCompare(String name) {
        this.name = name;
    }

    // этот метод как раз и сравнивает текущий объект с другим,
    // который передается в качестве аргумента
    public int compareTo(MyClassCompare o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name;
    }
}