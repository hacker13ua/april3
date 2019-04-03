package org.esurovskiy.april3;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class Main2 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        add(100, map);
        add(100000, map);
        add(3, map);
        add(101, map);
        System.out.println(map);
        map.keySet().removeIf(k -> k > 3);
        System.out.println(map);
        /*for (Integer key : map.keySet()) {
            System.out.println("Key " + key
                    + ", value = " + map.get(key));
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.println("key= " + entry.getKey());
            System.out.println("value " + entry.getValue());
        }

        Iterator<Integer> keysIterator = map.keySet().iterator();
        while (keysIterator.hasNext()) {
            final Integer key = keysIterator.next();
            keysIterator.remove();
            System.out.println("Next = " + key);
        }


        System.out.println(map);
        System.out.println(map.values());

*/
    }

    private static void add(final Integer i, final Map<Integer, Integer> map) {
        map.put(i, i.toString().length());
    }
}
