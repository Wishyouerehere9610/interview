package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimilarString {
    public static void main(String[] arg) {
        String s = "egg";
        String t = "add";
        if (s.length() != t.length()) {
            System.out.println(false);
        }

        Map<String, List<Integer>> smap = new HashMap<>();
        Map<String, List<Integer>> tmap = new HashMap<>();
        boolean result = true;
        int point = 0;
        while (point < t.length()) {
            if (!smap.containsKey(String.valueOf(s.charAt(point)))) {
                List<Integer> checkList = new ArrayList<>();
                checkList.add(point);
                smap.put(String.valueOf(s.charAt(point)), checkList);
            } else {
                List<Integer> value = smap.get(String.valueOf(s.charAt(point)));
                value.add(point);
                smap.put(String.valueOf(s.charAt(point)), value);
            }

            if (!tmap.containsKey(String.valueOf(t.charAt(point)))) {
                List<Integer> checkList = new ArrayList<>();
                checkList.add(point);
                tmap.put(String.valueOf(t.charAt(point)), checkList);
            } else {
                List<Integer> value = tmap.get(String.valueOf(t.charAt(point)));
                value.add(point);
                tmap.put(String.valueOf(t.charAt(point)), value);
            }
            if (!smap.get(String.valueOf(s.charAt(point))).equals(tmap.get(String.valueOf(t.charAt(point))))) {
                result = false;
            }
            point++;
        }
        System.out.println(result);
    }

}
