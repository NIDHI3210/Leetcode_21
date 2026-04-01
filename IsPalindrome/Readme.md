## Intuition
-We reverse the number using math instead of converting it to a string. We take digits one by one from the end and build a new number. If the reversed number is equal to the original number, then it is a palindrome. Negative numbers are not palindromes.

-The one thing to watch out for: negative numbers always have the minus sign at the front, which can't appear at the back, so they're never palindromes.

## Approach
-If x is less than 0, return false. Store the original value of x. Initialize reversed to 0.
While x is greater than 0, take the last digit using x % 10, add it to reversed using reversed = reversed * 10 + digit, and remove the last digit from x using x = x / 10.
-Finally, compare reversed with the original number.
-If they are equal, return true, otherwise false.

## Complexity
-Time Complexity: O(d), where d is the number of digits.
-Space Complexity: O(1), since only a few variables are used.
