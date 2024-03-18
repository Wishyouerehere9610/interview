package interview;

public class PalindromicString {
    public static void main(String args[]){
        System.out.println(run("abcddcba"));
    }

    public static boolean run(String s) {
        if(s.replaceAll(" ", "").isEmpty()){
            return true;
        }
        String cleanS = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
        int i = 0;
        int j = cleanS.length() - 1;
        while (i != j && j-i!=-1) {
            if (!String.valueOf(cleanS.charAt(i)).equals((String.valueOf(cleanS.charAt(j))))) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}