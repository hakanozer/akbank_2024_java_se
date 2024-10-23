package src.generic;

import java.util.ArrayList;

public class Action<T> implements IAction<T> {

    private ArrayList<T> ls = new ArrayList<>();

    @Override
    public boolean add(T t) {
        boolean status = true;
        for (T item : ls) {
            if (item == t) {
                status = false;
            }
        }
        if (status == true) {
            return ls.add(t);
        }
        return false;
    }

    @Override
    public T remove(int index) {
        if (ls.size() > index ) {
            return ls.remove(index);
        }
       return null;
    }

    @Override
    public ArrayList<T> list() {
        return ls;
    }
}
