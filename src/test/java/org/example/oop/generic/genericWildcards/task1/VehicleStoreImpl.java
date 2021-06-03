package org.example.oop.generic.genericWildcards.task1;

import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Map;

public class VehicleStoreImpl<K, V> implements MyObjectStore<K, V> {
    @Override
    public void put(K key, V value) {

    }

    @Nullable
    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public void putAll(Map<K, V> entries) {

    }

    @Override
    public Map<K, V> getAll(Collection<K> keys) {
        return null;
    }

    @Override
    public Collection<V> getAll(Predicate<V> p) {
        return null;
    }
}
