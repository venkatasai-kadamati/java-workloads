### List of Sorting Algorithms
1. Selection
2. Bubble
3. Insertion
4. Merge
5. Quick
6. Heap
7. TreeSort
8. Counting, Radix, Bucket

### Key Points about each Algo:
#### Selection
1. The starting elements eventually have the min as needed. So the inner loop would be from j = i to n.
2. Core idea is to get things moved to the start
3. Think like we select the least (min) to the start.

#### Bubble
1. The ending element eventually have the max as needed. So the inner loop would go from j = 0 to (n - i)
2. Core idea is to get things moved to the end
3. Think like bubbles float up (end)
4. **Optimization**: Assume currently we are running for n2 times. 
- But if the array is already sorted then? 
- We can simply exit the loop if no swaps happen in the first run.


#### Insertion
1. The assumption is that we take an element and place it in the right position.
2. Core idea is to swap as many times as possible to get the right place.
3. Think like "you know its place but to reach it you move multiple places"


### Time Complexity's
| Algorithm | Worst Case | Best Case |
|-----------|------------|-----------|
| Selection Sort | O(N²) | O(N²) |
| Bubble Sort | O(N²) | O(N) |
| Insertion Sort | O(N²) | O(N) |
