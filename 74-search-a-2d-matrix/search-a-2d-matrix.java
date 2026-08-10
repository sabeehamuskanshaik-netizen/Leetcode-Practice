class Solution {
    public boolean searchInRow(int[][] mat,int c,int row,int target){
        int l=0;
        int h=c-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(mat[row][mid]==target){
                return true;
            }else if(mat[row][mid]<target){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
       int l=0;
        int h=r-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(target>=matrix[mid][0] && target<=matrix[mid][c-1]){
                //search inside this one
                return searchInRow(matrix,c,mid,target);
            }else if(target>matrix[mid][c-1]){
                l=mid+1;
            }else if(target<matrix[mid][0]){
                h=mid-1;
            }
        }
        return false;
        
    }
}