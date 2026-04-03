# Third Maximum Number

## Understanding the Problem

This problem asks for the third largest distinct value in the array. The word "distinct" is doing a lot of heavy lifting here. If the array is `[2, 2, 3, 1]`, the three distinct maximums are `3, 2, and 1`, not `3, 2, and 2`. So duplicates don't count.

---

## Approach 1: Sorting

### Intuition

The most natural way to find the third largest distinct value: sort the array in descending order, skip duplicates, and pick the third unique value you encounter. If you run out of unique values before reaching three, return the largest.

This is clean, easy to reason about, and hard to get wrong.

### Algorithm

1. Sort the array in ascending order.  
2. Start from the end (largest element) and walk backward.  
3. Count distinct values as you go. Each time you see a value different from the previous one, increment a counter.  
4. When the counter reaches 3, return that value.  
5. If you reach the beginning of the array without finding 3 distinct values, return the largest element (last element after sorting).  

### Complexity Analysis

- **Time Complexity:** O(n log n). Sorting dominates. The subsequent linear scan is O(n), but sorting takes O(n log n).  
- **Space Complexity:** O(1) to O(n). Depends on the sorting implementation. In-place sorts use O(log n) stack space, while some languages allocate O(n).  

---

## Approach 2: Track Three Maximums

- **Time Complexity:** O(n). A single pass through the array. Each element requires at most 3 comparisons (duplicate check) plus at most 3 more (position check), so O(1) work per element.  
- **Space Complexity:** O(1). Only three extra variables regardless of input size.