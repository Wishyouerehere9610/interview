package interview;

import java.util.*;

import static java.util.Collections.swap;

public class Cards {
    public static void main(String args[]) {
        // 总扑克牌
        List<String> pokes = new ArrayList<>();
        // 扑克牌数字
        List<String> numbers = new ArrayList<>(Arrays.asList("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"));
        // 扑克牌花色
        List<String> colors = new ArrayList<>(Arrays.asList("♠", "♥", "♣", "♦"));

        for (String color : colors) {
            for (String number : numbers) {
                pokes.add(color + number);
            }
        }

        Collections.shuffle(pokes);

        String pai;
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < pokes.size(); i++) {
            pai = pokes.get(i);
            if (i > 50) {
                dipai.add(pai);
            } else if (i % 3 == 0) {
                a.add(pai);
            } else if (i % 3 == 1) {
                b.add(pai);
            } else {
                c.add(pai);
            }
        }
        System.out.println(a);

        for (int j = 0; j < a.size(); j++) {
            Random random = new Random();
            int n1 = random.nextInt(a.size());
            swap(a,j,n1);
        }
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);

        int[] d={1,2,3,4,5,6,7};
        System.out.println(d.length/2);
    }
}