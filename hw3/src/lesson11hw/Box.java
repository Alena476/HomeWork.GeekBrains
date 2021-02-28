package lesson11hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <T extends Fruit> {
    private final List<T> container;
    private int capacity;

    public Box(int capacity,T ...fruits) {
        this.capacity = capacity;
        this.container = new ArrayList<>(Arrays.asList(fruits));
    }

    public float getWeight() {
        float allWeight = 0.0f;
        for(T fruit : container) {
          allWeight += fruit.getWeight();
        }
        return allWeight;
    }

    public boolean compareWeight(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.01;
    }

    public void putFruitsToAnotherBox(Box<T> anotherBox) {
        if(anotherBox ==this) return;

        int countSize = Math.min(container.size(), anotherBox.capacity);
        List<T> fruitsCopy = container.subList(0, countSize);
        anotherBox.container.addAll(0, fruitsCopy);
        container.removeAll(fruitsCopy);
        anotherBox.capacity -= countSize;
        capacity += countSize;
    }

    public void addFruit(T fruit) {
        if(capacity - 1 > 0) {
            container.add(fruit);
            capacity--;
        }
    }
}
