package org.examples;

import java.util.Iterator;

public class MirroredSetIterator implements Iterator<String> {
    Iterator<String> iterator;
    MirroredSetIterator(Iterator<String> _iterator)
    {
        iterator = _iterator;
    }
    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public String next() {
        String value = iterator.next();
        StringBuilder sb = new StringBuilder(value);
        sb.reverse();
        return sb.toString();
    }
}
