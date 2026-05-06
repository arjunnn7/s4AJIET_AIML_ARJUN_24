import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<>();

        m.put(5, "Five");
        m.put(15, "Fifteen");
        m.put(8, "Eight");
        m.put(101, "Alice");

        System.out.println("Size: " + m.size());
        System.out.println(m);
        
        
    }
}
