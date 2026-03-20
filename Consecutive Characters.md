# Consecutive Characters (Easy)

🔗 Problem Link: https://leetcode.com/problems/consecutive-characters/

---

## 🧠 Problem Statement

Given a string `s`, return the length of the longest substring that contains only one unique character.

---

## 💡 Approach (Brute Force)

* Traverse the string character by character.
* Keep a counter to track the current sequence of identical characters.
* If the current character is the same as the previous one, increment the counter.
* Otherwise:

  * Update the maximum length.
  * Reset the counter to 1.
* Finally, return the maximum value obtained.

---

## ⏱️ Complexity Analysis

* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

---

## 💻 Java Code

```java
class Solution {
    public int maxPower(String s) {
        int count = 1;  
        int max = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {  
                count++;
                max = Math.max(max, count);     
            } else {
                count = 1; 
            }
        }
        return max;
    }
}
```

---

## 📝 Example

**Input:**
`s = "abbcccddddeeeeedcba"`

**Output:**
`5`

**Explanation:**
The longest substring with the same character is `"eeeee"`.

---

## ✨ Notes

* This is a simple linear scan problem.
* Helps in understanding string traversal and counting patterns.
* Can be optimized easily (already optimal in this case).

---
