class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0,sum=0;
        java.util.HashMap<Integer,Integer>map=new java.util.HashMap<>();
        map.put(0,1);
        for(int num:nums){
            sum+=num;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
