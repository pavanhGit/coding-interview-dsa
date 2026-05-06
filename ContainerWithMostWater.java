class ContainerWithMostWater {
    public static int containerWithMostWater(int[] height) {
        int n = height.length, left = 0, right = n-1;
        int maxArea = 0;
        while(left < right){
            maxArea = Math.max(maxArea, ((right - left)* Math.min(height[right], height[left])));
            if(height[left] < height[right]){
                left++;
            }else{
                right++;
            }
        }
        return maxArea;
    }
}