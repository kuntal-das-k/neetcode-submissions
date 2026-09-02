class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        // Convert strings to character arrays
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        // Sort both arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        // Compare the sorted arrays
        return Arrays.equals(sArray, tArray);
    }
}