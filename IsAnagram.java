<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public static String isAnagram(String str1, String str2){

        if(str1.isEmpty() || str2.isEmpty()) return "Invalid input";
        
        Map<Character, Integer> freq = new HashMap<>();
        
        for(char c: str1.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }

        for(char c: str2.toCharArray()){
            if(!freq.containsKey(c)) return "Not anagram";

            freq.put(c, freq.get(c) - 1);
            if(freq.get(c) == 0)
                freq.remove(c);

        }
        
        return freq.isEmpty() ? "Yes anagrams" : "Not anagrams";

    }
}
=======
import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public static String isAnagram(String str1, String str2){

        if(str1.isEmpty() || str2.isEmpty()) return "Invalid input";
        
        Map<Character, Integer> freq = new HashMap<>();
        
        for(char c: str1.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }

        for(char c: str2.toCharArray()){
            if(!freq.containsKey(c)) return "Not anagram";

            freq.put(c, freq.get(c) - 1);
            if(freq.get(c) == 0)
                freq.remove(c);

        }
        
        return freq.isEmpty() ? "Yes anagrams" : "Not anagrams";

    }
}
>>>>>>> 68c0e88 (Imp dsa q&a)
