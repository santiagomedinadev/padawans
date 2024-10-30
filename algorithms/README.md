# Description
The steps for these exercises are as follows:
- Read the exercises.
- Create a new branch in the repository.
- Create a new folder with the solutions (feel free to choose the language that you want).
- Create a Pull Request to merge the solutions in the main branch.

### Palindrome Number (Exercise 1)
Given an integer `x`, return `true` if `x` is a **palindrome**, and `false` otherwise.
**Example 1:**
**Input:** x = 121
**Output:** true
**Explanation:** 121 reads as 121 from left to right and from right to left.

**Example 2:**
**Input:** x = -121
**Output:** false
**Explanation:** From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

**Example 3:**
**Input:** x = 10
**Output:** false
**Explanation:** Reads 01 from right to left. Therefore it is not a palindrome.

**Constraints:**

-   `-231 <= x <= 231 - 1`

**Follow up:** Could you solve it without converting the integer to a string?

### Valid Parentheses (Exercise 2)
Given a string  `s`  containing just the characters  `'('`,  `')'`,  `'{'`,  `'}'`,  `'['`  and  `']'`, determine if the input string is valid.

An input string is valid if:

1.  Open brackets must be closed by the same type of brackets.
2.  Open brackets must be closed in the correct order.
3.  Every close bracket has a corresponding open bracket of the same type.

**Example 1:**
**Input:**  s = "()"
**Output:**  true

**Example 2:**
**Input:**  s = "()[]{}"
**Output:**  true

**Example 3:**
**Input:**  s = "(]"
**Output:**  false

**Example 4:**
**Input:**  s = "([])"
**Output:**  true

**Constraints:**

-   `1 <= s.length <= 104`
-   `s`  consists of parentheses only  `'()[]{}'`.

### Sherlock (Exercise 3)
**Input:** ["eat", "tea", "tan", "ate", "nat", "bat"]  
**Output:** [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]