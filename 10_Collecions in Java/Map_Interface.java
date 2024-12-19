import java.util.*;
import java.util.stream.Collectors;

public class Map_Interface {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        //adding element
        map.put("us", "america");
        map.put("uk", "england");
        map.put("in", "india");
        map.putIfAbsent("uae", "arab");  //if not present then add
        System.out.println(map);


        //fetch element
        System.out.println(map.get("uae"));
        System.out.println(map.getOrDefault("pk", "Others"));   //if given key is prsenet thet will be returned else "Default" value wull be return ....here default is others

        //remove element      map.remove(key)
        System.out.println(map.remove("in"));
        System.out.println(map.remove("us", "USA"));  //us will be remove when us corrosponding value is USA either not remove
        System.out.println(map);


        //we can also check whether the key or value is present or not
        System.out.println(map.containsKey("jp"));     //return true or false
        System.out.println(map.containsValue("africa"));    //return true of false

        Set<String> keys = map.keySet();
        System.out.println(keys);

        Collection<String> value = map.values();
        System.out.println(value);
    }
    
}


/*
on left side we can write (map) because it represents the interface, and on right side we write full class name

map1.putAll(map2);   all amp2 element will be moved into map1

keySet()  ---> return all the set of keys
values()  ---> return all the set of values.
entrySet()  ----> return all key value pair

*/
