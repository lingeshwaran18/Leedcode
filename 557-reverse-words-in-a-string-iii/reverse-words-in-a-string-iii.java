class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            ans.append(sb).append(" ");
        }
        return ans.toString().trim();
    }
}