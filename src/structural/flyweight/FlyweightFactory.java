package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

class FlyweightFactory {
    private Map<Integer, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(int color) {
        if (flyweights.containsKey(color)) {
            return flyweights.get(color);
        } else {
            Flyweight flyweight = new ConcreteFlyweight(color);
            flyweights.put(color, flyweight);
            return flyweight;
        }
    }
}
