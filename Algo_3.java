public class Algo_3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int length = nums.length;
        
        int[] reversedArray = new int[length];  // Create a new array to store the reversed elements
        
        for (int i = 0; i < length; i++) {
            reversedArray[i] = nums[length - 1 - i];  // Populate reversedArray in reverse order
        }
        
        nums = reversedArray;  // Assign the memory location of reversedArray to nums
        
        // Print out the elements in the nums array
        for (int num : nums) {
            System.out.println(num );
        }
    }
}
