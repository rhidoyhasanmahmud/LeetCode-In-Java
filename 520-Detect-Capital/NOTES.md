# Description

We define the usage of capitals in a word to be right when one of the following cases holds:

1. All letters in this _word are capitals_.
2. All letters in this _word are not capitals_.
3. Only the _first letter in this word is capital_.

# Approach

- **Return True** if
  - Starts and ends with A - Z (all capitals) or
  - Starts and ends with a - z (all lowercase) or
  - Starts with an A - Z letter, then ends with lowercase
- **Return false** for other cases.

# Complexity

- Time complexity: $$O(1)$$

- Space complexity: $$O(1)$$

# Code

```
class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase()))
            return true;

        if (word.equals(word.toLowerCase()))
            return true;

        if (word.equals(capitalize(word)))
            return true;

        return false;
    }

     public static String capitalize(String str) {
        if (str == null || str.length() <= 1) return str;
        String word = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        return word;
    }
}
```

# Test Cases

Input: word = "BANGLADESH"
Output: true

Input: word = "bangladesh"
Output: true

Input: word = "Bangladesh"
Output: true
