package jUnit5Class;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class FruitsBasket2 {

    private List<Fruit> basket = new ArrayList<>();

    public void add(Fruit fruit) {
    	basket.add(fruit);
    }

    public void remove(Fruit fruit) {
        if (!basket.contains(fruit)) {
            throw new NoSuchElementException();
        }
        basket.remove(fruit);
    }

    public int getSize() {
        return basket.size();
    }

    public void removeAll() {
    	basket.clear();
    }
}
