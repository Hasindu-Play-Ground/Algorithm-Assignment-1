public class Algo_2 {
    public static void main(String[] args) {
        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23};
        
        int smallest = nums[0];
        int largest = nums[0];
        
        int index = 1;
        do {
            if (nums[index] < smallest) {
                smallest = nums[index];
            }
            
            if (nums[index] > largest) {
                largest = nums[index];
            }
            
            index++;
        } while (index < nums.length);
        
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
