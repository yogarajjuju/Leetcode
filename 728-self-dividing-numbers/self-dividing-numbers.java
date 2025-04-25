class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List <Integer> result = new ArrayList<>();
        for(int num = left;num<=right;num++){
            if(isSelfdivide(num)){
                result.add(num);
            }
            
        }
        return result;

    }
    public boolean isSelfdivide (int num){
        int original = num;
        while(num>0){
            int digit = num % 10;
            if(digit == 0|| original %digit!=0){
                return false;
            }
            num/=10;

        }
        return true;
    }
}