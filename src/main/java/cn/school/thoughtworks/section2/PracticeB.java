package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。

        Map<String, Integer> count = new HashMap<>();

        for (String s : collection1) {
            String[] parts = s.split("-");
            String key = parts[0];

            int plus = 1;
            if (parts.length == 2) {
                plus = Integer.parseInt(parts[1]);
            }

            if (count.containsKey(key)) {
                count.put(key, count.get(key) + plus);
            } else {
                count.put(key, plus);
            }
        }

        return count;
    }
}
