public class maximumrepet {
    public static void main(String[] args) {
        String sequence = "ababc",
                 word = "ab";

        int count = 0;
        if (word.contains(sequence)) {
            count++;
        }
        System.out.println(count);
    }
}
