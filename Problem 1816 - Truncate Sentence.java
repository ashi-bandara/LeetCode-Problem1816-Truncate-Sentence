class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        String truncatedSentence = "";

        for (int i = 0; i < k; i++) {
            truncatedSentence = truncatedSentence + " " + words[i];
        }
        return truncatedSentence.substring(1);
    }
}