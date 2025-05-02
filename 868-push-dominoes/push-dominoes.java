class Solution {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        int [] force = new int [n];
        int f = 0;
        for(int i =0 ; i<n; i++){
            if(dominoes.charAt(i)=='R'){
                f =n;
            } else if (dominoes.charAt(i)=='L'){
                f = 0;

            }  else{
                f= Math.max(f-1,0);
            }
            force[i] +=f;
        }
        f= 0;
        for(int i = n-1;i>=0;i--){
            if(dominoes.charAt(i)=='L'){
                f = n;
            } else if (dominoes.charAt(i)=='R'){
                f =0;

            } else{
                f = Math.max(f-1,0);
            }
            force[i] -=f;

        }
        StringBuilder result = new StringBuilder();
        for(int i =0; i<n; i++){
            if(force[i]>0){
                result.append('R');
            } else if(force[i]<0){
                result.append('L');
            } else{
                result.append('.');
            }
        }
        return result.toString();
        
    }
}