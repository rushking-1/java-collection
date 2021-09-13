package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> list = new ArrayList<>();

        for (String s : collection1) {
            for (String s1 : collection2) {
                if (s.equals(s1)) {
                    list.add(s);
                }
            }
        }
        return list;
    }
}
