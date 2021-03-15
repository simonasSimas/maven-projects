package eu.academy.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Y {
    private ArrayList<X> list = new ArrayList<>();

    public void addList(X x){
        list.add(x);
    }

    public int sum(int indx){
        return list.get(indx).sum();
    }

    public List getList(){
        return list;
    }
}
