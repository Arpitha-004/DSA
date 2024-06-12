class Solution {
    public int countVowelSubstrings(String word) {
        int n = word.length();
        int count = 0;
        
        // Traverse the string to find all vowel-only substrings
        for (int i = 0; i < n; i++) {
            // Skip if the starting character is not a vowel
            if (!isVowel(word.charAt(i))) {
                continue;
            }
            
            Set<Character> currentVowels = new HashSet<>();
            
            for (int j = i; j < n; j++) {
                char c = word.charAt(j);
                
                // Stop if the character is not a vowel
                if (!isVowel(c)) {
                    break;
                }
                
                // Add the vowel to the current set
                currentVowels.add(c);
                
                // Check if all vowels are present
                if (currentVowels.size() == 5) {
                    count++;
                }
            }
        }
        
        return count;

    }
     private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}