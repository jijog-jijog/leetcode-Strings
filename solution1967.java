public class solution1967 {
    public static void main(String[] args) {
        String[] patterns = {"a","b","c"};
        String word = "aaaaabbbbb";
        
        int count = 0;
        for(String a : patterns){
             if (word.contains(a)) {
                count++;
             }
            
            // System.out.println(a);
            
        }
        System.out.println(count);
  }
  
}

