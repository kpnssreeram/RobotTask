import java.util.Map;
import java.util.HashMap;

class Robot {
    static void finalPosition(String p) {
        Map<Character, Integer> dm = new HashMap<>();
        dm.put('U', 0);
        dm.put('D', 0);
        dm.put('L', 0);
        dm.put('R', 0);

        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
           dm.put(c,dm.get(c) + 1);
        }

        int up =dm.get('U');
        int down =dm.get('D');
        int left =dm.get('L');
        int right =dm.get('R');

        int vert_pos = up - down;
        int hor_pos = right - left;

        System.out.println("position is"+"("+(right - left)+", "+(up - down)+")");
        
        if (vert_pos > 0) {
            System.out.println("North");
        } else if (vert_pos < 0) {
            System.out.println("South");
        } else if (hor_pos > 0) {
            System.out.println("East");
        } else if (hor_pos < 0) {
            System.out.println("West");
        } else {
            System.out.println("None");
        }
    }

    public static void main(String[] args) {
        String p = "UDDLRLR";
        finalPosition(p);
    }
}
