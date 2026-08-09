class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Binary search to find the possible row
        int l = 0;
        int h = rows - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (target >= matrix[mid][0] && target <= matrix[mid][cols - 1]) {
                
                // Binary search inside this row
                int left = 0;
                int right = cols - 1;

                while (left <= right) {
                    int m = left + (right - left) / 2;

                    if (matrix[mid][m] == target) {
                        return true;
                    } else if (matrix[mid][m] < target) {
                        left = m + 1;
                    } else {
                        right = m - 1;
                    }
                }

                return false;
            } 
            else if (target > matrix[mid][cols - 1]) {
                l = mid + 1;
            } 
            else {
                h = mid - 1;
            }
        }

        return false;
    }
}