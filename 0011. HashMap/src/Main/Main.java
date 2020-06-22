package Main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map map = new HashMap();

        map.put("name", "Sajad");
        map.put("family", "Dadgar");
        map.put("name", "mohammad");

        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()){

            String key = iterator.next().toString();
            System.out.println(key + " " + map.get(key));
        }


        /*
        for(Object key : map.keySet()){
            System.out.println(map.get(key));
        }
`       */

    }
}
