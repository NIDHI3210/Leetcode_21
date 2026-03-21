# 🧠 Product of Array Except Self

## 📌 Problem
Given an integer array `nums`, return an array `answer` such that:

- `answer[i]` = product of all elements except `nums[i]`
- Do **not use division**
- Must run in **O(n)** time

---

## 💡 Key Idea

For each index `i`, result =  
👉 (product of elements on left) × (product of elements on right)

---

## ⚙️ Approach

1. Create an output array
2. Traverse left → store prefix product
3. Traverse right → multiply with suffix product
4. Return result

---
## 🚫 Brute Force (Not Efficient)

- For each index:
  - Multiply all elements except itself
- Time Complexity: **O(n²)** ❌

---

## ⚡ Optimized Solution

- Use prefix + suffix products
- No division used
- Time Complexity: **O(n)** ✅
- Space Complexity: **O(1)** (excluding output array)

---

## 💻 Code (Java)

```java
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }

        return result;
    }
}

##⏱️ Complexity
-Time: O(n)
-Space: O(1)