import java.util.*;

 public class Permutation {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, result);  // Start backtracking from index 0
        return result;
    }

    // Backtracking function to generate permutations
    private void backtrack(int[] nums, int start, List<List<Integer>> result) {
        // If we've reached the end of the array, we have a complete permutation
        if (start == nums.length) {
            List<Integer> currentPermutation = new ArrayList<>();
            for (int num : nums) {
                currentPermutation.add(num);
            }
            result.add(currentPermutation);  // Add the current permutation to result
            return;
        }

        // Loop through the array and generate permutations
        for (int i = start; i < nums.length; i++) {
            // Swap the current index with the start index
            swap(nums, start, i);
            // Recurse for the next index
            backtrack(nums, start + 1, result);
            // Backtrack by swapping back
            swap(nums, start, i);
        }
    }

    // Helper method to swap two elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Permutation solution = new Permutation();

        // Example 1: Input [1, 2, 3]
        int[] nums1 = {1, 2, 3};
        List<List<Integer>> result1 = solution.permute(nums1);
        System.out.println("Permutations of [1, 2, 3]:");
        for (List<Integer> perm : result1) {
            System.out.println(perm);
        }

        // Example 2: Input [0, 1]
        int[] nums2 = {0, 1};
        List<List<Integer>> result2 = solution.permute(nums2);
        System.out.println("\nPermutations of [0, 1]:");
        for (List<Integer> perm : result2) {
            System.out.println(perm);
        }

        // Example 3: Input [1]
        int[] nums3 = {1};
        List<List<Integer>> result3 = solution.permute(nums3);
        System.out.println("\nPermutations of [1]:");
        for (List<Integer> perm : result3) {
            System.out.println(perm);
        }
    }
}
