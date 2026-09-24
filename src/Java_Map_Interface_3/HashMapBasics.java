package Java_Map_Interface_3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapBasics {
    public static void main(){
        // HashMap store the data in key-value pair.

        //create
        Map<String, String> mapping = new HashMap<>();

        //insertion  - it randomly insert the value
        mapping.put("in", "India");
        mapping.put("in", "India2"); // this term will update the value of in
        mapping.put("br", "Bihar");
        mapping.put("us", "United States");

        System.out.println(mapping);

        // method
        Map<String, String > table = new HashMap<>();
        table.put("TS", "Telangana State");
        System.out.println("Before : " + table);
        // putAll() - means merge two HashMap
        table.putAll(mapping);
        System.out.println("After : " + table);

        // deletion
        table.remove("en");

        //putIfAbset(k,v) - this method used for agr entry nahi hai to create karega
        table.putIfAbsent("Is", "India 3");
        System.out.println(table);

        // get(Key), getORDefault(key, default value), containsKey(K),ContainsValue(V)
        System.out.println(table.get("Is"));

        System.out.println(table.getOrDefault("Ir", "None"));

        System.out.println(table.containsKey("ire")); // it give true/false

        System.out.println(table.containsValue("United States"));

        //replace method
        table.replace("in", "Indonesia");
        System.out.println(table);

        // keySet() - it return set
        Set<String> keyset = table.keySet();
        System.out.println(keyset);

        // valueSet() -- it return collection
        Collection<String> valueSet = table.values();
        System.out.println(valueSet);

        // entrySet() - it return Set
        Set<Map.Entry<String, String>> entryset = table.entrySet();
        System.out.println("Printing entries : " + entryset);

        //Iterating over a Map

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");

        // for each loop
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Keys : " + entry.getKey() + ", Values : ");
        }



    }
}
