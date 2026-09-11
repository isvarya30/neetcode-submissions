class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int num:nums){
            hash.put(num,hash.getOrDefault(num,0)+1);
        }
        for(int n:hash.keySet()){
        if(hash.get(n)>1){
            return true;
        }}
        return false;
    }
}