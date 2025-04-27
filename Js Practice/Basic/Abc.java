
import java.util.HashMap;

public class Abc{
    public static void main(String[] args) {
        HashMap<String,Integer> mp= new HashMap<>();

        mp.put("Swag", 60);
        mp.put(null, null);
        mp.put(null, 90);
        mp.put("chintu",89 );
        System.out.println(mp.keySet());
        System.out.println(mp.get(null));
        System.out.println(mp.get("rahul"));
        mp.put("chintu",34);
        System.out.println(mp.get("chintu"));
        // mp.remove("chintu");
        // System.out.println(mp);

    
        System.out.println( mp.containsKey("Swag"));
        System.out.println(mp.containsKey("chintu"));

        System.out.println(mp.putIfAbsent("Swag", 30));
        System.out.println(mp.entrySet());

        for(String key:mp.keySet()){
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        

    }
    
}