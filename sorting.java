public class sorting {
    public static void main(String[] args) {
        
        String s = s = "is2 sentence4 This1 a3";

         String[] words = s.split(" ");                     // Step 1: Split words
        String[] result = new String[words.length];        // Step 2: Prepare result array

        for (String word : words) {
            int len = word.length();
            int pos = word.charAt(len - 1) - '0';          // Step 3: Get position
            result[pos - 1] = word.substring(0, len - 1);  // Step 4: Remove digit and place
        }

        return String.join(" ", result);     
    }
}
