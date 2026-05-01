import java.util.Arrays;
import java.util.List;

class TwoSum{
    public static String twoSum(Integer target, Integer[] arr){

        if(arr.length == 0) return "You arr is empty";

        List<Integer> list = Arrays.asList(arr);

        for(int i=0 ;i<list.size(); i++){
            if(list.contains(target - list.get(i))){
                return "index = ("+i+", "+list.indexOf(target - list.get(i))+")";
            }
        }
        return "null";
    }
}