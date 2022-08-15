# Leetcode Problems

The link of the corresponding problem is commented for all programs. In most cases, I think I have come up with fairly acceptable solutions that passes 100% of the test cases.


## Peaks in Array Mountains

The peak may be ascending->descending or ascending->ascending (after a steep fall). No further cases exist, generally.
- For the former, run binary search twice - first for the ascending subpart of the array and second for the descending subpart of the array.
- For the latter, we have to find the pivot after which the dip in sort occurs (element > element + 1).
- For the latter, in case duplicate numbers are involved, keep on removing the duplicates as they are not involved in finding peaks UNLESS the duplicate values themselves are peaks, in which cease return the duplicate values.
- The latter variant of problems is called Rotated Arrays and the former is called Bitonic Arrays.
