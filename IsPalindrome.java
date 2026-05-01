class IsPalindrome{
    public static String isPalindrome(String str){
        char[] arr = str.toCharArray();
        if(arr.length == 0) return "Your input is null";

        for(int i=0; i<arr.length/2; i++){
            if(arr[i] != arr[arr.length - 1 - i]) return "Its not a palindrome";
        }

        return "Its a palindrome";
    }
}