public class maximumrepet {
    public static void main(String[] args) {
        String sequence = "ababc",
                 word = "ba";
        StringBuilder build = new StringBuilder(word);

        int count = 0;
        while (sequence.contains(build.toString())) {
            count++;
            build.append(word);

        
        }
       
        System.out.println(count);
    }
}
