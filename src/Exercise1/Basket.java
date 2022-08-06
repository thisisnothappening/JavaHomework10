package Exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Basket {
    private ArrayList<String> fruitList = new ArrayList<>();

    public Collection<String> distinct() {
        return new HashSet<>(fruitList);
    }

    public void add(String fruit) {
        fruitList.add(fruit);
    }

    public boolean remove(String fruit) {
        fruitList.remove(fruit);
        return fruitList.contains(fruit);
    }

    public boolean find(String fruit) {
        return fruitList.contains(fruit);
    }

    public int position(String fruit) {
        return fruitList.indexOf(fruit);
    }

    public int count() {
        return fruitList.size();
    }

    public int customCount() {
        int counter = 0;
        for(String fruit : fruitList) {
            counter++;
        }
        return counter;
    }
}
