package org.examples;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args)
    {
        Set<String> set = new LinkedHashSet<>();
        set.add("hello");
        set.add("123");
        Set decorator = new MirroredSet(set);
        Object[] set_array = new Object[1];
        var new_arr = decorator.toArray(set_array);
        for(var el : new_arr)
        {
            System.out.println(el + " ");
        }
    }
}
