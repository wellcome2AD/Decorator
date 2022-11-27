package org.examples;

import java.util.*;

public class MirroredSet<String> implements Set<String>{
    private Set set;
    public MirroredSet(Set _set)
    {
        set = _set;
    }
    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return set.contains(o);
    }

    @Override
    public Iterator iterator() {
        Iterator defaultIterator = set.iterator();
        return new MirroredSetIterator(defaultIterator);
    }

    @Override
    public Object[] toArray() {
        var reversed_set = set.toArray();
        for(int i = 0; i < reversed_set.length; ++i)
        {
            StringBuilder sb = new StringBuilder(reversed_set[i].toString());
            reversed_set[i] = sb.reverse().toString();
        }
        return reversed_set;
    }

    @Override
    public boolean add(Object o) {
        return set.add(o);
    }

    @Override
    public boolean remove(Object o) {
        return set.remove(o);
    }

    @Override
    public boolean addAll(Collection collection) {
        return set.addAll(collection);
    }

    @Override
    public void clear() {
        set.clear();
    }

    @Override
    public boolean removeAll(Collection collection) {
        return set.removeAll(collection);
    }

    @Override
    public boolean retainAll(Collection collection) {
        return set.retainAll(collection);
    }

    @Override
    public boolean containsAll(Collection collection) {
        return set.containsAll(collection);
    }

    @Override
    public Object[] toArray(Object[] objects) {
        var reversed_set = set.toArray();
        if(reversed_set.length <= objects.length)
        {
            for(int i = 0; i < reversed_set.length; ++i)
            {
                StringBuilder sb = new StringBuilder(reversed_set[i].toString());
                objects[i] = sb.reverse().toString();
            }
            if(reversed_set.length < objects.length)
            {
                objects[reversed_set.length] = null;
            }
        }
        else
        {
            return toArray();
        }
        return objects;
    }
}
