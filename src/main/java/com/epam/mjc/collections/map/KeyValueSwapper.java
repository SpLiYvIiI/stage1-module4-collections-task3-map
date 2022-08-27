package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> res = new HashMap<>();
        for (Integer i :
                sourceMap.keySet()) {
            if (res.containsKey(sourceMap.get(i)))
                continue;
            else
                res.put(sourceMap.get(i), i);
        }
        return res;
    }
}
