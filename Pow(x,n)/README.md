#  Pow(x, n)

##  Problem
Implement `pow(x, n)`, which calculates x raised to the power n (i.e., xⁿ).

---

##  Key Idea
Use the built-in power function to directly compute the result instead of implementing the algorithm manually.

---

##  Approach (Built-in Function)
- Use `Math.pow(x, n)` to calculate the power
- It internally handles:
  - Positive powers  
  - Negative powers  
  - Edge cases  

---

##  Complexity
- **Time Complexity:** O(log n) *(handled internally)*  
- **Space Complexity:** O(1)

