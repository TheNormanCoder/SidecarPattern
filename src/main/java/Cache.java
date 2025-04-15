import java.util.HashMap;
import java.util.Map;

// classe per la gestione del cache
public class Cache {
    private Map<Integer, Order> cache = new HashMap<>();

    public void put(int key, Order value) {
        cache.put(key, value);
    }

    public Order get(int key) {
        return cache.get(key);
    }
}
