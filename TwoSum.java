import java.util.Arrays;
import java.util.List;

class TwoSum{
    public int[] twoSum(int target, int[] arr){
        Map<Integer, Integer> lookup = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(lookup.containsKey(target - arr[i])){
                return new int[]{lookup.get(target - arr[i]), i};
            }else{
                lookup.put(arr[i], i);
            }
        }

        return new int[]{};
    }
}