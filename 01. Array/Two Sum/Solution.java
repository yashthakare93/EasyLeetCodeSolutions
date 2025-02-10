class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a Hashmap
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            // Get the Complement using the target value
            int complement = target - nums[i];

            // Search the Hashmap for complement, if found, we got our pair
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            // Put the element in Hashmap for subsequent searches
            map.put(nums[i],i);
        }
        // Return empty array if no pair is found
        return new int[]{};
    }
  
}