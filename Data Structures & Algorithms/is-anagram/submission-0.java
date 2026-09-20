class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character , Integer> mpp = new HashMap<>();
        for(char c : s.toCharArray()){
            mpp.put(c,mpp.getOrDefault(c,0) +1);
        }
        for( char c : t.toCharArray()){
            if(!mpp.containsKey(c)){
                return false;
            }
            mpp.put(c , mpp.get(c)-1);
            if(mpp.get(c)==0){
                mpp.remove(c);
            }
        }
return mpp.isEmpty();
    }
}
