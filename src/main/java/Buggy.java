import java.util.HashMap;
import java.util.Map;

public class Buggy {

    public void run() {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("one", new Integer(1));

        for (String key: map.keySet()) {
            if (key == "one") {
                System.out.print("content dump: " + map.get(key));
            }
        }
    }
}
