package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> res = new HashMap<>();
        List<String> list = Arrays.asList(sentence.split("\\s"));
        for (String x :
                list) {
            if (x.isEmpty())
                continue;
            String toLower = x.toLowerCase(Locale.ENGLISH).replaceAll("[^a-zA-Z0-9]", "");
            res.put(toLower, res.getOrDefault(toLower, 0) + 1);
        }
        return res;
    }
}
