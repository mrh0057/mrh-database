package net.matthoyt.database.writer;

import java.util.HashMap;

public class HashMapBuilder<K, V>
{
    private HashMap<K, V> _hashMap = new HashMap<>();

    public HashMapBuilder add(K key, V value)
    {
        _hashMap.put(key, value);
        return this;
    }

    public HashMap<K, V> build()
    {
        return _hashMap;
    }
}
