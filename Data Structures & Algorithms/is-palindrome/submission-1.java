class Solution {
    public boolean isPalindrome(String s) {

        HashMap<Integer, Character> map = new HashMap<>();

        int index = 0;

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                map.put(index++, Character.toLowerCase(c));
            }
        }

        int left = 0;
        int right = index - 1;

        while (left < right) {
            if (map.get(left) != map.get(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}