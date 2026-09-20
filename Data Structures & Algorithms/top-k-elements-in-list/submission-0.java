class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int num : nums){
            mpp.put(num, mpp.getOrDefault(num,0)+1);
        }
        int[] result = new int[k];
        for(int i =0 ;i<k;i++){
            int maxfreq = 0;
            int maxElement = 0;

            for(int num : mpp.keySet()){
                if(mpp.get(num)> maxfreq){
                    maxfreq = mpp.get(num);
                    maxElement = num;
                }
            }
            result[i]= maxElement ;
            mpp.remove(maxElement);
        }
        return result;
        
    }
}
