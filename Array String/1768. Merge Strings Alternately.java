class Solution {
    public String mergeAlternately(String w1, String w2) {
        int length1 = w1.length();
        int length2 = w2.length();
        int maxLength = Math.max(length1, length2);
        StringBuilder res = new StringBuilder(maxLength);

        for (int i = 0; i < maxLength; i++) {
            if (i < length1) {
                res.append(w1.charAt(i));
            }
            if (i < length2) {
                res.append(w2.charAt(i));
            }
        }

        return res.toString();
    }
}
