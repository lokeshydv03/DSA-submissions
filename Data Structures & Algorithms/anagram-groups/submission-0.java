class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> mpp = new HashMap<>();
        for(String str : strs){
            char[] chars= str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!mpp.containsKey(key)){
                mpp.put(key, new ArrayList<>());
            }
            mpp.get(key).add(str);
        }
        return new ArrayList<>(mpp.values());
    }
}
