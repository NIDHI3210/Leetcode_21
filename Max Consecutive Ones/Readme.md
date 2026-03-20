# Max Consecutive Ones (Easy)

🔗 Problem Link: https://leetcode.com/problems/max-consecutive-ones/

---

## 🧠 Problem Statement

Given a binary array `nums`, return the maximum number of consecutive `1`s in the array.

---

## 💡 Approach

* Traverse the array once.
* Maintain a `count` to track current consecutive `1`s.
* If the current element is `1`, increment `count`.
* If it is `0`, reset `count` to `0`.
* Keep updating `max` to store the maximum consecutive count.

---

## ⏱️ Complexity Analysis

* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

---

## 💻 Java Code

```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        return max;
    }
}
```

---

## 📝 Example

**Input:**
`nums = [1,1,0,1,1,1]`

**Output:**
`3`

**Explanation:**
The longest sequence of consecutive `1`s is `[1,1,1]`.

---

## ✨ Key Points

* Simple single-pass solution
* Uses basic counting technique
* Efficient and optimal approach

---

## 📌 Tags

`Array` `Greedy` `Easy`

---
