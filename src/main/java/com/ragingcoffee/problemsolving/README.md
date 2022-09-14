# Leetcode Problems

- The link of the corresponding problem is commented for all programs. In most cases, fairly acceptable solutions that passes 100% of the test cases have been formulated.
- The programs lack a main method for execution. Only the function body that solved the problem has been given.
- Some problems that have some API implemented behind the scenes are completely commented out so as to not run into any Maven problems during Jenkins builds.


## Peaks in Array Mountains

The peak may be ascending->descending or ascending->ascending (after a steep fall). No further cases exist, generally.
- For the former, run binary search twice - first for the ascending subpart of the array and second for the descending subpart of the array.
- For the latter, we have to find the pivot after which the dip in sort occurs (element > element + 1).
- For the latter, in case duplicate numbers are involved, keep on removing the duplicates as they are not involved in finding peaks UNLESS the duplicate values themselves are peaks, in which cease return the duplicate values.
- The latter variant of problems is called Rotated Arrays and the former is called Bitonic Arrays.
