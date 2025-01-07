# Kotlin map Function Misunderstanding

This repository demonstrates a common misunderstanding of Kotlin's `map` function. Many developers new to Kotlin (or functional programming in general) assume `map` modifies the original list. This is incorrect; `map` returns a *new* list containing the transformed elements, leaving the original list untouched.

## Bug
The `bug.kt` file shows an example where a developer expects `list.map { it * 2 }` to double the values in the `list`, but it doesn't. The original list remains unchanged.

## Solution
The `bugSolution.kt` file offers a correct solution.  To modify the original list, you should use a mutable list and either directly modify it or use other methods like `mapIndexedTo`. Alternatively, reassign the result to the original variable.