package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> count = new HashMap<>();

        for (String s : collection1) {

            String key = s;
            StringBuilder temp = new StringBuilder();
            boolean keyDefined = false;

            for (char c : s.toCharArray()) {
                if (c == ':' || c == '-' || c == '[') {
                    key = temp.toString();
                    temp = new StringBuilder();
                    keyDefined = true;
                } else if (c == ']') {
                    break;
                } else {
                    temp.append(c);
                }
            }

            int plus = 1;
            if (keyDefined) {
                plus = Integer.parseInt(temp.toString());
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
