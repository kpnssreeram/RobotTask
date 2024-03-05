import java.util.*;

public class Robot {
    static void finalPosition(String p) {
        Map<Character, Integer> dm = new HashMap<>();
        dm.put('U', 0);
        dm.put('D', 0);
        dm.put('L', 0);
        dm.put('R', 0);

        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            dm.put(c, dm.get(c) + 1);
        }

        int up = dm.get('U');
        int down = dm.get('D');
        int left = dm.get('L');
        int right = dm.get('R');
        System.out.println("Final Position: (" + (right - left) + ", " + (up - down) + ")");
    }

    public static void main(String[] args) {
        String p = "UDDLR";
        finalPosition(p);
    }
}