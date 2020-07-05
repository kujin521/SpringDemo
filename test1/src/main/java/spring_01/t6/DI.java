package spring_01.t6;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class DI {
    private Map map;
    private Set set;
    private List list;


    public DI(Map map, Set set, List list) {
        this.map = map;
        this.set = set;
        this.list = list;
    }

    @Override
    public String toString() {
        return "DI{" +
                "map=" + map +
                ", set=" + set +
                ", list=" + list +
                '}';
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
