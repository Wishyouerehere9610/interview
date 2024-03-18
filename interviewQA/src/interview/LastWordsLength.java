package interview;

/**
 * @author dongziming
 */
public class LastWordsLength {
    public static void main(String arg[]){
        String s = "luffy ";

        int length = 0;
        int i = s.length()-1;
        while(" ".equals(s.charAt(i))){
            i = i-1;
        }

        for (int j = i; j >= 0; j--) {
            if (!" ".equals(s.charAt(j))){
                length++;
            }else{
                break;
            }
        }
        System.out.println(length);
    }

}
