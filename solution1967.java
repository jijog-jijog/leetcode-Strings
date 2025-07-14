public class solution1967 {
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        
        int count = 0;
        for(String a : patterns){
            for(int i=0; i<word.length(); i++){
                char ch = word.charAt(i);
                char ah = a.charAt(i);
                
                if (ch == ah) {
                    count = count + 1;
                    break;
                }
            }
            // System.out.println(a);
            
        }
        System.out.println(count);
    }
}
