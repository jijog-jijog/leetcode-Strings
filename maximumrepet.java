public class maximumrepet {
    public static void main(String[] args) {
        String sequence = "ababc",
                 word = "ab";
        StringBuilder build = new StringBuilder(word);

        int count = 0;
        while (count < sequence.length()) {
             if (build.toString().contains(sequence)) {
            count++;
            build.append(word);
            break;
        }
        }
       
        System.out.println(count);
    }
}
