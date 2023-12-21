
# LeetCode Challenge D7

## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [1816.  Truncate Sentence](https://leetcode.com/problems/truncate-sentence/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
Given a sentence `s`​​​​​​ and an integer `k`​​​​​​ the task was to **truncate**  `s`​​​​​​ such that it contains only the **first**  `k`​​​​​​ words and return `s`​​​​_​​ after  **truncating**  it.



**Example**

>**Input:** s = "Hello how are you Contestant", k = 4
>
>**Output:** "Hello how are you"
>
>**Explanation:** The words in s are ["Hello", "how" "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you".

**Language Used**
> Java

**Difficulty**

> Easy



## Solution Overview
The sentence is initially split into individual words using space as the separator, resulting in an array of words. It then iterates through the array of words, appending each word to a truncated sentence until the desired word count `k` is achieved. During the iteration, a string `truncatedSentence` is built by concatenating the selected words, separated by spaces. To ensure there's no leading space in the final result, the substring of `truncatedSentence` starting from the second character (1st index) is returned.
