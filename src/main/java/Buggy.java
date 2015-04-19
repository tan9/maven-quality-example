import java.util.HashMap;
import java.util.Map;

public class Buggy {

    public void run() {
        Map<String, Integer> map = new HashMap<>();

        map.put("壹", new Integer(1));

        for (String key: map.keySet()) {
            if (key == "壹") {
                System.out.print("content dump: " + map.get(key));
            }
        }
    }
}
