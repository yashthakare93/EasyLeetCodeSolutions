class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create a HashSet to store unique numbers
        Set<Integer> set = new HashSet<>();

        // Iterate through each number in the array
        for (int num : nums) {
            // If the number is already in the set, a duplicate exists
            if (set.contains(num)) {
                return true;
            }
            // Otherwise, add the number to the set
            set.add(num);
        }

        // If no duplicates were found, return false
        return false;
    }
}


