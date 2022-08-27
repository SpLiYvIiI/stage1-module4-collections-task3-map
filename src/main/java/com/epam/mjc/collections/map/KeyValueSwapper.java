package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> res = new HashMap<>();
        for (Map.Entry<Integer, String> i :
                sourceMap.entrySet()) {
            if (!res.containsKey(i.getValue())) {
                res.put(i.getValue(), i.getKey());
            }
        }
        return res;
    }
}
