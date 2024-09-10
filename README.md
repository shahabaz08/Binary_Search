"# Binary_Search" 
This repositiry contains the the implentation of 
Binary Search Algorithm 
In both 
1)Iterative 
2) Recursive Ways.


Below provided some steps to acheive bainary Search Algorithm

1.Divide the search space into two halves by finding the middle index “mid”. 
2.Compare the middle element of the search space with the key. 
3.If the key is found at middle element, the process is terminated.
4.If the key is not found at middle element, choose which half will be used as the next search space.
5.If the key is smaller than the middle element, then the left side is used for next search.
6.If the key is larger than the middle element, then the right side is used for next search.
7.This process is continued until the key is found or the total search space is exhausted.

Time Complexity: 
O(logn), where n is the number of elements in the list. 
This makes binary search very efficient compared to linear search, especially for large lists.


Space Complexity: 
𝑂(1)
O(1) for iterative implementations, as it only requires a few additional variables. 

Recursive implementations would have 
𝑂(log𝑛)
O(logn) space complexity due to the recursion stack.
