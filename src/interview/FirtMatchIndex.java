package interview;

public class FirtMatchIndex {
    public static void main(String arg[]) {
        String haystack = "a";
        String needle = "a";
        System.out.println(method(haystack, needle));
    }

    public static int method(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (needle.length() == 1 && (String.valueOf(haystack.charAt(i)).equals(needle))) {
                    return i;

            }
            String temp = haystack.substring(i, haystack.length());
            if (temp.startsWith(needle)) {
                return i;
            }
        }
        return -1;
    }
}
