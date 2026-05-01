<<<<<<< HEAD
class ReverseString{
    public static String reverseString(String str){
        char arr[] = str.toCharArray();
        if(arr.length == 0) return "Your input is empty";
        
        char temp = 0;
        for(int i=0; i<arr.length / 2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        return String.valueOf(arr);
    }
=======
class ReverseString{
    public static String reverseString(String str){
        char arr[] = str.toCharArray();
        if(arr.length == 0) return "Your input is empty";
        
        char temp = 0;
        for(int i=0; i<arr.length / 2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        return String.valueOf(arr);
    }
>>>>>>> 68c0e88 (Imp dsa q&a)
}