public class longpressed925 {
    public static void main(String[] args) {
        
        String name = "alex";
        String typed = "aaleex";

        boolean ans = false;
        for(int i =0; i<name.length(); i++){
            char ch = name.charAt(i);
            for(int j=0; j<typed.length();j++){
                char ty = typed.charAt(j);
                if (ch == ty) {
                    ans = true;
                }
            }
        }
        
    }
}
