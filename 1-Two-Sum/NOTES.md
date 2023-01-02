# Approach

There are many ways to solve this problem. But I am focusing on the brute force approach and Hashmap approach.

First of all discuss on **Brute force search**.

1. Check if the integers represented by the outside and inner loop indexes add up to the goal total in each iteration of the inner loop.
2. If nums[outerIndex] + nums[innerIndex] equals target, the return is outerIndex and innerIndex. Otherwise, keep iterating to ensure

Second approach **Hashmap**.

1. Make a hashmap with integer datatypes as keys and values. Iterate through each element in the specified array, beginning with the first.
2. Check the hashmap for the presence of the needed number (required number = goal sum – current number) in each iteration.
3. If present, return the result necessary number index, current number index.
4. Otherwise, add the current iteration number as a key to the hashmap and its index as a value. Repeat until you discover the answer.

# Complexity

## Approach - 01: Brute Force approach

- Time complexity: $$O(n^2)$$
- Space complexity: $$O(1)$$

## Approach - 02: Hashmap approach

- Time complexity: $$O(n)$$
- Space complexity: $$O(n)$$

# Code

```
// Brute force search.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int outerIndex = 0; outerIndex < nums.length; outerIndex++) { // n
            for (int innerIndex = outerIndex + 1; innerIndex < nums.length; innerIndex++) { // n-1 ~ n
                if (nums[outerIndex] + nums[innerIndex] == target) {
                    return new int[]{outerIndex, innerIndex};
                }
            }
        }
        return new int[]{};
    }
}

// Hashmap
class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] arr = new int[2];

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            int key = target - nums[index];
            if (hashMap.containsKey(key)) {
                arr[0] = hashMap.get(key);
                arr[1] = index;

                return arr;
            }
            hashMap.put(nums[index], index);
        }
        return arr;
    }
}


```

# Test Cases

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Input: nums = [3,2,4], target = 6
Output: [1,2]

Input: nums = [3,3], target = 6
Output: [0,1]
