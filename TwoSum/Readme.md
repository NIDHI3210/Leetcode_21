## Two Sum

## Problem
Given an array nums and an integer target, return indices of two numbers such that they add up to target.

Exactly one solution exists
You cannot use the same element twice
Return indices in any order

## Key Idea
For each element nums[i], find:
target - nums[i] (this is called the complement)

## Approaches

1️. Brute Force

Check every pair (i, j)
If nums[i] + nums[j] == target → return indices

Time Complexity: O(n²)
Space Complexity: O(1)

2️. Hash Map (Optimal)

Store value → index in a map
For each element:
Check if complement exists in map
If yes → return indices
Else → store current element

Time Complexity: O(n)
Space Complexity: O(n)