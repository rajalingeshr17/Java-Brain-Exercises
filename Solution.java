class Solution {
    public static  int lengthOfLongestSubstring(String s) {
        int longestLength=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){

                String subStr=s.substring(i,j);
                boolean isUnique = true;
                for (int k = 0; k < subStr.length(); k++) {
                    for (int l = k + 1; l < subStr.length(); l++) {
                        if (subStr.charAt(k) == subStr.charAt(l)) {
                            isUnique = false;
                            break;
                        }
                    }
                if (!isUnique) break;
                }

                if (isUnique && subStr.length()>longestLength) {
                    System.out.println(subStr);
                    longestLength=subStr.length();
                }
            }
        }
        System.out.println(longestLength);
        return longestLength;
    }
    public static void main(String[] args) {
        lengthOfLongestSubstring("abacdeaf");
    }
}