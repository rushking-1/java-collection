package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collection3 = new HashMap<>();

        for (String s : collectionA) {
            String[] parts = s.split("-");
            String key = parts[0];

            int plus = 1;
            if (parts.length == 2) {
                plus = Integer.parseInt(parts[1]);
            }

            if (collection3.containsKey(key)) {
                collection3.put(key, collection3.get(key) + plus);
            } else {
                collection3.put(key, plus);
            }
        }
        return new PracticeB().createUpdatedCollection(collection3, object);
    }
}
