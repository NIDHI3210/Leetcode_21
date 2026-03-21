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
##⏱️ Complexity
-Time: O(n)
-Space: O(1)
