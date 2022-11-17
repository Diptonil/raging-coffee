package com.ragingcoffee.problemsolving;

// https://leetcode.com/problems/unique-paths/
public final class Leetcode62 {
    
    public int uniquePaths(int m, int n) {
        int[][] answer = new int[m][n];
        int i = 0;
        int j = 0;
        
        for (i = 0; i < m; i ++) {
            for (j = 0; j < n; j ++) {
                if (i == 0 || j == 0) {
                    answer[i][j] = 1;
                } else {
                    answer[i][j] = answer[i - 1][j] + answer[i][j - 1];
                }
            }
        }
        
        return answer[i - 1][j - 1];
    }
}
