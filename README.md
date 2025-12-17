# The Chaotic Binger’s Longest Streak

This project solves a competitive programming problem where we determine the longest streak of consecutive episodes watched, regardless of order.

## Problem Statement
Given a list of episode numbers watched in any order, find the longest sequence of consecutive episode numbers.

## Example
Input:
[100, 4, 200, 1, 3, 2]

Output:
4

## Approach
- Store all episode numbers in a HashSet for fast lookup.
- Identify the start of a sequence when a number has no predecessor.
- Extend the sequence forward and track the maximum length.

## Time & Space Complexity
- Time Complexity: O(n)
- Space Complexity: O(n)

## Language Used
Java
