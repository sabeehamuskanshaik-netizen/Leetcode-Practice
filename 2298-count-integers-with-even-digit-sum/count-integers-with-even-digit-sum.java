class Solution {
    public boolean Sum(int num){
        int s=0;
        while(num!=0){
            int dig=num%10;
            s+=dig;
            num=num/10;
        }
        if(s%2==0){
            return true;
        }
        return false;
    }
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
            if(Sum(i)){
                count++;
            }


        }
        return count;
        
    }
}