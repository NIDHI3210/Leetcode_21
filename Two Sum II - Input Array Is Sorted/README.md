#  Two Sum II - Input Array Is Sorted

##  Problem
Given a **1-indexed** sorted array of integers `numbers`, find two numbers such that they add up to a specific `target`.

- Return the indices (1-based indexing)
- Exactly one solution exists  
- You cannot use the same element twice  

---

##  Key Idea
Check all possible pairs and find the two numbers whose sum equals the target.

---

##  Approach (Brute Force)
- Use two nested loops:
  - Outer loop picks first element `i`
  - Inner loop picks second element `j` (j > i)
- For each pair:
  - If `numbers[i] + numbers[j] == target` → return `[i+1, j+1]`
- Since indexing is **1-based**, add `+1` to indices


- Intuition
The most straightforward approach: try every pair of elements and check if they add up to the target. For each element at index i, check every element at index j > i. If their sum equals the target, return the 1-indexed positions.

This doesn't use the sorted property at all, which is a red flag that we're leaving performance on the table. But it's a valid starting point for building intuition.

- Algorithm
Loop through each index i from 0 to n-2.
For each i, loop through each index j from i+1 to n-1.
If numbers[i] + numbers[j] equals the target, return [i+1, j+1].
Since a solution is guaranteed, we'll always find it before exhausting all pairs.

---

##  Complexity
- **Time Complexity:** O(n²)  
- **Space Complexity:** O(1)

