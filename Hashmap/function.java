

import java.util.HashMap;
import java.util.Map;

public class function {
    public static void main(String args[]) {
        HashMap<Integer, String> hashmap = new HashMap<>();
        //PUT function
        hashmap.put(1, "Durga");
        hashmap.put(2, "Manjeet");

        hashmap.put(3, "kalinga");

        System.out.println("Hashmao of Givem Data " + hashmap);

        // GET function
        String result = hashmap.get(3);
      
        System.out.println("Value for a given key is " + result);

        //containKey Function
        System.out.println(hashmap.containsKey(2));
          
        //remove Function 

        hashmap.remove(1);

        System.out.println("Updated HAshmap" + hashmap);
        
        //iterating Using Hashmap
        for (Map.Entry<Integer, String> e : hashmap.entrySet()) {
            System.out.println("hashmap is : " + e.getKey() + ":" + e.getValue());
        }
    }

}
