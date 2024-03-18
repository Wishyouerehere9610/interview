package interview;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class LongestCommonSubString {
    public static void main(String args[]) {
        String[] strs = {"flower", "flow", "flight"};
        String s = strs[0];
        for (String str : strs) {
            while (!str.startsWith(s)) {
                s = s.substring(0, s.length() - 1);
                if (s.length() <= 0) {
                    System.out.println("");
                }
            }
        }
        System.out.println(s);
    }


}
