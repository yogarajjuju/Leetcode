class Solution {
    public int hammingWeight(int n) {
        int set=1;
        while(n>1)
{
    if(n%2==1)
    set++;
    n/=2;
}
return set;
    }

}