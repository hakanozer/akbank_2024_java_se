package src.generic;

import java.util.ArrayList;

public interface IAction<T> {

    boolean add(T t);
    T remove(int index);
    ArrayList<T> list();

}
