<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static String firstNonRepeatingChar(String str){
        if(str.length() == 0) return "Your input is null";

        Map<Character, Integer> freq = new HashMap<>();
        
        for(char c: str.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> mp : freq.entrySet()){
            if(mp.getValue() == 1) return String.valueOf(mp.getKey()) ;
        }

        return null;

    }
}
=======
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static String firstNonRepeatingChar(String str){
        if(str.length() == 0) return "Your input is null";

        Map<Character, Integer> freq = new HashMap<>();
        
        for(char c: str.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> mp : freq.entrySet()){
            if(mp.getValue() == 1) return String.valueOf(mp.getKey()) ;
        }

        return null;

    }
}
>>>>>>> 68c0e88 (Imp dsa q&a)
