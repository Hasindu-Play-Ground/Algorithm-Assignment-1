public class Algo_4 {
    
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            // Swap elements at left and right indices
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            
            // Move the pointers inward
            left++;
            right--;
        }
        
        // Print out the elements in the nums array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
