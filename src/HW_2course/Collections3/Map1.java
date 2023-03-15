package HW_2course.Collections3;

import java.util.Map;
import java.util.Objects;

public class Map1 {
    private Map<String, Integer> map;

    public Map1(Map<String, Integer> map) {
        this.map = map;
    }

    public void mapAd(String k, Integer v) {
        for (Map.Entry<String, Integer> c : map.entrySet()) {
            if (!k.equals(c.getKey()) || !(v.equals(c.getValue()))) {
                map.put(k, v);
            } else if (k.equals(c.getKey()) && v.equals(c.getValue())) {
                throw new RuntimeException("Такое значение уже есть");
            }
        }
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Map1 map1 = (Map1) o;
        return Objects.equals(map, map1.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
