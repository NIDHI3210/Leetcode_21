#  Search Insert Position

##  Problem
Given a sorted array of distinct integers and a target value, return the index if the target is found.  
If not, return the index where it would be inserted to maintain sorted order.

---

##  Key Idea
Since the array is **sorted**, we can use **Binary Search** to achieve better efficiency.

---

##  Approach (Binary Search)
- Initialize `left = 0` and `right = n - 1`
- While `left <= right`:
  - Find `mid = left + (right - left) / 2`
  - If `nums[mid] == target` → return `mid`
  - If `nums[mid] < target` → search right half
  - Else → search left half
- If not found, `left` will be the correct insert position

---

##  Complexity
- **Time Complexity:** O(log n)  
- **Space Complexity:** O(1)



