package ch10;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author lucy
 */
public class LruCache<K, V> extends LinkedHashMap<K, V> {
    private int maxEntries;

    public LruCache(int maxEntries) {
        super(16, 0.75f, true);
        this.maxEntries = maxEntries;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxEntries;
    }
}
